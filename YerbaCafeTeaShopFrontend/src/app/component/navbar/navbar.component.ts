import { Component } from '@angular/core';
import {NavigationService} from "../../service/navigation.service";
import {TranslateService} from "@ngx-translate/core";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {


  constructor(
    private navigationService: NavigationService
  ) {
  }

  redirectToAuthenticationPage() {
    this.navigationService.redirectToAuthenticationPage();
  }

  redirectToHomePage(): void {
    this.navigationService.redirectToHomePage();
  }
}
