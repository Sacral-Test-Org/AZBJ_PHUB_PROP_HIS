import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ScrutinyStatusModel } from '../models/scrutiny-status.model';

@Injectable({
  providedIn: 'root'
})
export class ScrutinyStatusService {
  private apiUrl = 'http://your-backend-api-url/scrutiny-status';

  constructor(private http: HttpClient) { }

  getScrutinyStatus(): Observable<ScrutinyStatusModel> {
    return this.http.get<ScrutinyStatusModel>(this.apiUrl);
  }
}
