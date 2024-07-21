import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ControlService } from 'src/app/services/control.service';
import { ScrutinyStatus } from 'src/app/models/scrutiny-status.model';

@Component({
  selector: 'app-scrutiny-status',
  templateUrl: './scrutiny-status.component.html',
  styleUrls: ['./scrutiny-status.component.css']
})
export class ScrutinyStatusComponent implements OnInit {
  scrutinyStatuses: ScrutinyStatus[] = [];
  applicationNo: string = 'currentApplicationNo'; // This should be dynamically set based on the current application

  constructor(private controlService: ControlService, private router: Router) {}

  ngOnInit(): void {
    this.getScrutinyStatus();
  }

  getScrutinyStatus(): void {
    this.controlService.getScrutinyStatus(this.applicationNo).subscribe(
      (data: ScrutinyStatus[]) => {
        this.scrutinyStatuses = data;
      },
      (error) => {
        console.error('Error fetching scrutiny status', error);
      }
    );
  }

  exit(): void {
    this.router.navigate(['/status-tracking']);
  }
}
