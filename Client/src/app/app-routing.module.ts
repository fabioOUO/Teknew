import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ItensListComponent } from './components/shared/store-app/itens-list/itens-list.component';
import { AdmComponent } from './pages/adm/adm.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { ProductsComponent } from './pages/products/products.component';
import { UserComponent } from './pages/user/user.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'home',
    redirectTo: '',
    pathMatch: 'full'
  },
  {
    path: 'administrador',
    component: AdmComponent
  },
  {
    path: 'usuario',
    component: UserComponent
  },
  {
    path: 'produtos',
    component:  ProductsComponent
  },
  {
    path: 'login',
    component:  LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
