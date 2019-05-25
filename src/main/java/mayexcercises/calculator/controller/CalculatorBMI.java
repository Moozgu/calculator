package mayexcercises.calculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorBMI {
    @GetMapping("/calculator")
    public String bmiCalculator(){
        return "calculator_form";
    }
    @PostMapping("/calculator")
    public String bmiCalculator(
            @RequestParam("weight") int weight,
            @RequestParam("height") double height,
            Model model)
    {
        model.addAttribute("bmi",(weight/(height*height)));
        System.out.println((weight/(height*height)));
        return "calculator_result";
    }
}
