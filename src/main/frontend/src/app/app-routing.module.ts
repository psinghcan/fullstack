import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListCustomersComponent} from './customer/list-customers/list-customers.component';
import {ListProductsComponent} from './product/list-products/list-products.component';
import {ListPurchasesComponent} from './purchase/list-purchases/list-purchases.component';


const routes: Routes = [
  {path: 'customers', component: ListCustomersComponent},
  {path: 'products', component: ListProductsComponent},
  {path: 'purchases', component: ListPurchasesComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
