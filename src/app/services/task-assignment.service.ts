import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TaskAssignment } from '../models/task-assignment.model';

@Injectable({
  providedIn: 'root'
})
export class TaskAssignmentService {
  private apiUrl = 'http://your-api-url.com/task-assignments'; // Placeholder URL

  constructor(private http: HttpClient) { }

  saveTaskAssignment(taskAssignment: TaskAssignment): Observable<any> {
    // Placeholder for future API integration
    return this.http.post<any>(this.apiUrl, taskAssignment);
  }
}
