package CRT;

class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo plane is flying at low altitude");
    }
}

class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger plane is flying at medium altitude");
    }
}

class FighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Fighter plane is flying at high speed and altitude");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        Plane p;   // Parent reference

        p = new CargoPlane();
        p.takeOff();
        p.fly();
        p.land();

        System.out.println();

        p = new PassengerPlane();
        p.takeOff();
        p.fly();
        p.land();

        System.out.println();

        p = new FighterPlane();
        p.takeOff();
        p.fly();
        p.land();
    }
}
