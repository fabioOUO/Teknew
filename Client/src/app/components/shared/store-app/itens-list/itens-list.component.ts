import { Component, OnInit } from '@angular/core';
import { ItemModule } from 'src/app/models/item/item.module';
import { ItemService } from 'src/app/services/item.service';

@Component({
  selector: 'app-itens-list',
  templateUrl: './itens-list.component.html',
  styleUrls: ['./itens-list.component.css'],
})
export class ItensListComponent implements OnInit {
  listItens: Array<ItemModule>;

  constructor(private service: ItemService) {
    this.listItens = [];
  }

  ngOnInit(): void {
    this.get();
  }

  get(): void {
    this.service.getAll().subscribe( response => this.listItens = response)
  }
}
