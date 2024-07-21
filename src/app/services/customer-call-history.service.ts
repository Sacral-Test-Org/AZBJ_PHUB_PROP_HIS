import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { CustomerCallHistoryModel } from 'src/app/models/customer-call-history.model';

@Injectable({
  providedIn: 'root'
})
export class CustomerCallHistoryService {
  private apiUrl = 'http://your-backend-api-url/api/customer-call-history';

  constructor(private http: HttpClient) {}

  getCustomerCallHistory(): Observable<CustomerCallHistoryModel[]> {
    return this.http.get<CustomerCallHistoryModel[]>(this.apiUrl).pipe(
      map(response => response.map(item => new CustomerCallHistoryModel(item)))
    );
  }
}