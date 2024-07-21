import { Component } from '@angular/core';
import { ControlService } from 'src/app/services/control.service';
import { Control } from 'src/app/models/control.model';
import { Observable } from 'rxjs';
import { NGXLogger } from 'ngx-logger';

@Component({
  selector: 'app-search-application',
  templateUrl: './search-application.component.html',
  styleUrls: ['./search-application.component.css']
})
export class SearchApplicationComponent {
  searchResults: Control[] = [];
  errorMessage: string = '';

  constructor(private controlService: ControlService, private logger: NGXLogger) {}

  onSearch(searchCriteria: any): void {
    // Validate input
    if (!searchCriteria.applicationNumber && !searchCriteria.receiptNumber && !searchCriteria.proposalNumber && !searchCriteria.scrutinyNumber && !searchCriteria.biNumber) {
      this.errorMessage = 'At least one search criterion must be provided.';
      return;
    }

    // Pad application number to 10 characters if provided
    if (searchCriteria.applicationNumber) {
      searchCriteria.applicationNumber = searchCriteria.applicationNumber.padStart(10, '0');
    }

    // Call the service method to fetch application details
    this.controlService.searchApplications(searchCriteria).subscribe(
      (data: Control[]) => {
        if (data.length > 0) {
          this.searchResults = data;
          this.errorMessage = '';
        } else {
          this.errorMessage = 'No records found for the provided search criteria.';
        }
      },
      (error) => {
        this.logger.error('Error fetching application details', error);
        this.errorMessage = 'An error occurred while fetching application details. Please try again later.';
      }
    );
  }
}
