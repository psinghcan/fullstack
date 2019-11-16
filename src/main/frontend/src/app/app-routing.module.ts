import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListCustomersComponent} from './customer/list-customers/list-customers.component';
import {ListProductsComponent} from './product/list-products/list-products.component';
import {ListPurchasesComponent} from './purchase/list-purchases/list-purchases.component';
import {HomeComponent} from './home/home.component';


const routes: Routes = [
  {path: 'listCustomers', component: ListCustomersComponent},
  {path: 'listProducts', component: ListProductsComponent},
  {path: 'home', component: HomeComponent},
  {path: 'listPurchases', component: ListPurchasesComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
