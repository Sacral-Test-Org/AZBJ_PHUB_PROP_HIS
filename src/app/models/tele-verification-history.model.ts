export class TeleVerificationHistoryModel {
  userId: string;
  dateTime: string;
  teleVerificationComments: string;
  teleVerificationStatus: string;
  userComments: string;

  constructor(
    userId: string,
    dateTime: string,
    teleVerificationComments: string,
    teleVerificationStatus: string,
    userComments: string
  ) {
    this.userId = userId;
    this.dateTime = dateTime;
    this.teleVerificationComments = teleVerificationComments;
    this.teleVerificationStatus = teleVerificationStatus;
    this.userComments = userComments;
  }
}