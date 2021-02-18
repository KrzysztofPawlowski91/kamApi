package pl.pawlowski.kamApi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controler {

    @GetMapping("/start")
    public String get(Model model){
        Frame frame=new Frame();
        model.addAttribute("name","Krzysztof");
        model.addAttribute("image",frame);

     return "start";

    }
}
