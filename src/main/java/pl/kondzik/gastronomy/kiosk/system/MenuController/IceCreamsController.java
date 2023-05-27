package pl.kondzik.gastronomy.kiosk.system.MenuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kondzik.gastronomy.kiosk.system.Product.IceCream;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.IceCreamRepo;

import java.util.List;
@Controller
@RequestMapping("/iceCreamsMenu")
public class IceCreamsController {
    private final IceCreamRepo iceCreamRepo;
    @Autowired
    public IceCreamsController(IceCreamRepo iceCreamRepo) {
        this.iceCreamRepo = iceCreamRepo;
    }

    @GetMapping
    public String showIceCreams(Model model) {
        List<IceCream> iceCreams = (List<IceCream> ) iceCreamRepo.findAll();
        model.addAttribute("iceCreams", iceCreams);
        return "iceCreamsMenu";
    }
}
