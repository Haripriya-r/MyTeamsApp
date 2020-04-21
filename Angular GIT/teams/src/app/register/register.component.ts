import { Component, OnInit } from '@angular/core';
import{FormControl,FormGroup, Validators} from '@angular/forms';
import { RegistrationService } from '../registration.service';
import { LoginService } from '../login.service';



@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private _registrationService:RegistrationService, private _loginService:LoginService) { }

  ngOnInit(): void {
  }
  RegisterForm = new FormGroup({
    name: new FormControl('',Validators.required),
    email : new FormControl('',Validators.required),
    password : new FormControl('',Validators.required),
    confirm : new FormControl('',Validators.required)
  });
  onSubmit(){
    console.log(this.RegisterForm.value) ;
    this._loginService.registration(this.RegisterForm.value)
    .subscribe(
      response=>console.log('success',response),
      error=>console.error('error',error)
    );
  
  }
}
