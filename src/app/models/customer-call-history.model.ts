export class CustomerCallHistoryModel {
  call_date: Date;
  caller_id: string;
  status: string;
  sub_status: string;
  proposal_medical_status: string;

  constructor(
    call_date: Date,
    caller_id: string,
    status: string,
    sub_status: string,
    proposal_medical_status: string
  ) {
    this.call_date = call_date;
    this.caller_id = caller_id;
    this.status = status;
    this.sub_status = sub_status;
    this.proposal_medical_status = proposal_medical_status;
  }
}