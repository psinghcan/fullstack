import { Injectable } from '@angular/core';
import {Purchase} from '../components/purchase/purchase.model';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PurchaseService {

  constructor(private httpClient: HttpClient) { }

  getPurchases() {
    return this.httpClient.get<Purchase>('http://localhost:8080/api/purchases');
  }

  getPurchase() {
    return this.httpClient.get<Purchase>('http://localhost:8080/api/purchases/1');
  }
}
