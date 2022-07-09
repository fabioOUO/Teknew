import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class ItemModule { 
  code!: number;
  name!: string;
  price!: number;
  quantity!: number;
  category!: string;
  imgUrl!: string;
}
