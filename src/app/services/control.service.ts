import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ControlModel, Status, PANDetails, TeleVerificationHistory, EIADetails, MedicalStatus, EmailLog, DELinkedReasons, RequirementDetails, UWDetails, ReasonComment, ScrutinyStatus, ControlDTO, CentralCallHistory, EventDescription } from '../models/control.model';

@Injectable({
  providedIn: 'root'
})
export class ControlService {
  private apiUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  getApplicationData(applicationNo: string): Observable<ControlModel> {
    return this.http.get<ControlModel>(`${this.apiUrl}/application/${applicationNo}`);
  }

  getControlData(): Observable<ControlModel[]> {
    return this.http.get<ControlModel[]>(`${this.apiUrl}/control-data`);
  }

  getStatus(): Observable<Status[]> {
    return this.http.get<Status[]>(`${this.apiUrl}/status`);
  }

  getPANApprovedDetails(): Observable<PANDetails[]> {
    return this.http.get<PANDetails[]>(`${this.apiUrl}/pan-approved-details`);
  }

  getTeleVerificationHistory(): Observable<TeleVerificationHistory[]> {
    return this.http.get<TeleVerificationHistory[]>(`${this.apiUrl}/tele-verification-history`);
  }

  getEIADetails(): Observable<EIADetails[]> {
    return this.http.get<EIADetails[]>(`${this.apiUrl}/eia-details`);
  }

  getMedicalStatus(): Observable<MedicalStatus[]> {
    return this.http.get<MedicalStatus[]>(`${this.apiUrl}/medical-status`);
  }

  downloadInformation(): Observable<Blob> {
    return this.http.get(`${this.apiUrl}/download-information`, { responseType: 'blob' });
  }

  getEmailLog(): Observable<EmailLog[]> {
    return this.http.get<EmailLog[]>(`${this.apiUrl}/email-log`);
  }

  getDELinkedReasons(): Observable<DELinkedReasons[]> {
    return this.http.get<DELinkedReasons[]>(`${this.apiUrl}/de-linked-reasons`);
  }

  getRequirementDetails(): Observable<RequirementDetails[]> {
    return this.http.get<RequirementDetails[]>(`${this.apiUrl}/requirement-details`);
  }

  getUWDetails(): Observable<UWDetails[]> {
    return this.http.get<UWDetails[]>(`${this.apiUrl}/uw-details`);
  }

  fetchReasonComments(applicationNumber: string): Observable<ReasonComment[]> {
    return this.http.get<ReasonComment[]>(`${this.apiUrl}/reason-comments/${applicationNumber}`);
  }

  getPanApprovalDetails(applicationNumber: string): Observable<ControlModel[]> {
    return this.http.get<ControlModel[]>(`${this.apiUrl}/pan-approval-details/${applicationNumber}`);
  }

  getTeleVerificationHistory(applicationNo: string): Observable<TeleVerificationHistory[]> {
    return this.http.get<TeleVerificationHistory[]>(`${this.apiUrl}/tele-verification-history/${applicationNo}`);
  }

  getCentralCallHistory(applicationNo: string, proposalNo: string): Observable<CentralCallHistory[]> {
    return this.http.get<CentralCallHistory[]>(`${this.apiUrl}/central-call-history`, { params: { applicationNo, proposalNo } });
  }

  getRequirementDetails(proposalNumber: string): Observable<RequirementDetails[]> {
    return this.http.get<RequirementDetails[]>(`${this.apiUrl}/requirement-details/${proposalNumber}`);
  }

  getCommentsAndRemarks(applicationNumber: string, policyNumber: string): Observable<ControlModel[]> {
    return this.http.get<ControlModel[]>(`${this.apiUrl}/comments-remarks`, { params: { applicationNumber, policyNumber } });
  }

  clearUWSection(): void {
    // Logic to clear UW section
  }

  getScrutinyStatus(applicationNo: string): Observable<ScrutinyStatus[]> {
    return this.http.get<ScrutinyStatus[]>(`${this.apiUrl}/scrutiny-status/${applicationNo}`);
  }

  downloadActivityTrackerData(): Observable<any> {
    return this.http.get(`${this.apiUrl}/download-activity-tracker`, { responseType: 'blob' });
  }

  getApplicationNumberByBiNumber(biNumber: string): Observable<string> {
    return this.http.get<string>(`${this.apiUrl}/application-number/${biNumber}`);
  }

  getProposalMedicalStatus(): Observable<ControlDTO[]> {
    return this.http.get<ControlDTO[]>(`${this.apiUrl}/proposal-medical-status`);
  }

  searchApplications(searchCriteria: any): Observable<ControlModel[]> {
    return this.http.get<ControlModel[]>(`${this.apiUrl}/search`, { params: searchCriteria });
  }

  getEmailLogHistory(applicationNumber: string, proposalNumber: string): Observable<EmailLog[]> {
    return this.http.get<EmailLog[]>(`${this.apiUrl}/email-log-history`, { params: { applicationNumber, proposalNumber } });
  }

  getProposalStatus(): Observable<string> {
    return this.http.get<string>(`${this.apiUrl}/proposal-status`);
  }

  getEventDescription(): Observable<EventDescription> {
    return this.http.get<EventDescription>(`${this.apiUrl}/event-description`);
  }
}
