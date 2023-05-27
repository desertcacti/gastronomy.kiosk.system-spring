package pl.kondzik.gastronomy.kiosk.system.MenuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.Wrap;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.WrapRepo;

import java.util.List;
@Controller
@RequestMapping("/wrapsMenu")
public class WrapsMenuController {
    private final WrapRepo wrapRepo;
    @Autowired
    public WrapsMenuController(WrapRepo wrapRepo) {
        this.wrapRepo = wrapRepo;
    }
    @GetMapping
    public String showWraps(Model model) {
        List<Wrap> wraps = (List<Wrap>) wrapRepo.findAll();
        model.addAttribute("wraps", wraps);
        return "wrapsMenu";
    }
}
