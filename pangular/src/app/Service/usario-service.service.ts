import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import {User} from '../Model/User'

@Injectable({
  providedIn: 'root'
})
export class UsarioServiceService {

  
  constructor(private http:HttpClient) 
  { }
  url='http://localhost:8080/users'

  getUser(){
    return this.http.get<User[]>(this.url);
  }
}
