package task_20_3_3;

public class LowState implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is medium now");
    }

    @Override
    public void turnDown(Fan fan) {}
}
