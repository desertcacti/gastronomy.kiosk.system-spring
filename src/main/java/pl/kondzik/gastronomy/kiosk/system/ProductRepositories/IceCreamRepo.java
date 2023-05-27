package pl.kondzik.gastronomy.kiosk.system.ProductRepositories;

import org.springframework.data.repository.CrudRepository;
import pl.kondzik.gastronomy.kiosk.system.Product.IceCream;

public interface IceCreamRepo extends CrudRepository<IceCream, Long> {



    }
