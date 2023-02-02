package task_3_1;

public class task_3_1_main {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator();
        carSimulator.buildCar(100, "Diesel", 15, "Summer");
        carSimulator.simulateCarRunTime(1000);
    }
}
