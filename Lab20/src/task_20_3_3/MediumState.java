package task_20_3_3;

public class MediumState implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighState());
        System.out.println("Fan is high now");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowState());
        System.out.println("Fan is low now");
    }
}
