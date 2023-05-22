package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.Nuggets;


public interface NuggetsRepo extends CrudRepository<Nuggets, Long> {

//    List<Nuggets> findAll();
//    Nuggets save(Nuggets nuggets);
//
//    @EventListener(ApplicationReadyEvent.class)
//    default void init() {
//        List<Nuggets> nuggets = Arrays.asList(
//
//                new Nuggets(1L,"Six McNuggets", 16.00),
//                new Nuggets(2L,"Nine McNuggets", 18.80),
//                new Nuggets(3L,"Twenty McNuggets", 30.30),
//                new Nuggets(4L,"Three Chicken Tenders", 16.70),
//                new Nuggets(5L,"Five Chicken Tenders", 21.30),
//                new Nuggets(6L,"ChickenBox", 43.40)
//
//        );
//        nuggets.forEach(this::save);
//    }


}


