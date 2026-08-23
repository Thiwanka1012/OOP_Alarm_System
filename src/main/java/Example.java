class Alarm{
    String alarmId;

    public Alarm(String alrmId) {
        this.alarmId = alrmId;
    }

    public void triggerAlarm(int waterLevel){
        if (waterLevel>=50){
            System.out.println("Alarm"+alarmId+"On");
        }else {
            System.out.println("Alarm"+alarmId+"Off");
        }
    }
}



class Display{
    public void showWaterLevel(int waterLevel){
        System.out.println("Water level is:"+waterLevel);
    }
}


public class Example {
    public static void main(String[] args) {

    }
}
