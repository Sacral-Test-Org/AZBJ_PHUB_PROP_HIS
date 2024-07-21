import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EIA } from '../models/eia.model';

@Injectable({
  providedIn: 'root'
})
export class EIAService {
  private apiUrl = 'http://your-api-url/eia-process';

  constructor(private http: HttpClient) { }

  getEIAData(): Observable<EIA[]> {
    return this.http.get<EIA[]>(this.apiUrl);
  }
}