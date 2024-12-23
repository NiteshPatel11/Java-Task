class Car {
    String model;
    int year;
    double price;

    void CarDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota Corolla";
        car1.year = 2020;
        car1.price = 20000.0;

        Car car2 = new Car();
        car2.model = "Honda Civic";
        car2.year = 2022;
        car2.price = 22000.0;

        car1.CarDetails();
        car2.CarDetails();
    }
}
