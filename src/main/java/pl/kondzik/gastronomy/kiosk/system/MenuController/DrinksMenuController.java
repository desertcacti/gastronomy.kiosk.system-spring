package pl.kondzik.gastronomy.kiosk.system.MenuController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.Drink;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.DrinkRepo;

import java.util.List;

@RequestMapping("/drinksMenu")
@Controller
public class DrinksMenuController {

    private final DrinkRepo drinkRepo;

    @Autowired
    public DrinksMenuController(DrinkRepo drinkRepo) {
        this.drinkRepo = drinkRepo;
    }

    @GetMapping
    public String showDrinks(Model model) {
        List<Drink> drinks = (List<Drink>) drinkRepo.findAll();
        model.addAttribute("drinks", drinks);
        return "drinksMenu";
    }
}
