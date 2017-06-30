package facade_pattern.with_facade;

/**
 * Created by cuikangyuan on 2017/6/28.
 */
public class SecurityFacade {

    private Camera camera1, camera2;
    private Light light1, light2, light3;
    private Sensor sensor;
    private Alarm alarm;

    public void activate() {
        camera1.turnOn();
        camera2.turnOn();
        light1.turnOn();
        light2.turnOn();
        light3.turnOn();
        sensor.activate();
        alarm.activate();
    }
}
