package basic;

public class Car {
    String color;
    String brand;
    int year;
    int horsePower;
    int seats;

    //constructor
    Car(){
        this.color = "White";
        this.brand = "";
        this.year = 2020;
        this.horsePower = 540;
        this.seats = 2;
    }

    Car(String color, String brand, int year){
        // 'this' refers to the instance that's being used
        this.color = color;
        brand = brand;
        year = year;

    }

    //-create methods with the same name with different set of parameters
    void drive(int speed) {
        System.out.println("Driving at" + this.brand + " km/h");
    }

    void drive(){
        System.out.println("Driving..." + this.brand);
    }

    void stop(){
        System.out.println("Stopping...");
    }
}
