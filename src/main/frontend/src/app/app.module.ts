import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ListCustomersComponent } from './customer/list-customers/list-customers.component';
import { SaveCustomerComponent } from './customer/save-customer/save-customer.component';
import { SaveProductComponent } from './product/save-product/save-product.component';
import { ListProductsComponent } from './product/list-products/list-products.component';
import { ListPurchasesComponent } from './purchase/list-purchases/list-purchases.component';
import { SavePurchaseComponent } from './purchase/save-purchase/save-purchase.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListCustomersComponent,
    SaveCustomerComponent,
    SaveProductComponent,
    ListProductsComponent,
    ListPurchasesComponent,
    SavePurchaseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
