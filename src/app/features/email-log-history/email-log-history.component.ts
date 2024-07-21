import { Component, OnInit } from '@angular/core';
import { EmailLogHistoryService } from 'src/app/services/email-log-history.service';
import { EmailLogHistory } from 'src/app/models/email-log-history.model';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-email-log-history',
  templateUrl: './email-log-history.component.html',
  styleUrls: ['./email-log-history.component.css']
})
export class EmailLogHistoryComponent implements OnInit {
  emailLogs: EmailLogHistory[] = [];
  displayedColumns: string[] = ['emailStatus', 'dateTimeSent', 'registeredEmailId', 'typeOfLetter', 'numberOfSuccessfulMails'];
  pageSize: number = 7;

  constructor(private emailLogHistoryService: EmailLogHistoryService) { }

  ngOnInit(): void {
    this.emailLogHistoryService.getEmailLogs().subscribe((data: EmailLogHistory[]) => {
      this.emailLogs = data;
    });
  }

  updateEmailStatus(emailLog: EmailLogHistory): void {
    this.emailLogHistoryService.updateEmailStatus(emailLog).subscribe((updatedLog: EmailLogHistory) => {
      const index = this.emailLogs.findIndex(log => log.id === updatedLog.id);
      if (index !== -1) {
        this.emailLogs[index] = updatedLog;
      }
    });
  }
}
