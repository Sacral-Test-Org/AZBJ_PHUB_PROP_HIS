import { Component, OnInit } from '@angular/core';
import { RequirementDetailsService } from 'src/app/services/requirement-details.service';
import { RequirementDetails } from 'src/app/models/requirement-details.model';

@Component({
  selector: 'app-requirement-details',
  templateUrl: './requirement-details.component.html',
  styleUrls: ['./requirement-details.component.css']
})
export class RequirementDetailsComponent implements OnInit {
  requirementDetails: RequirementDetails[] = [];

  constructor(private requirementDetailsService: RequirementDetailsService) { }

  ngOnInit(): void {
    this.getRequirementDetails();
  }

  getRequirementDetails(): void {
    this.requirementDetailsService.getRequirementDetails().subscribe(
      (data: RequirementDetails[]) => {
        this.requirementDetails = data;
      },
      (error) => {
        console.error('Error fetching requirement details', error);
      }
    );
  }

  handleUWSection(): void {
    // Logic to handle the display and formatting of the UW section
    // Including the scrollbar functionality
    // This is a placeholder for the actual implementation
  }
}
