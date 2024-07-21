import { Component, OnInit } from '@angular/core';
import { TeleVerificationHistoryService } from 'src/app/services/tele-verification-history.service';
import { TeleVerificationHistory } from 'src/app/models/tele-verification-history.model';

@Component({
  selector: 'app-tele-verification-history',
  templateUrl: './tele-verification-history.component.html',
  styleUrls: ['./tele-verification-history.component.css']
})
export class TeleVerificationHistoryComponent implements OnInit {
  teleVerificationHistories: TeleVerificationHistory[] = [];

  constructor(private teleVerificationHistoryService: TeleVerificationHistoryService) { }

  ngOnInit(): void {
    this.fetchTeleVerificationHistory();
  }

  saveTeleVerificationHistory(teleVerificationHistory: TeleVerificationHistory): void {
    this.teleVerificationHistoryService.saveTeleVerificationHistory(teleVerificationHistory).subscribe(
      response => {
        console.log('Tele-verification history saved successfully', response);
        this.fetchTeleVerificationHistory();
      },
      error => {
        console.error('Error saving tele-verification history', error);
      }
    );
  }

  fetchTeleVerificationHistory(): void {
    this.teleVerificationHistoryService.getHistory().subscribe(
      (data: TeleVerificationHistory[]) => {
        this.teleVerificationHistories = data;
      },
      error => {
        console.error('Error fetching tele-verification history', error);
      }
    );
  }
}
