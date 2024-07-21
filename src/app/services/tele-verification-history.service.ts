import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TeleVerificationHistoryModel } from '../models/tele-verification-history.model';

@Injectable({
  providedIn: 'root'
})
export class TeleVerificationHistoryService {
  private baseUrl = 'http://your-api-url/tele-verification-history';

  constructor(private http: HttpClient) {}

  getHistory(): Observable<TeleVerificationHistoryModel[]> {
    return this.http.get<TeleVerificationHistoryModel[]>(`${this.baseUrl}/history`);
  }

  saveTeleVerificationHistory(teleVerificationHistory: TeleVerificationHistoryModel): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/save`, teleVerificationHistory);
  }

  fetchTeleVerificationHistory(): Observable<TeleVerificationHistoryModel[]> {
    return this.http.get<TeleVerificationHistoryModel[]>(`${this.baseUrl}/fetch`);
  }
}
