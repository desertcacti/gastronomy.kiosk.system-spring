package pl.kondzik.gastronomy.kiosk.system.MenuController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.kondzik.gastronomy.kiosk.system.Product.Burger;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.BurgerRepo;


import java.util.List;

@Controller
//@RequestMapping("/burgersMenu")
public class BurgersMenuController {

    private final BurgerRepo burgerRepo;

    @Autowired
    public BurgersMenuController(BurgerRepo burgerRepo) {
        this.burgerRepo = burgerRepo;
    }

    @GetMapping("/burgersMenu")
    public String showBurgers(Model model) {
        List<Burger> burgers = (List<Burger>)  burgerRepo.findAll();
        model.addAttribute("burgers", burgers);
        return "burgersMenu";
    }

}





























//    @PostMapping("/cart")
//    public String addToCart(@ModelAttribute("burger") Burger burger, HttpSession session) {
//        List<Burger> cart = (List<Burger>) session.getAttribute("cart");
//        if (cart == null) {
//            cart = new ArrayList<>();
//            session.setAttribute("cart", cart);
//        }
//        cart.add(burger);
////        return "redirect:/cart/showCart";
//        return "cart";
//    }
//@PostMapping("/cart")
//public String addToCart() {
//    return "redirect:/cart";
//
//}

