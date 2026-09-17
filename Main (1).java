import java.util.*;

abstract class Vehicle {
    String driver, number;
    Vehicle(String d, String n) { driver = d; number = n; }
    abstract double fare(double km);
    abstract String type();
}

class Car extends Vehicle {
    Car(String d, String n) { super(d,n); }
    double fare(double km) { return 50 + km*15; }
    String type() { return "Car"; }
}

class Bike extends Vehicle {
    Bike(String d, String n) { super(d,n); }
    double fare(double km) { return 20 + km*8; }
    String type() { return "Bike"; }
}

class Auto extends Vehicle {
    Auto(String d, String n) { super(d,n); }
    double fare(double km) { return 30 + km*10; }
    String type() { return "Auto"; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Auto");
        System.out.print("Choose vehicle: ");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Driver name: ");
        String driver = sc.nextLine();

        System.out.print("Vehicle number: ");
        String number = sc.nextLine();

        System.out.print("Distance (km): ");
        double km = sc.nextDouble();

        Vehicle v;

        if (ch == 1)
            v = new Car(driver, number);
        else if (ch == 2)
            v = new Bike(driver, number);
        else
            v = new Auto(driver, number);

        System.out.println("\nVehicle Type : " + v.type());
        System.out.println("Driver       : " + driver);
        System.out.println("Vehicle No   : " + number);
        System.out.println("Distance     : " + km + " km");
        System.out.println("Fare         : Rs." + v.fare(km));

        sc.close();
    }
}
