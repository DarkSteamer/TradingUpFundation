import { Component } from '@angular/core';
import { CompartidoServiceService } from '../../service/compartido-service.service';
import { UserDomain } from '../../../shared/domains/UserDomain';


@Component({
  selector: 'app-curso-admin-page',
  templateUrl: './curso-admin-page.component.html',
  styleUrls: ['./curso-admin-page.component.scss']
})
export class CursoAdminPageComponent {
  

  constructor(private compartidoServiceService: CompartidoServiceService){
    let userModel: UserDomain;
    userModel = this.compartidoServiceService.getData();

    const currentUrl = window.location.href;
    console.log('URL exacta:', currentUrl);
    if(currentUrl == "http://localhost:4200/cursosAdmin-page")
    {
      this.compartidoServiceService.setData(false)
    }
    

  }

  sectionUser!: boolean;
  sectionContent!: boolean;
  sectionBook!: boolean;
  sectionExercises!: boolean;
  sectionClass!: boolean;
  sectionPrerecorded!: boolean;
  sectionEditUser!: boolean;

  slideDatos: boolean = true;
  startA = true;
  datosPrueba!: boolean;

  modalActivateEditUser(datos:boolean){
    this.startA = false;
    this.sectionUser = false;
    this.sectionBook = false;
    this.sectionContent = false;
    this.sectionClass = false;
    this.sectionExercises = false;
    this.sectionPrerecorded = false;
    this.sectionEditUser = datos;
  }

  modalActivateUser(datos: boolean) {
    this.sectionContent = false;
    this.sectionUser = datos;
    this.sectionBook = false;
    this.sectionClass = false;
    this.sectionPrerecorded = false;
    this,this.startA = false;
    this.sectionExercises = false;
    this.sectionEditUser = false;
    console.log("Prueba del user: " + !datos)

  }

  modalActivateContent(datos:boolean){
    this.sectionUser = false;
    this.sectionContent = datos;
    this.sectionBook = false;
    this.sectionClass = false;
    this.sectionPrerecorded = false;
    this,this.startA = false;
    this.sectionExercises = false;
    this.sectionEditUser = false;
  }

  modalActivateBook(datos:boolean){
    this.sectionUser = false;
    this.sectionBook = datos;
    this.sectionContent = false;
    this.sectionClass = false;
    this.sectionPrerecorded = false;
    this.startA = false;
    this.sectionExercises = false;
    this.sectionEditUser = false;
    
  }

  modalActivateExercises(datos:boolean){
    this.sectionUser = false;
    this.sectionBook = false;
    this.sectionContent = false;
    this.sectionClass = false;
    this.sectionPrerecorded = false;
    this.startA = false;
    this.sectionEditUser = false;
    this.sectionExercises = datos;
  }

  modalActivateClasses(datos:boolean){
    this.sectionUser = false;
    this.sectionBook = false;
    this.sectionContent = false;
    this.sectionClass = datos;
    this.sectionPrerecorded = false;
    this.startA = false;
    this.sectionExercises = false;
    this.sectionEditUser = false;
  }

  modalActivatePrerecordeds(datos:boolean){
    this.sectionUser = false;
    this.sectionBook = false;
    this.sectionContent = false;
    this.sectionClass = false;
    this.sectionPrerecorded = datos;
    this.startA = false;
    this.sectionExercises = false;
    this.sectionEditUser = false;
  }

  slideActivate(datos:boolean){
    console.log("prueba " + this.datosPrueba)
    this.slideDatos = datos;
    this.datosPrueba = !datos;
    console.log("parametro " + datos)
    console.log("datos prueba: " + this.datosPrueba);
  }

}
