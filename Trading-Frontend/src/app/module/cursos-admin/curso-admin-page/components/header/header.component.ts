import { Component, EventEmitter, Input, OnChanges, Output, SimpleChanges } from '@angular/core';
import { IMAGEN_LOGO } from 'src/app/shared/constants';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  
  @Output() activateSlideVar = new EventEmitter<boolean>();
  datos = true;
  logo = IMAGEN_LOGO; 

  
  clickSlide(){
    this.activateSlideVar.emit(this.datos = !this.datos);
  
  }

}
