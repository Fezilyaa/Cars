package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/cars")
    public String numberOfCars(@RequestParam(value = "count", required = false) Integer number, Model model) {
        model.addAttribute("car", carService.listCars(number));
        return "cars";
    }

}