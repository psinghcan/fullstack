import { Component, OnInit } from '@angular/core';
import {Product} from '../product.model';
import {ProductService} from '../../../service/product.service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-list-products',
  templateUrl: './list-products.component.html',
  styleUrls: ['./list-products.component.css']
})
export class ListProductsComponent implements OnInit {

  constructor(private productService: ProductService) { }
  tableColumns: string[] = ['id', 'sku', 'price', 'description'];
  products: Product[];
  ngOnInit() {
    this.productService.getProducts()
      .subscribe(data => {
        console.log(data);
        this.products = data;
      }, error => console.log(error));
    console.log(this.products);
  }
}
