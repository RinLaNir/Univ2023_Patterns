package task_12_2_2;

import java.util.HashMap;
import java.util.Map;

public class WheelFlyweightFactory {
    private final Map<Integer, Wheel> wheelCache = new HashMap<>();

    public Wheel getWheel(int diameter) {
        Wheel wheel = wheelCache.get(diameter);
        if (wheel == null) {
            wheel = new Wheel(diameter);
            wheelCache.put(diameter, wheel);
        }
        return wheel;
    }
}
