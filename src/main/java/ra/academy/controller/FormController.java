package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {
    @PostMapping(value = "/add")
    public String doAdd(@RequestParam("name") String name
            , @RequestParam("age") int age, Model model){
        System.out.println(name+age);
        model.addAttribute("name",name);
        model.addAttribute("age",age);

        return "profile";
    }
}
