package task_3_1;

public class Car {
    private Engine engine;
    private Wheel wheel;

    Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void CarComponentsBuildTime() {
        System.out.println("Engine build time: " + engine.getBuildTime());
        System.out.println("Wheel build time: " + wheel.getBuildTime());
    }
}
