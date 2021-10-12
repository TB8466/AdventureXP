package adventurexp.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String displayHome(){
        return "home";
    }
}
