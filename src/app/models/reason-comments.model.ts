export class ReasonCommentsModel {
  reason: string;
  comments: string;
  userId: string;
  commentDate: string;

  constructor(reason: string, comments: string, userId: string, commentDate: string) {
    this.reason = reason;
    this.comments = comments;
    this.userId = userId;
    this.commentDate = commentDate;
  }
}