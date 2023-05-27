package pl.kondzik.gastronomy.kiosk.system.MenuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.Extras;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.ExtrasRepo;

import java.util.List;

@Controller
@RequestMapping("/extrasMenu")
public class ExtrasMenuController {
    private final ExtrasRepo extrasRepo;
    @Autowired
    public ExtrasMenuController(ExtrasRepo extrasRepo) {
        this.extrasRepo = extrasRepo;
    }

    @GetMapping
    public String showExtras (Model model) {
        List<Extras> extras = (List<Extras>) extrasRepo.findAll();
        model.addAttribute("extras", extras);
        return "extrasMenu";
    }
}




