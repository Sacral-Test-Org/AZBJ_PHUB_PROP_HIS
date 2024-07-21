import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ri-assigned',
  templateUrl: './ri-assigned.component.html',
  styleUrls: ['./ri-assigned.component.css']
})
export class RiAssignedComponent {
  viewHidden: boolean = false;

  constructor(private router: Router) {}

  onExitButtonClick(): void {
    this.viewHidden = true; // Hide the current view
    this.router.navigate(['/search-control']); // Navigate to the search control screen
  }
}
