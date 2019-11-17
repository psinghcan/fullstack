import {Product} from '../product/product.model';

export class PurchaseItem {
  id: number;
  product: Product;
  quantity: number;
  amount: number;
}
