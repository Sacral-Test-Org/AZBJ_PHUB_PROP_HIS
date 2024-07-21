import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NGXLogger } from 'ngx-logger';

@Component({
  selector: 'app-uw-section',
  templateUrl: './uw-section.component.html',
  styleUrls: ['./uw-section.component.css']
})
export class UWSectionComponent implements OnInit {
  uwRecords: string[] = [];
  displayRecords: string[] = [];
  currentIndex: number = 0;
  readonly maxRecords: number = 6;

  constructor(private http: HttpClient, private logger: NGXLogger) {}

  ngOnInit(): void {
    this.fetchUWRecords();
  }

  fetchUWRecords(): void {
    this.http.get<string[]>('api/uw-records').subscribe(
      (data) => {
        this.uwRecords = data;
        this.updateDisplayRecords();
      },
      (error) => {
        this.logger.error('Failed to fetch UW records', error);
      }
    );
  }

  updateDisplayRecords(): void {
    this.displayRecords = this.uwRecords.slice(this.currentIndex, this.currentIndex + this.maxRecords);
  }

  handleScroll(event: any): void {
    const element = event.target;
    if (element.scrollHeight - element.scrollTop === element.clientHeight) {
      if (this.currentIndex + this.maxRecords < this.uwRecords.length) {
        this.currentIndex += this.maxRecords;
        this.updateDisplayRecords();
      }
    } else if (element.scrollTop === 0) {
      if (this.currentIndex - this.maxRecords >= 0) {
        this.currentIndex -= this.maxRecords;
        this.updateDisplayRecords();
      }
    }
  }

  handleUWField(): void {
    // Logic to handle the display and formatting of the UW field
    this.updateDisplayRecords();
  }
}
