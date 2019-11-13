package fullstack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double net;
    @OneToOne
    private Customer customer;

    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
    private Set<PurchaseItem> purchaseItems = new HashSet<>();

    public void addPurchaseItem(PurchaseItem purchaseItem){
        if (purchaseItems == null) purchaseItems = new HashSet<>();
        purchaseItem.setPurchase(this);
        purchaseItems.add(purchaseItem);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", net=" + net +
                ", customer=" + customer +
                '}';
    }
}
