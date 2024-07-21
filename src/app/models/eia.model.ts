export class EIA {
  status: string;
  description: string;
  user: string;
  date: Date;

  constructor(status: string, description: string, user: string, date: Date) {
    this.status = status;
    this.description = description;
    this.user = user;
    this.date = date;
  }
}