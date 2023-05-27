package pl.kondzik.gastronomy.kiosk.system.MenuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.Nuggets;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.NuggetsRepo;

import java.util.List;

@Controller
@RequestMapping("/nuggetsMenu")
public class NuggetsMenuController {
     private NuggetsRepo nuggetsRepo;
     @Autowired
    public NuggetsMenuController(NuggetsRepo nuggetsRepo) {
        this.nuggetsRepo = nuggetsRepo;
    }
    @GetMapping
    public String showNuggets(Model model) {
         List<Nuggets> nuggets = (List<Nuggets>) nuggetsRepo.findAll();
         model.addAttribute("nuggets", nuggets);
         return "nuggetsMenu";
    }
}
