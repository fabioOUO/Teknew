import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/shared/header/header.component';
import { FooterComponent } from './components/shared/footer/footer.component';
import { StoreAppComponent } from './components/shared/store-app/store-app.component';
import { FiltersComponent } from './components/shared/store-app/filters/filters.component';
import { ItensListComponent } from './components/shared/store-app/itens-list/itens-list.component';
import { NavComponent } from './components/shared/nav/nav.component';
import { ItemComponent } from './components/shared/store-app/itens-list/item/item.component';
import { ItemService } from './services/item.service';
import { HomeComponent } from './pages/home/home.component';
import { AdmComponent } from './pages/adm/adm.component';
import { UserComponent } from './pages/user/user.component';
import { ProductsComponent } from './pages/products/products.component';
import { LoginComponent } from './pages/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    StoreAppComponent,
    FiltersComponent,
    ItensListComponent,
    NavComponent,
    ItemComponent,
    HomeComponent,
    AdmComponent,
    UserComponent,
    ProductsComponent,
    LoginComponent
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule],
  providers: [ItemService],
  bootstrap: [AppComponent],
})
export class AppModule {}
