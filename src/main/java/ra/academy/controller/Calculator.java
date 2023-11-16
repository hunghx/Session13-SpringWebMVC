package ra.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class Calculator {
    @GetMapping
    public String calculator() {
        return "caculator";
    }

    @PostMapping("/cal")
    public String doCal(Model model, @RequestParam double num1, @RequestParam double num2, @RequestParam String op) {
        double rs = 0;
        switch (op) {
            case "add":
                rs = num1 + num2;
                break;
            case "minus":
                rs = num1 - num2;
                break;
            case "div":
                if (num2 == 0) {
                    throw new RuntimeException("không chia hết cho 0");
                }
                rs = num1 / num2;
                break;
            case "multi":
                rs = num1 * num2;
                break;

        }
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("op",op);
        model.addAttribute("rs",rs);
        return "caculator";
    }
}
