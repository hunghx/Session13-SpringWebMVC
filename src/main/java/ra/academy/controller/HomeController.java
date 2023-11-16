package ra.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ra.academy.model.Person;

import javax.servlet.http.HttpServletRequest;

@Controller // thành phần điều hướng trong mvc
@RequestMapping("/")
public class HomeController {
    @GetMapping // mặc định là get
    public String home1(Model model){
        // gửi dữ liệu sang
        Person p = new Person(1);
        model.addAttribute("name","Hùng hx");
        model.addAttribute("age",24);
        model.addAttribute("per",p);
        return "cart";
    }
    @GetMapping("/model")
    public ModelAndView model(){
//        ModelAndView modelAndView = new ModelAndView();
//         set view trả về
//        modelAndView.setViewName("model");
//         set thuộc tính
//        modelAndView.addObject("person", new Person());
        return new ModelAndView("model","person",new Person(1));
    }

}
