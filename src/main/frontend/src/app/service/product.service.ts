import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from '../components/product/product.model';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[];
  product: Product;

  constructor(private httpClient: HttpClient) { }

  getProducts(): Observable<any>{
    return this.httpClient.get('http://localhost:8080/api/products');
  }

  getProduct(): Observable<any>{
    return this.httpClient.get('http://localhost:8080/api/products/1');
  }
}
