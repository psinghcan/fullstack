package fullstack.repository;

import fullstack.model.Purchase;
import fullstack.model.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Long> {

    public List<PurchaseItem> getPurchaseItemsByPurchase(Purchase purchase);
}
