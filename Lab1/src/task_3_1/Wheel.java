package task_3_1;

public class Wheel {
    private int diameter;
    private String type;
    private int buildTime;

    Wheel(int diameter, String type) {
        this.diameter = diameter;
        this.type = type;
        this.buildTime = randomBuildTime();
    }

    private int randomBuildTime() {
        return (int) (Math.random() * 15 + 1);
    }

    public int getDiameter() {
        return diameter;
    }

    public String getType() {
        return type;
    }

    public int getBuildTime() {
        return buildTime;
    }
}
