package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.Coffee;


public interface CoffeeRepo extends CrudRepository<Coffee, Long> {


}
