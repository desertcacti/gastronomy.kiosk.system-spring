package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.IceCream;

public interface IceCreamRepo extends CrudRepository<IceCream, Long> {

//
//    List<IceCream> findAll();
//    IceCream save(IceCream iceCream);
//
//    @EventListener(ApplicationReadyEvent.class)
//    default void init() {
//        List<IceCream> iceCreams = Arrays.asList(
//                new IceCream(1L,"Chocolate ice cream", 9.90),
//                new IceCream(2L,"Strawberry ice cream", 9.90),
//                new IceCream(3L,"Caramel cream ice cream", 9.90),
//                new IceCream(4L,"Chocolate ice cream with chocolate coating", 9.90),
//                new IceCream(5L,"Chocolate ice cream with strawberry coating", 9.90),
//                new IceCream(6L,"Chocolate ice cream with caramel coating", 9.90)
//
//        );
//        iceCreams.forEach(this::save);
//    }


    }
