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


class SMSManager{
    public void smsManager(int waterLevel){
        System.out.println("Water Level is:"+waterLevel);
    }
}

class ContolPanel{
    private Alarm alarm;
    private Display display;
    private SMSManager smsManager;

    public ContolPanel() {
    }

    public ContolPanel(Alarm alarm, Display display, SMSManager smsManager) {
        this.alarm = alarm;
        this.display = display;
        this.smsManager = smsManager;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public SMSManager getSmsManager() {
        return smsManager;
    }

    public void setSmsManager(SMSManager smsManager) {
        this.smsManager = smsManager;
    }
}


public class Example {
    public static void main(String[] args) {

    }
}
