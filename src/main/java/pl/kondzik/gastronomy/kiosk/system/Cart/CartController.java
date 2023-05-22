package pl.kondzik.gastronomy.kiosk.system.Cart;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kondzik.gastronomy.kiosk.system.Order.Order;
import pl.kondzik.gastronomy.kiosk.system.Order.OrderRepo;
import pl.kondzik.gastronomy.kiosk.system.Product.Burger;

import java.util.List;

//@Controller
//public class CartController {
//
//    private OrderRepo orderRepo;
//
//    @Autowired
//    public CartController(OrderRepo orderRepo) {
//        this.orderRepo = orderRepo;
//    }
//
//    @PostMapping("/cart")
//    public String addToCart(@ModelAttribute Burger burger) {
//
//        Order existingOrder = orderRepo.findByBurgerName(burger.getName());
//
//        if (existingOrder != null) {
//            existingOrder.setQuantity(existingOrder.getQuantity() + 1);
//            orderRepo.save(existingOrder);
//        } else {
//            Order order = new Order();
//            order.setBurgerName(burger.getName());
//            order.setBurgerPrice(burger.getPrice());
//            order.setQuantity(1);
//            orderRepo.save(order);
//        }
//
//        return "redirect:/burgersMenu";
//    }
//
//    @GetMapping("/cart")
//    public String showCart(Model model) {
//        List<Order> orders = (List<Order>) orderRepo.findAll();
//        model.addAttribute("orders", orders);
//        model.addAttribute("totalCartPrice", getTotalCartPrice(orders));
//        return "cart";
//    }
//
//
//    private double getTotalCartPrice(List<Order> orders) {
//        double totalCartPrice = 0;
//        for (Order order : orders) {
//            totalCartPrice += order.getBurgerPrice() * order.getQuantity();
//        }
//        return totalCartPrice;
//    }
//}

// DO GÓRY STARY DZIAŁAJĄCY
// NA DOLE NOWY DLA PRODUCT


//@Controller
//public class CartController {
//
//    private OrderRepo orderRepo;
//
//    @Autowired
//    public CartController(OrderRepo orderRepo) {
//        this.orderRepo = orderRepo;
//    }
//
//    @PostMapping("/cart")
//    public String addToCart(@ModelAttribute Product product) {
//
//        Order existingOrder = orderRepo.findByProductName(product.getName());
//
//        if (existingOrder != null) {
//            existingOrder.setQuantity(existingOrder.getQuantity() + 1);
//            orderRepo.save(existingOrder);
//        } else {
//            Order order = new Order();
//            order.setProductName(product.getName());
//            order.setProductPrice(product.getPrice());
//            order.setQuantity(1);
//            orderRepo.save(order);
//        }
//
//        return "redirect:/burgersMenu";
//    }
//
//    @GetMapping("/cart")
//    public String showCart(Model model) {
//        List<Order> orders = (List<Order>) orderRepo.findAll();
//        model.addAttribute("orders", orders);
//        model.addAttribute("totalCartPrice", getTotalCartPrice(orders));
//        return "cart";
//    }
//
//    private double getTotalCartPrice(List<Order> orders) {
//        double totalCartPrice = 0;
//        for (Order order : orders) {
//            totalCartPrice += order.getProductPrice() * order.getQuantity();
//        }
//        return totalCartPrice;
//    }
//}

// trzecia opcja na dole po zmianei przekierowania


@Controller
public class CartController {

    private OrderRepo orderRepo;

    @Autowired
    public CartController(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @PostMapping("/cart")
    public String addToCart(@ModelAttribute Product product, HttpServletRequest request) {

        Order existingOrder = orderRepo.findByProductName(product.getName());

        if (existingOrder != null) {
            existingOrder.setQuantity(existingOrder.getQuantity() + 1);
            orderRepo.save(existingOrder);
        } else {
            Order order = new Order();
            order.setProductName(product.getName());
            order.setProductPrice(product.getPrice());
            order.setQuantity(1);
            orderRepo.save(order);
        }

        // Pobierz adres żądania, aby ustalić aktualny widok (burgersMenu, wrapsMenu itp.)
        String referer = request.getHeader("Referer");
        if (referer != null) {
            return "redirect:" + referer;
        }

        // Domyślnie przekieruj na stronę główną
        return "redirect:/";
    }

    @GetMapping("/cart")
    public String showCart(Model model) {
        List<Order> orders = (List<Order>) orderRepo.findAll();
        model.addAttribute("orders", orders);
        model.addAttribute("totalCartPrice", getTotalCartPrice(orders));
        return "cart";
    }

    private double getTotalCartPrice(List<Order> orders) {
        double totalCartPrice = 0;
        for (Order order : orders) {
            totalCartPrice += order.getProductPrice() * order.getQuantity();
        }
        return totalCartPrice;
    }
}