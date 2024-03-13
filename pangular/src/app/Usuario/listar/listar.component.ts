import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {  UsarioServiceService} from '../../Service/usario-service.service';
import {Router} from '@angular/router';
import {User} from 'src/app/Model/User'

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.scss']
})
export class ListarComponent implements OnInit{
  users: User[] = [];
  constructor(private service:UsarioServiceService, private router:Router){}
    ngOnInit(){
        this.service.getUser()
        .subscribe(data=>{this.users=data; console.log(data);})
    }
  }

