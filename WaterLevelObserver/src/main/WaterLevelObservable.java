
package main;

import java.util.ArrayList;


public class WaterLevelObservable {
    private int waterLvel;
    private ArrayList<WaterLevelObserver> observers=new ArrayList<>();
    
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.add(waterLevelObserver);
    }
    public void removeWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.remove(waterLevelObserver);
    }    
    public void notifyObservers(){
        for (WaterLevelObserver observer : observers) {
            observer.update(waterLvel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLvel!=waterLevel){
            this.waterLvel=waterLevel;
            notifyObservers();
        }
    }
}
