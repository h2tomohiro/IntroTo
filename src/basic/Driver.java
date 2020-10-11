package basic;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Yellow", "Lamborghini", 2020);
        c1.color = "";
        c1.brand = "Lamborghini";
        c1.year = 2020;
        c1.horsePower = 550;
        c1.seats = 2;

        c1.drive();
        c1.stop();

        Car c2 = new Car();
        c2.color = "Red";
        c2.brand = "Ferrari";
        c2.year = 2019;
        c2.horsePower = 540;
        c2.seats = 2;

        System.out.println(c1.brand);
    }
}
