package task_3_1;

public class CarBuilder {

    public Car buildCar(int enginePower, String engineType, int wheelDiameter, String wheelType) {
        Engine engine = new Engine(enginePower, engineType);
        Wheel wheel = new Wheel(wheelDiameter, wheelType);
        Car car = new Car(engine, wheel);

        int buildTime = engine.getBuildTime() + wheel.getBuildTime();
        System.out.println("Car build time: " + buildTime);

        return car;
    }
}
