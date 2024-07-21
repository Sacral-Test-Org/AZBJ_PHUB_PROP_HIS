import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DataEnrichForm } from 'src/app/models/data-enrich-form.model';

@Component({
  selector: 'app-data-enrich-form',
  templateUrl: './data-enrich-form.component.html',
  styleUrls: ['./data-enrich-form.component.css']
})
export class DataEnrichFormComponent implements OnInit {
  formParams: DataEnrichForm;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.queryParams.subscribe(params => {
      this.formParams = {
        APPLICATION_NO: params['APPLICATION_NO'],
        call_form_name: 'STATUS_QUERY_SCREEN'
      };
    });
  }
}