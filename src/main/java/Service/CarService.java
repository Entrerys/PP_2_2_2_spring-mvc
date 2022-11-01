package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarService {

    public List<String> getCars(int quantity, List<Car> cars) {
        List<String> filterCars = new ArrayList<>();
        if (quantity > cars.size()) {
            quantity = cars.size();
        }
        if (quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                filterCars.add(cars.get(i).toString());
            }
        }

        return filterCars;
    }

}
