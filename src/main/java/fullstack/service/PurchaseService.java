package fullstack.service;

import fullstack.model.Purchase;
import fullstack.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<Purchase> getAllPurchase(){
        return purchaseRepository.findAll();
    }

    public Purchase addPurchase(Purchase purchase){
        return purchaseRepository.save(purchase);
    }

    public void deletePurchase(Purchase purchase){
        purchaseRepository.delete(purchase);
    }

    private PurchaseRepository purchaseRepository;
}
