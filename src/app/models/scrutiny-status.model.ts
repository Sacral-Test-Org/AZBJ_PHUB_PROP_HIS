export class ScrutinyStatus {
  deletionComment: string;
  userId: string;
  commentDate: Date;

  constructor(deletionComment: string, userId: string, commentDate: Date) {
    this.deletionComment = deletionComment;
    this.userId = userId;
    this.commentDate = commentDate;
  }
}

export class ScrutinyStatusModel {
  reason: string;
  userId: string;
  commentDate: Date;

  constructor(reason: string, userId: string, commentDate: Date) {
    this.reason = reason;
    this.userId = userId;
    this.commentDate = commentDate;
  }
}