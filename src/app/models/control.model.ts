export class ControlModel {
  applicationNo: string;
  physicalPolicyBond: string;
  userId: string;
  approvedUser: string;
  userName: string;
  apprvDate: Date;
  apprvTime: string;
  status: string;
  comments: string[];
  remarks: string[];
  applicationNumber: string;
  receiptNumber: string;
  proposalNumber: string;
  scrutinyNumber: string;
  biNumber: string;
  currentStatus: string;
  flags: any;
  policyDispatchStatus: string;
  competitionDetails: any;
  comments: string;
}

export class ReasonComment {
  reason: string;
  comments: string;
  userId: string;
  commentDate: Date;
}

export class EmailLogHistory {
  documentType: string;
  emailStatus: string;
  timestamp: Date;
  successfulEmailCount: number;
}