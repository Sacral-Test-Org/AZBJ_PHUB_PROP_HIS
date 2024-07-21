import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ReasonCommentsService } from 'src/app/services/reason-comments.service';
import { ReasonCommentsModel } from 'src/app/models/reason-comments.model';
import { ControlComponent } from 'src/app/features/control/control.component';

@Component({
  selector: 'app-reason-comments',
  templateUrl: './reason-comments.component.html',
  styleUrls: ['./reason-comments.component.css']
})
export class ReasonCommentsComponent implements OnInit {
  reasonCommentsForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private reasonCommentsService: ReasonCommentsService,
    private router: Router,
    private controlComponent: ControlComponent
  ) { }

  ngOnInit(): void {
    this.reasonCommentsForm = this.fb.group({
      reason: ['', [Validators.required, Validators.maxLength(100)]],
      comments: ['', [Validators.required, Validators.maxLength(500)]],
      userId: ['', [Validators.required, Validators.maxLength(50)]],
      commentDate: ['', [Validators.required, Validators.pattern(/^\d{2}\/\d{2}\/\d{2} \d{2}:\d{2} (AM|PM)$/)]]
    });
  }

  saveReasonComments(): void {
    if (this.reasonCommentsForm.valid) {
      const reasonComments: ReasonCommentsModel = this.reasonCommentsForm.value;
      this.reasonCommentsService.saveReasonComments(reasonComments).subscribe(
        response => {
          console.log('Reason comments saved successfully', response);
        },
        error => {
          console.error('Error saving reason comments', error);
        }
      );
    } else {
      console.error('Form is invalid');
    }
  }

  exitForm(): void {
    this.router.navigate(['/']);
  }

  viewDataEnrichment(): void {
    this.router.navigate(['/data-enrichment']);
  }

  onExitButtonClick(): void {
    document.getElementById('reason-comments-section').style.display = 'none';
    this.controlComponent.focusReceivedSearchControl();
  }
}