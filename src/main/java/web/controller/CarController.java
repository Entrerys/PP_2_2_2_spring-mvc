package web.controller;

import Model.Car;
import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {

    private CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {

        List<String> cars = carService.getCars(count, carService.getCarsQuery());

        model.addAttribute("cars", cars);

        return "cars";
    }
}
