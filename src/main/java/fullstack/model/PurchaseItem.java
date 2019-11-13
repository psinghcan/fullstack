package fullstack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class PurchaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Product product;
    private Integer quantity;
    private Double amount;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

    @Override
    public String toString() {
        return "PurchaseItem{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                ", amount=" + amount +
                ", purchase=" + purchase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseItem that = (PurchaseItem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product);
    }
}
