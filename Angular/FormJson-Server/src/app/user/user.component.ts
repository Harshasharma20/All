import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  userList : any;
  constructor(private http:HttpClient) { 
   this.userList= [];
  }

  ngOnInit(): void {
    this.getUserList();
  }
  getUserList(){
    this.http.get('http://localhost:3004/users').subscribe((result:any)=>{
     this.userList=result;
    });
  }

}
