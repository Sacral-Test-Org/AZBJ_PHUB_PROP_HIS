export class ApprovalDetails {
  approvalId: string;
  approvalName: string;
  approvalDate: Date;
  approvalTime: string;
  approvalDecision: string;

  constructor(approvalId: string, approvalName: string, approvalDate: Date, approvalTime: string, approvalDecision: string) {
    this.approvalId = approvalId;
    this.approvalName = approvalName;
    this.approvalDate = approvalDate;
    this.approvalTime = approvalTime;
    this.approvalDecision = approvalDecision;
  }
}