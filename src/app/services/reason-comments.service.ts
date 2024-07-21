import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ReasonCommentsModel } from '../models/reason-comments.model';

@Injectable({
  providedIn: 'root'
})
export class ReasonCommentsService {
  private apiUrl = 'http://your-api-url.com/api/reason-comments';

  constructor(private http: HttpClient) { }

  saveReasonComments(reasonComments: ReasonCommentsModel): Observable<any> {
    return this.http.post<any>(this.apiUrl, reasonComments);
  }
}
