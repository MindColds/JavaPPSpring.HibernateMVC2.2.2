package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String showCarList(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("showCar", carService.showCar(count));
        return "/cars";
    }

}
