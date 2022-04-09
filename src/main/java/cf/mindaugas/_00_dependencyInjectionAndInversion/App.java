package cf.mindaugas._00_dependencyInjectionAndInversion;

class Car {
    // no dependency injection
    private Engine engine = new Engine(100);
    private String manufacturer;

    // no dependency injection
    public Car() {
        this.engine = new Engine(100);
    }

    // constructor (dependency) injection
    public Car(Engine powering) {
        this.engine = powering;
    }

    // setter (dependency) injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void turnOn(){
        engine.on = true;
    }

    public void turnOff(){
        engine.on = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                " engine is on = " + engine.on +
                " engine is hp = " + engine.horsePower +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

class Engine {
    public int horsePower;
    public boolean on;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }
}

public class App {
    public static void main(String[] args) {
        var car = new Car();
        car.turnOn();
        System.out.println(car);
        car.turnOff();
        System.out.println(car);

        var sportsCar = new Car(new Engine(500));
        sportsCar.turnOn();
        System.out.println(sportsCar);
        sportsCar.turnOff();
        System.out.println(sportsCar);

        var toyCar = new Car();
        toyCar.setEngine(new Engine(1));
        toyCar.turnOn();
        System.out.println(toyCar);
        toyCar.turnOff();
        System.out.println(toyCar);
    }
}
