import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  _url='/pro/createLogin';
  constructor(private _http:HttpClient) { 
    
  }
  
  login(userData):Observable<any>{
    const headers = new HttpHeaders().set('Content-Type','application/json; charset=utf-8');
   return this._http.post<any>(this._url,userData);

  }
  registration(userData):Observable<any>{
    const headers = new HttpHeaders().set('Content-Type','application/json; charset=utf-8');
    return this._http.post<any>('/pro/createRegister',userData);
 
   }
}
