import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { TaskAssignmentService } from 'src/app/services/task-assignment.service';
import { TaskAssignment } from 'src/app/models/task-assignment.model';

@Component({
  selector: 'app-task-assignment',
  templateUrl: './task-assignment.component.html',
  styleUrls: ['./task-assignment.component.css']
})
export class TaskAssignmentComponent {
  taskAssignment: TaskAssignment = new TaskAssignment();

  constructor(
    private taskAssignmentService: TaskAssignmentService,
    private router: Router
  ) {}

  onSave(): void {
    this.taskAssignmentService.saveTaskAssignment(this.taskAssignment).subscribe(
      response => {
        console.log('Task assignment saved successfully', response);
      },
      error => {
        console.error('Error saving task assignment', error);
      }
    );
  }

  onExit(): void {
    this.router.navigate(['/']);
  }
}
