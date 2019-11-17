import {Customer} from '../customer/customer.model';
import {PurchaseItem} from './purchaseItem.model';

export class Purchase {
  id: number;
  net: number;
  customer: Customer;
  purchaseItems: Array<PurchaseItem>;
}
