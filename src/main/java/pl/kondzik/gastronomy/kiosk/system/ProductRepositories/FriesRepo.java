package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.Fries;

//import javax.annotation.PostConstruct;


public interface FriesRepo extends CrudRepository<Fries, Long> {
//
//
//    List<Fries> findAll();
//    Fries save(Fries fries);
//
//    @EventListener(ApplicationReadyEvent.class)
//    default void init() {
//        List<Fries> fries = Arrays.asList(
//                new Fries(1L,"Small fries", 9.40),
//                new Fries(2L,"Medium Fries", 10.50),
//                new Fries(3L,"Large fries", 10.90),
//                new Fries(4L,"Chopped Potatoes", 9.90)
//
//
//        );
//        fries.forEach(this::save);
//    }


}
