package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.Burger;


public interface BurgerRepo extends CrudRepository<Burger, Long> {


    }