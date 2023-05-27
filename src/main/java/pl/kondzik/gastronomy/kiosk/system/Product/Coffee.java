package pl.kondzik.gastronomy.kiosk.system.Product;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@AllArgsConstructor
@Table(name = "Coffees_Table")
@Entity
public class Coffee  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

}
