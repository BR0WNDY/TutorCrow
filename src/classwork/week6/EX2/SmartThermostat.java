package classwork.week6.EX2;

public class SmartThermostat {
    private String roomName;
    private int currentTemperature;

    public SmartThermostat (String roomName){
        this.roomName = roomName;
        this.currentTemperature = 72;
    }

    public void setTempurature(int newTemp) {
        if (newTemp < 60 || newTemp > 85){
            System.out.println("Error You can not set this one");
        }else{
            this.currentTemperature = newTemp;
        }
    }
    public int getCurrentTemp(){
        return this.currentTemperature;
    }
    public void showTemp(){
        System.out.println("Room Name "+ this.roomName);
        System.out.println("Current Temperature " + this.currentTemperature);
    }
}
