import { Component, OnInit } from '@angular/core';
import { ControlService } from 'src/app/services/control.service';
import { ReasonComment } from 'src/app/models/control.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-reason-comments',
  templateUrl: './reason-comments.component.html',
  styleUrls: ['./reason-comments.component.css']
})
export class ReasonCommentsComponent implements OnInit {
  reasonComments: ReasonComment[] = [];
  applicationNumber: string = '12345'; // Example application number, replace with actual logic to get the application number

  constructor(private controlService: ControlService, private router: Router) {}

  ngOnInit(): void {
    this.fetchReasonComments();
  }

  fetchReasonComments(): void {
    this.controlService.fetchReasonComments(this.applicationNumber).subscribe(
      (comments: ReasonComment[]) => {
        this.populateReasonComments(comments);
      },
      (error) => {
        console.error('Error fetching reason comments', error);
      }
    );
  }

  populateReasonComments(reasonComments: ReasonComment[]): void {
    this.reasonComments = reasonComments;
    // Logic to navigate to the first record in the Reason Comments section
    if (this.reasonComments.length > 0) {
      this.focusAndTrigger();
    }
  }

  focusAndTrigger(): void {
    // Logic to move focus to the 'REASON_COMMENTS.EXIT' field and execute 'WHEN-BUTTON-PRESSED' trigger
    const exitField = document.getElementById('REASON_COMMENTS.EXIT');
    if (exitField) {
      exitField.focus();
      // Simulate the 'WHEN-BUTTON-PRESSED' trigger
      exitField.click();
    }
  }

  handleViewDataEnrichment(): void {
    const params = {
      APPLICATION_NO: this.applicationNumber,
      call_form_name: 'STATUS_QUERY_SCREEN'
    };
    this.router.navigate(['/azbj_data_enrich_form'], { queryParams: params });
  }
}
