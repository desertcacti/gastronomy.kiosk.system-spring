package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;

import pl.kondzik.gastronomy.kiosk.system.Product.Dessert;


public interface DessertRepo extends CrudRepository<Dessert, Long> {

//        List<Dessert> findAll();
//        Dessert save(Dessert dessert);
//
//    @EventListener(ApplicationReadyEvent.class)
//        default void init() {
//            List<Dessert> desserts = Arrays.asList(
//                    new Dessert(1L,"Mango-passion fruit cake", 7.90),
//                    new Dessert(2L,"Apple cake", 7.90),
//                    new Dessert(3L,"Strawberry white chocolate muffin", 7.70),
//                    new Dessert(4L,"Chocolate muffin", 7.70),
//                    new Dessert(5L,"Nougat swirl", 7.70),
//                    new Dessert(6L,"Butter croissant", 6.60),
//                    new Dessert(7L,"Cocoa croissant", 7.70),
//                    new Dessert(8L,"Salted caramel cookie", 6.60),
//                    new Dessert(9L,"Oatcake", 6.60),
//                    new Dessert(10L,"Chocolate chip cookie", 6.60)
//
//            );
//            desserts.forEach(this::save);
//        }
    }


