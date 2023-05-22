package pl.kondzik.gastronomy.kiosk.system.Product;
import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@AllArgsConstructor
@Table(name = "Burgers_Table")
@Entity

public class Burger {

        @Id
        @GeneratedValue(strategy = GenerationType.IDEN  TITY)
        private Long id;

        private String name;
        private double price;


}
