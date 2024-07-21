export class EmailLogHistory {
  emailStatus: string;
  dateTimeSent: Date;
  registeredEmailId: string;
  letterType: string;
  successfulMails: number;

  constructor(emailStatus: string, dateTimeSent: Date, registeredEmailId: string, letterType: string, successfulMails: number) {
    this.emailStatus = emailStatus;
    this.dateTimeSent = dateTimeSent;
    this.registeredEmailId = registeredEmailId;
    this.letterType = letterType;
    this.successfulMails = successfulMails;
  }
}