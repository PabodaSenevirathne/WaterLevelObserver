
package main;


public class Display extends WaterLevelObserver{

    @Override
    public void update(int waterLevel) {
            System.out.println("Water Level : "+waterLevel);
    }
    
}
