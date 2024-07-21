export class CallHistory {
  requestNumber: string;
  mainStatus: string;
  subStatus: string;
  approvalRemarks: string;
  callerId: string;
  callTime: string;

  constructor(
    requestNumber: string,
    mainStatus: string,
    subStatus: string,
    approvalRemarks: string,
    callerId: string,
    callTime: string
  ) {
    this.requestNumber = requestNumber;
    this.mainStatus = mainStatus;
    this.subStatus = subStatus;
    this.approvalRemarks = approvalRemarks;
    this.callerId = callerId;
    this.callTime = callTime;
  }
}