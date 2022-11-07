package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarsQuery() {
        List<Car> temp = new ArrayList<>();
        temp.add(new Car(2005, "Ford", 500000L));
        temp.add(new Car(3, "Tesla", 1000000L));
        temp.add(new Car(3, "Tesla", 2000000L));
        temp.add(new Car(1010, "FordMustang", 2500000L));
        temp.add(new Car(2010, "Toyota", 900000L));

        return temp;
    }

    @Override
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
