import { HttpClient, HttpEvent, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ItemModule } from '../models/item/item.module';

@Injectable({
  providedIn: 'root',
})
export class ItemService {
  url: string;
  itens:Array<ItemModule>;
  httpOptions: { Headers: HttpHeaders };

  constructor(private httpClient: HttpClient) {
    
    this.url = 'http://localhost:5000/product';
    this.itens = [];

    this.httpOptions = {
      Headers: new HttpHeaders({
        'Content-Type': 'application/json',
      }),
    };
  }

  getAll(): Observable<ItemModule[]> {
    return this.httpClient.get<ItemModule[]>(this.url);
  }
}
