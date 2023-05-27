package pl.kondzik.gastronomy.kiosk.system.MenuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.Dessert;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.DessertRepo;

import java.util.List;
@Controller
@RequestMapping("/dessertsMenu")
public class DessertsMenuController {
    private final DessertRepo dessertRepo;
    @Autowired
    public DessertsMenuController(DessertRepo dessertRepo) {
        this.dessertRepo = dessertRepo;
    }

    @GetMapping
    public String showDesserts(Model model) {
        List<Dessert> desserts = (List<Dessert>) dessertRepo.findAll();
        model.addAttribute("desserts", desserts);
        return "dessertsMenu";
    }
}
