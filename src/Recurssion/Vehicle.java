package Recurssion;

public class Vehicle {
    // Method 1:
    public void recursiveMethod1(int n) {
        if (n > 0) {
            System.out.println("Method 1: " + n);
            recursiveMethod1(n - 1);
        }
    }

    // Method 2:
    protected void recursiveMethod2(int n) {
        if (n > 0) {
            System.out.println("Method 2: " + n);
            recursiveMethod2(n - 1);
        }
    }

    // Method 3:
    void recursiveMethod3(int n) {
        if (n > 0) {
            System.out.println("Method 3: " + n);
            recursiveMethod3(n - 1);
        }
    }

    // Method 4:
    void recursiveMethod4(int n) {
        if (n > 0) {
            System.out.println("Method 4: " + n);
            recursiveMethod4(n - 1);
        }
    }
}

class Car extends Vehicle {
    // Method 5:
    public void recursiveMethod5(int n) {
        if (n > 0) {
            System.out.println("Method 5: " + n);
            recursiveMethod5(n - 1);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.recursiveMethod1(5);

        Car car = new Car();
        car.recursiveMethod2(5);
        car.recursiveMethod3(4);
        car.recursiveMethod4(5);
        car.recursiveMethod5(8);

        // Access modifiers:
        // Method 1: public
        // Method 2: protected
        // Method 3: private
        // Method 4: default (no explicit modifier)
        // Method 5: public (inherited from Vehicle and overridden in Car)
    }
}
