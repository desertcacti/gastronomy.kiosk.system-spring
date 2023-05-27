package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;

import pl.kondzik.gastronomy.kiosk.system.Product.Drink;


public interface DrinkRepo extends CrudRepository<Drink, Long> {


}
