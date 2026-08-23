import java.util.Random;

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
    public void sendSms(int waterLevel){
        System.out.println("Water Level is:"+waterLevel);
    }
}

class ContolPanel{
    private Alarm alarm;
    private Display display;
    private SMSManager smsManager;
    private int waterLevel;

    public ContolPanel() {
    }

    public ContolPanel(Alarm alarm, Display display, SMSManager smsManager , int waterLevel) {
        this.alarm = alarm;
        this.display = display;
        this.smsManager = smsManager;
        this.waterLevel=waterLevel;
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

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }


    public void notifyObject(){
        this.alarm.triggerAlarm(waterLevel);
        this.display.showWaterLevel(waterLevel);
        this.smsManager.sendSms(waterLevel);
    }


    public void setData(int waterLevel){
        if (this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyObject();
        }
    }


}


public class Example {
    public static void main(String[] args) {
        ContolPanel contolPanel=new ContolPanel();

        contolPanel.setAlarm(new Alarm("Alarm 1"));
        contolPanel.setDisplay(new Display());
        contolPanel.setSmsManager(new SMSManager());





        while (true){
            Random random=new Random();
            int randomNumber= random.nextInt(101);
            contolPanel.setData(randomNumber);


            try {
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("==================");
        }
    }
}
