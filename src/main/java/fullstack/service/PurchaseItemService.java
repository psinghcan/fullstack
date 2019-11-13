package fullstack.service;

import fullstack.model.Purchase;
import fullstack.model.PurchaseItem;
import fullstack.repository.PurchaseItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseItemService {
    public PurchaseItemService(PurchaseItemRepository purchaseItemRepository) {
        this.purchaseItemRepository = purchaseItemRepository;
    }

    public List<PurchaseItem> getAllPurchaseItems(){
        return purchaseItemRepository.findAll();
    }

    public List<PurchaseItem> getAllPurchaseItemByPurchase(Purchase purchase){
        return purchaseItemRepository.getPurchaseItemsByPurchase(purchase);
    }

    public PurchaseItem addPurchaseItem(PurchaseItem purchaseItem){
        return purchaseItemRepository.save(purchaseItem);
    }

    private PurchaseItemRepository purchaseItemRepository;

}
