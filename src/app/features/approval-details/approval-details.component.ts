import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ApprovalDetails } from '../../models/approval-details.model';
import { NGXLogger } from 'ngx-logger';
import { Router } from '@angular/router';

@Component({
  selector: 'app-approval-details',
  templateUrl: './approval-details.component.html',
  styleUrls: ['./approval-details.component.css']
})
export class ApprovalDetailsComponent implements OnInit {
  approvalRecords: ApprovalDetails[] = [];
  displayedRecords: ApprovalDetails[] = [];
  currentPage: number = 0;
  recordsPerPage: number = 8;

  constructor(private http: HttpClient, private logger: NGXLogger, private router: Router) {}

  ngOnInit(): void {
    this.fetchApprovalRecords();
  }

  fetchApprovalRecords(): void {
    this.http.get<ApprovalDetails[]>('api/approval-records').subscribe(
      (data) => {
        this.approvalRecords = data;
        this.updateDisplayedRecords();
      },
      (error) => {
        this.logger.error('Error fetching approval records', error);
      }
    );
  }

  updateDisplayedRecords(): void {
    const start = this.currentPage * this.recordsPerPage;
    const end = start + this.recordsPerPage;
    this.displayedRecords = this.approvalRecords.slice(start, end);
  }

  onExit(): void {
    this.router.navigate(['/']);
  }

  onScroll(event: any): void {
    if (event.target.offsetHeight + event.target.scrollTop >= event.target.scrollHeight) {
      this.currentPage++;
      this.updateDisplayedRecords();
    }
  }
}
