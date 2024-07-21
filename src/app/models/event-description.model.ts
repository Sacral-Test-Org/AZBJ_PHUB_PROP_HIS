export class EventDescription {
  eventNumber: string;
  proposalNumber: string;
  truncatedDate: string;
  description: string;

  constructor(eventNumber: string, proposalNumber: string, truncatedDate: string, description: string) {
    this.eventNumber = eventNumber;
    this.proposalNumber = proposalNumber;
    this.truncatedDate = truncatedDate;
    this.description = description;
  }
}