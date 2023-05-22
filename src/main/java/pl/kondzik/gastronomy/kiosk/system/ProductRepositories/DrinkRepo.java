package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;

import pl.kondzik.gastronomy.kiosk.system.Product.Drink;


public interface DrinkRepo extends CrudRepository<Drink, Long> {

//    List<Drink> findAll();
//    Drink save(Drink drink);
//
//    @EventListener(ApplicationReadyEvent.class)
//    default void init() {
//        List<Drink> drinks = Arrays.asList(
//
//                new Drink(1L,"Still water", 8.70),
//                new Drink(2L,"Sparkling water", 8.70),
//                new Drink(3L,"Tea", 9.10),
//                new Drink(4L,"Lipton Ice Tea", 7.50),
//                new Drink(5L,"CocaCola", 7.50),
//                new Drink(6L,"CocaCola Zero", 7.50),
//                new Drink(7L,"Fanta", 7.50),
//                new Drink(8L,"Sprite", 7.50),
//                new Drink(9L,"Chocolate Shake", 8.90),
//                new Drink(10L,"Vanilla shake", 7.50),
//                new Drink(11L,"Strawberry Shake", 7.50)
//
//        );
//        drinks.forEach(this::save);
//    }
}
