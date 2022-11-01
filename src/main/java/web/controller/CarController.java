package web.controller;

import Model.Car;
import Service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {

    CarService carService = new CarService();

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> temp = new ArrayList<>();


        temp.add(new Car(2005, "Ford", 500000L));
        temp.add(new Car(3, "Tesla", 1000000L));
        temp.add(new Car(3, "Tesla", 2000000L));
        temp.add(new Car(1010, "FordMustang", 2500000L));
        temp.add(new Car(2010, "Toyota", 900000L));

        List<String> cars = carService.getCars(count, temp);

        model.addAttribute("cars", cars);

        return "cars";
    }
}
