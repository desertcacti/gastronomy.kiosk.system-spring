package pl.kondzik.gastronomy.kiosk.system.MenuController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.Fries;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.FriesRepo;

import java.util.List;

@Controller
@RequestMapping("/friesMenu")
public class FriesMenuController {

    private final FriesRepo friesRepo;

    @Autowired
    public FriesMenuController(FriesRepo friesRepo) {
        this.friesRepo = friesRepo;
    }


    @GetMapping
    public String showFries(Model model) {
        List<Fries> fries = (List<Fries>) friesRepo.findAll();
        model.addAttribute("fries", fries);
        return "friesMenu";
    }

}
