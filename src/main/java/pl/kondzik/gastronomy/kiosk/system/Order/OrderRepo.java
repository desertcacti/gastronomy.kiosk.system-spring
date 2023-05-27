package pl.kondzik.gastronomy.kiosk.system.Order;
import org.springframework.data.repository.CrudRepository;
public interface OrderRepo extends CrudRepository<Order, Long> {
    Order findByBurgerName(String burgerName);
    Order findByProductName(String productName);
}
