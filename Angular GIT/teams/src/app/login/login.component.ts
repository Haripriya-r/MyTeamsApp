import { Component, OnInit } from '@angular/core';
import{ FormControl,FormGroup,Validators}from '@angular/forms';
import { NgModule } from '@angular/core';
import { LoginService } from '../login.service';




@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _loginService:LoginService) { }

  ngOnInit(): void {
  }
  profileForm = new FormGroup({
    email: new FormControl(''),
    password : new FormControl('')
  });
  onSubmit(){
    console.log(this.profileForm.value);
    this._loginService.login(this.profileForm.value)
    .subscribe(
      response=>console.log('success',response),
      error=>console.error('error',error)
    );
  }

  
}
