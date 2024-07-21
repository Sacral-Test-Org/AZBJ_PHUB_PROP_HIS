import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EIAService } from 'src/app/services/eia.service';
import { EIA } from 'src/app/models/eia.model';

@Component({
  selector: 'app-eia',
  templateUrl: './eia.component.html',
  styleUrls: ['./eia.component.css']
})
export class EIAComponent implements OnInit {
  eiaData: EIA[] = [];
  isViewHidden: boolean = false;

  constructor(private eiaService: EIAService, private router: Router) {}

  ngOnInit(): void {
    this.getEIAData();
  }

  getEIAData(): void {
    this.eiaService.getEIAData().subscribe((data: EIA[]) => {
      this.eiaData = data;
    });
  }

  exit(): void {
    this.onExitButtonClick();
  }

  onExitButtonClick(): void {
    this.isViewHidden = true;
    this.router.navigate(['/search-control']);
  }
}
