package pl.kondzik.gastronomy.kiosk.system.Order;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="Order_Table")
@Data
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date placedAt;
    private String burgerName;
    private double burgerPrice;
    private int quantity;

    private String productName;
    private double productPrice;

    public Order() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}