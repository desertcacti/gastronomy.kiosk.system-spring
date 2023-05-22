package pl.kondzik.gastronomy.kiosk.system.MenuController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.Coffee;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.CoffeeRepo;

import java.util.List;

@Controller
@RequestMapping("/coffeesMenu")
public class CoffeesMenuController {

    private final CoffeeRepo coffeeRepo;

    @Autowired
    public CoffeesMenuController(CoffeeRepo coffeeRepo) {
        this.coffeeRepo = coffeeRepo;
    }


    @GetMapping
    public String showCoffees(Model model) {
        List<Coffee> coffees = (List<Coffee>) coffeeRepo.findAll();
        model.addAttribute("coffees", coffees);
        return "coffeesMenu";
    }



}
