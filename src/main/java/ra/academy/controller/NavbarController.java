package ra.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/navbar")
public class NavbarController {
    @GetMapping
    public String home2(HttpServletRequest request){

        return "home";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }
    @GetMapping("/model")
    public String model(){
        return "model";
    }
}
