package projectanudip;
	class Vehicle {
    String brand;
    String model;
    int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("The " + brand + " " + model + " is driving.");
    }
}
class Car extends Vehicle {
    String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " is honking.");
    }
}
public class CarProgram {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020, "Red");
        myCar.drive();
        myCar.honk();
    }
}
