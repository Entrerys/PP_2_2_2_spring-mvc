package Model;


public class Car {

    private int series;

    private String model;

    private Long price;

    public Car() {
    }

    public Car(int series, String model, Long price) {
        this.series = series;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
