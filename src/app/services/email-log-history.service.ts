import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmailLogHistory } from '../models/email-log-history.model';

@Injectable({
  providedIn: 'root'
})
export class EmailLogHistoryService {
  private apiUrl = 'http://localhost:8080/api/email-log-history';

  constructor(private http: HttpClient) { }

  getEmailLogs(): Observable<EmailLogHistory[]> {
    return this.http.get<EmailLogHistory[]>(this.apiUrl);
  }

  updateEmailStatus(emailLog: EmailLogHistory): Observable<EmailLogHistory> {
    return this.http.put<EmailLogHistory>(`${this.apiUrl}/${emailLog.id}`, emailLog);
  }
}
