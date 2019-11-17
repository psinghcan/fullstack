import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { FlexLayoutModule} from '@angular/flex-layout';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { ListCustomersComponent } from './components/customer/list-customers/list-customers.component';
import { SaveCustomerComponent } from './components/customer/save-customer/save-customer.component';
import { SaveProductComponent } from './components/product/save-product/save-product.component';
import { ListProductsComponent } from './components/product/list-products/list-products.component';
import { ListPurchasesComponent } from './components/purchase/list-purchases/list-purchases.component';
import { SavePurchaseComponent } from './components/purchase/save-purchase/save-purchase.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTableModule} from '@angular/material/table';
import { MatMenuModule, MatToolbarModule, MatIconModule, MatSidenavModule, MatListModule, MatButtonModule} from  '@angular/material';
import { MaterialModule} from './material.module';

import {HttpClientModule} from '@angular/common/http';
import {ContactComponent} from './components/contact/contact.component';
import {AboutComponent} from './components/about/about.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    PageNotFoundComponent,
    ListCustomersComponent,
    SaveCustomerComponent,
    SaveProductComponent,
    ListProductsComponent,
    ListPurchasesComponent,
    SavePurchaseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatMenuModule,
    MatIconModule,
    MaterialModule,
    FlexLayoutModule,
    HttpClientModule,
    MatTableModule,
    MatButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
