
package main;


public class SMSSender extends WaterLevelObserver{

    @Override
    public void update(int waterLevel) {
        System.out.println("Sending sms : "+waterLevel);
    }
    
}
