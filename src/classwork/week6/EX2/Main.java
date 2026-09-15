package classwork.week6.EX2;

public class Main {
    public static void main() {
        SmartThermostat room1 = new SmartThermostat("Living Room");
        room1.setTempurature(100);
        System.out.println("=======================");
        room1.setTempurature(68);
        System.out.println(room1.getCurrentTemp());
    }
}
