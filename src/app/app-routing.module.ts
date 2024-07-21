import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ControlComponent } from './features/control/control.component';
import { TeleVerificationHistoryComponent } from './features/tele-verification-history/tele-verification-history.component';
import { MedicalStatusComponent } from './features/medical-status/medical-status.component';
import { ScrutinyStatusComponent } from './features/control/scrutiny-status/scrutiny-status.component';
import { SearchControlComponent } from './features/search-control/search-control.component';
import { EmailLogHistoryComponent } from './features/email-log-history/email-log-history.component';
import { CustomerCallHistoryComponent } from './features/customer-call-history/customer-call-history.component';
import { EiaDetailsComponent } from './features/eia-details/eia-details.component';
import { TaskAssignmentComponent } from './features/task-assignment/task-assignment.component';
import { CallHistoryComponent } from './features/call-history/call-history.component';
import { RequirementDetailsComponent } from './features/requirement-details/requirement-details.component';
import { ApprovalDetailsComponent } from './features/approval-details/approval-details.component';
import { UWComponent } from './features/uw/uw.component';
import { StatusTrackingComponent } from './features/status-tracking/status-tracking.component';
import { ReasonCommentsComponent } from './features/reason-comments/reason-comments.component';
import { DataEnrichFormComponent } from './features/data-enrich-form/data-enrich-form.component';

const routes: Routes = [
  { path: 'control', component: ControlComponent },
  { path: 'tele-verification-history', component: TeleVerificationHistoryComponent },
  { path: 'medical-status', component: MedicalStatusComponent },
  { path: 'scrutiny-status', component: ScrutinyStatusComponent },
  { path: 'search-control', component: SearchControlComponent },
  { path: 'email-log-history', component: EmailLogHistoryComponent },
  { path: 'customer-call-history', component: CustomerCallHistoryComponent },
  { path: 'eia-details', component: EiaDetailsComponent },
  { path: 'task-assignment', component: TaskAssignmentComponent },
  { path: 'call-history', component: CallHistoryComponent },
  { path: 'requirement-details', component: RequirementDetailsComponent },
  { path: 'approval-details', component: ApprovalDetailsComponent },
  { path: 'uw', component: UWComponent },
  { path: 'status-tracking', component: StatusTrackingComponent },
  { path: 'reason-comments', component: ReasonCommentsComponent },
  { path: 'azbj_data_enrich_form', component: DataEnrichFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
  navigate(route: string): void {
    // Logic to navigate to the specified route
  }

  configureRoutes(): void {
    // Logic to configure routes
  }

  navigateToMainHub(): void {
    // Logic to navigate to the main hub details view
  }
}