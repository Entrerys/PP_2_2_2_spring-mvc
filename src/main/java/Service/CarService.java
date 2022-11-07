package Service;

import Model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarsQuery();

    List<String> getCars(int quantity, List<Car> cars);
}
