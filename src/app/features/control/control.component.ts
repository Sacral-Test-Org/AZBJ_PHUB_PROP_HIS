import { Component, OnInit } from '@angular/core';
import { ControlService } from 'src/app/services/control.service';
import { ControlModel, ReasonComment, TeleVerificationHistory, CentralCallHistory, ScrutinyStatus, RequirementDetails, EmailLogHistory, EiaDetails } from 'src/app/models/control.model';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-control',
  templateUrl: './control.component.html',
  styleUrls: ['./control.component.css']
})
export class ControlComponent implements OnInit {
  constructor(private controlService: ControlService, private router: Router) {}

  ngOnInit(): void {
    this.controlService.getApplicationData('applicationNo').subscribe((data: ControlModel) => {
      // Logic to update visibility of control block items based on user role and application data
    });
  }

  viewStatus(): void {
    this.controlService.getStatus().subscribe((status) => {
      // Logic to display status information
    });
  }

  clearFields(): void {
    // Logic to clear all input fields
  }

  viewPANApprovedDetails(): void {
    this.controlService.getPANApprovedDetails().subscribe((details) => {
      // Logic to display PAN approved details
    });
  }

  cancel(): void {
    // Logic to cancel the current operation
  }

  exit(): void {
    // Logic to exit the interface
  }

  viewTeleVerificationHistory(): void {
    this.controlService.getTeleVerificationHistory().subscribe((history) => {
      // Logic to display tele-verification history
    });
  }

  viewEIADetails(): void {
    this.controlService.getEIADetails().subscribe((details) => {
      // Logic to display EIA details
    });
  }

  viewMedicalStatus(): void {
    this.controlService.getMedicalStatus().subscribe((status) => {
      // Logic to display medical status
    });
  }

  downloadInformation(): void {
    this.controlService.downloadInformation().subscribe((response) => {
      // Logic to handle download information
    });
  }

  viewEmailLog(): void {
    this.controlService.getEmailLog().subscribe((log) => {
      // Logic to display email log
    });
  }

  viewDELinkedReasons(): void {
    this.controlService.getDELinkedReasons().subscribe((reasons) => {
      // Logic to display DE linked reasons
    });
  }

  viewRequirementDetails(): void {
    this.controlService.getRequirementDetails().subscribe((details) => {
      // Logic to display requirement details
    });
  }

  viewUWDetails(): void {
    this.controlService.getUWDetails().subscribe((details) => {
      // Logic to display UW (NonConfidential) details
    });
  }

  formatReceiptNumber(receiptNumber: string): string {
    if (receiptNumber.length < 10) {
      receiptNumber = receiptNumber.padStart(10, '0');
    }
    this.moveToPropertyNumberField();
    return receiptNumber;
  }

  moveToPropertyNumberField(): void {
    // Logic to move the cursor to the property number field
  }

  navigateToNextItem(): void {
    // Logic to navigate to the next item in the form
  }

  onKeyPress(event: KeyboardEvent): void {
    if (event.key === 'Enter') {
      this.navigateToNextItem();
    }
  }

  focusNextField(): void {
    // Logic to shift the focus to the "Scrutiny Number" field
  }

  onProposalNumberKeyPress(event: KeyboardEvent): void {
    if (event.key === 'Enter') {
      this.focusNextField();
    }
  }

  exitFormHandler(): void {
    this.router.navigate(['/previous-screen']);
  }

  onExitButtonClick(): void {
    this.router.navigate(['/tele-verification-history']);
  }

  onDeLinkedReasonsButtonClick(): void {
    this.controlService.fetchReasonComments('applicationNumber').subscribe((comments: ReasonComment[]) => {
      this.populateReasonComments(comments);
    });
  }

  populateReasonComments(reasonComments: ReasonComment[]): void {
    // Logic to populate the reason-comments component with the fetched reason comments
  }

  onPanApprovedDetailsClick(): void {
    const applicationNumber = 'applicationNumber'; // Replace with actual application number
    if (applicationNumber) {
      this.controlService.getPanApprovalDetails(applicationNumber).subscribe((details: ControlModel[]) => {
        this.displayApprovalDetails(details);
      });
    } else {
      // Display message prompting the user to enter the search criteria
    }
  }

  displayApprovalDetails(approvalDetails: ControlModel[]): void {
    // Logic to display the approval details in the designated area in the HTML template
  }

  fetchTeleVerificationHistory(): void {
    this.controlService.getTeleVerificationHistory('applicationNo').subscribe((history: TeleVerificationHistory[]) => {
      // Logic to update the tele-verification-history component with the fetched data
    });
  }

  fetchCentralCallHistory(): void {
    this.controlService.getCentralCallHistory('applicationNo', 'proposalNo').subscribe((history: CentralCallHistory[]) => {
      // Logic to update the central-call-history component with the fetched data
    });
  }

  clearFormHandler(): void {
    // Logic to clear the form without validation
    // Hide specific fields if they are visible
    // Set the 'PHOD' field to null
    // Move focus to the 'REASON_COMMENTS.EXIT' field and execute 'WHEN-BUTTON-PRESSED' trigger
  }

  onExitButtonClick(): void {
    this.router.navigate(['/medical-status']);
    // Logic to hide the call history view
  }

  onFetchRequirementDetails(): void {
    const proposalNumber = 'proposalNumber'; // Replace with actual proposal number
    if (!proposalNumber) {
      alert('Please enter the proposal number');
      return;
    }
    this.controlService.getRequirementDetails(proposalNumber).subscribe((details: RequirementDetails[]) => {
      // Logic to update the UI with the retrieved data
    });
  }

  navigateToUWSection(): void {
    this.controlService.clearUWSection();
    // Logic to navigate to the 'uw' section and clear any existing data
  }

  fetchCommentsAndRemarks(applicationNumber: string, policyNumber: string): void {
    this.controlService.getCommentsAndRemarks(applicationNumber, policyNumber).subscribe((data) => {
      // Logic to handle comments and remarks data
    });
  }

  onScrutinyStatusClick(): void {
    this.controlService.getScrutinyStatus('applicationNo').subscribe((status: ScrutinyStatus[]) => {
      // Logic to navigate to the scrutiny status view
    });
  }

  handleKeyPressEvent(event: KeyboardEvent): void {
    if (event.key === 'Enter') {
      this.router.navigate(['/search-functionality']);
    }
  }

  exitEmailLogDetailsView(): void {
    // Logic to hide the email log details view
    this.router.navigate(['/main-control-screen']);
  }

  onDownloadButtonClick(): void {
    this.controlService.downloadActivityTrackerData().subscribe((response) => {
      // Logic to notify the user and open the downloaded file
    });
  }

  validateAndRetrieveApplicationNumber(biNumber: string): void {
    if (biNumber) {
      this.controlService.getApplicationNumberByBiNumber(biNumber).subscribe((applicationNumber: string) => {
        // Logic to display the application number if found, otherwise leave the field empty
      });
    }
  }

  onProposalMedicalStatusClick(): void {
    this.controlService.clearCustomerCallHistory();
    this.controlService.getProposalMedicalStatus().subscribe((status) => {
      // Logic to update the Customer Call History section with the retrieved data
    });
    this.router.navigate(['/customer-call-history']);
  }

  onSearch(searchCriteria: any): void {
    this.controlService.searchApplications(searchCriteria).subscribe((applications: ControlModel[]) => {
      // Logic to handle the response and display application details
    });
  }

  fetchEmailLogHistory(applicationNumber: string, proposalNumber: string): void {
    if (!applicationNumber && !proposalNumber) {
      alert('Please enter Application Number or Proposal Number and press Status to proceed.');
      return;
    }
    this.controlService.getEmailLogHistory(applicationNumber, proposalNumber).subscribe((log: EmailLogHistory[]) => {
      // Logic to update the view with the fetched email log history
    });
  }

  onEiaDetailsButtonClick(): void {
    const applicationNumber = 'applicationNumber'; // Replace with actual application number
    this.controlService.fetchEiaDetails(applicationNumber).subscribe((details: EiaDetails) => {
      this.navigateToEiaDetails();
    });
  }

  navigateToEiaDetails(): void {
    // Logic to navigate to the EIA details view
  }

  checkProposalStatus(): boolean {
    // Logic to check the proposal status and return a boolean indicating whether the status is 'PROPOSAL UPDATED'
    return false;
  }

  updateEventDescriptionVisibility(): void {
    if (this.checkProposalStatus()) {
      this.controlService.getEventDescription().subscribe((description) => {
        // Logic to update the visibility of the event description field based on the proposal status
      });
    }
  }

  onExitButtonClick(): void {
    this.router.navigate(['/main-hub']);
    // Logic to set focus to the main control item in the hub details view
  }
}
