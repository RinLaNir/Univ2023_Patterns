package task_3_1;

public class Engine {
    private int power;
    private String type;
    private int buildTime;

    Engine(int power, String type) {
        this.power = power;
        this.type = type;
        this.buildTime = 15;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public int getBuildTime() {
        return buildTime;
    }
}
