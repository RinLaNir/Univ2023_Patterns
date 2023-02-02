package task_3_1;

public class CarSimulator {

    private CarBuilder carBuilder;
    private Car car;

    CarSimulator() {
        carBuilder = new CarBuilder();
    }

    public void buildCar(int enginePower, String engineType, int wheelDiameter, String wheelType) {
        this.car = carBuilder.buildCar(enginePower, engineType, wheelDiameter, wheelType);
    }

    public void simulateCarRunTime(int distance ) {
        int time = distance / car.getEngine().getPower();
        System.out.println("Car run time: " + time);
    }
}
