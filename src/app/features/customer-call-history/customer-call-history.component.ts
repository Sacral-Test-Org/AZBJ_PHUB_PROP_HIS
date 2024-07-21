import { Component, OnInit } from '@angular/core';
import { ControlService } from 'src/app/services/control.service';
import { ControlDTO } from 'src/app/models/control.dto';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { NGXLogger } from 'ngx-logger';

@Component({
  selector: 'app-customer-call-history',
  templateUrl: './customer-call-history.component.html',
  styleUrls: ['./customer-call-history.component.css']
})
export class CustomerCallHistoryComponent implements OnInit {
  callHistory: ControlDTO[] = [];
  errorMessage: string = '';

  constructor(private controlService: ControlService, private logger: NGXLogger) {}

  ngOnInit(): void {
    this.getProposalMedicalStatus();
  }

  getProposalMedicalStatus(): void {
    this.controlService.getProposalMedicalStatus()
      .pipe(
        catchError(error => {
          this.errorMessage = `Error: ${error.message}`;
          this.logger.error('Error fetching proposal medical status', error);
          throw error;
        })
      )
      .subscribe((data: ControlDTO[]) => {
        this.callHistory = data;
        if (this.callHistory.length > 0) {
          this.displayFirstRecord();
        }
      });
  }

  displayFirstRecord(): void {
    if (this.callHistory.length > 0) {
      const firstRecord = this.callHistory[0];
      // Logic to display the first record in the Customer Call History section
      // This can be done by binding the firstRecord to the HTML template
    }
  }
}
