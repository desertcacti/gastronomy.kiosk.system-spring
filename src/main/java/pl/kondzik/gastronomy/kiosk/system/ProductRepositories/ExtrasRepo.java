package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;

import pl.kondzik.gastronomy.kiosk.system.Product.Extras;


public interface ExtrasRepo extends CrudRepository<Extras, Long> {
//
//    List<Extras> findAll();
//    Extras save(Extras extras);
//
//    @EventListener(ApplicationReadyEvent.class)
//    default void init() {
//        List<Extras> extras = Arrays.asList(
//                new Extras(1L,"Olive oil", 1.50),
//                new Extras(2L,"Ketchup", 1.50),
//                new Extras(3L,"Garlic sauce", 2.00),
//                new Extras(4L,"1000 Island sauce", 2.00),
//                new Extras(5L,"Mustard sauce", 2.00),
//                new Extras(6L,"Barbeque sauce", 2.00),
//                new Extras(7L,"Sweet and sour sauce", 2.00),
//                new Extras(8L,"Cream sauce", 2.00),
//                new Extras(9L ,"Dill sauce", 2.00),
//                new Extras(10L,"Vinaigrette sauce", 2.00)
//
//
//        );
//        extras.forEach(this::save);
//    }



}
