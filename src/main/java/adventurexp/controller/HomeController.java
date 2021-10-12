package adventurexp.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String displayHome(){
        return "home";
    }
}
