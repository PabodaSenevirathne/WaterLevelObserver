
package main;

public class Alarm extends WaterLevelObserver{

    @Override
    public void update(int waterLevel) {
        System.out.println(waterLevel>=50 ? "ON":"OFF");
    }
    
}
