package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.Wrap;


public interface WrapRepo extends CrudRepository<Wrap, Long> {

//    List<Wrap> findAll();
//    Wrap save(Wrap wrap);
//
//    @EventListener(ApplicationReadyEvent.class)
//    default void init() {
//        List<Wrap> wraps = Arrays.asList(
//                new Wrap(1L,"McWrap Veggie", 18.60),
//                new Wrap(2L,"McWrap Crispy Classic", 19.90),
//                new Wrap(3L,"McWrap Crispy Bacon Deluxe", 20.50),
//                new Wrap(4L,"McWrap Supreme Chicken Sweet & Spicy", 22.70)
//        );
//        wraps.forEach(this::save);
//    }
}




