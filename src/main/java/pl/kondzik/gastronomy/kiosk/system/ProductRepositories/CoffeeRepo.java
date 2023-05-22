package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.Coffee;


public interface CoffeeRepo extends CrudRepository<Coffee, Long> {

//    List<Coffee> findAll();
//    Coffee save(Coffee coffee);
//
//    @EventListener(ApplicationReadyEvent.class)
//    default void init() {
//        List<Coffee> coffees = Arrays.asList(
//                new Coffee(1L,"Black Coffee", 8.90),
//                new Coffee(2L,"Coffee with milk", 9.70),
//                new Coffee(3L,"Flat White", 12.40),
//                new Coffee(4L,"Caffe Latte", 12.40),
//                new Coffee(5L,"Iced Latte", 14.40),
//                new Coffee(6L,"Iced Caramel Latte", 15.30),
//                new Coffee(7L,"Carmel Latte Macchiato", 16.60)
//
//        );
//        coffees.forEach(this::save);
//    }
}
