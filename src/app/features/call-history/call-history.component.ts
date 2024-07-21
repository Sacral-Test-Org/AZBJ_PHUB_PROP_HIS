import { Component, OnInit } from '@angular/core';
import { CallHistoryService } from 'src/app/services/call-history.service';
import { CallHistory } from 'src/app/models/call-history.model';

@Component({
  selector: 'app-call-history',
  templateUrl: './call-history.component.html',
  styleUrls: ['./call-history.component.css']
})
export class CallHistoryComponent implements OnInit {
  callHistories: CallHistory[] = [];

  constructor(private callHistoryService: CallHistoryService) { }

  ngOnInit(): void {
    this.fetchCallHistory();
  }

  fetchCallHistory(): void {
    this.callHistoryService.getCallHistory().subscribe((data: CallHistory[]) => {
      this.callHistories = data;
    });
  }
}
