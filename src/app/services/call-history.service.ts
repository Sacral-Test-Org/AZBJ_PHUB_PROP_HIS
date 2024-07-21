import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CallHistory } from '../models/call-history.model';

@Injectable({
  providedIn: 'root'
})
export class CallHistoryService {
  private apiUrl = 'http://localhost:8080/api/call-history';

  constructor(private http: HttpClient) { }

  getCallHistory(): Observable<CallHistory[]> {
    return this.http.get<CallHistory[]>(this.apiUrl);
  }
}