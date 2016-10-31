
package observerPattern;

import java.util.ArrayList;

/**
 *
 * @author Ryan Darnell
 */
public class Subject extends SubObs{

    private ArrayList<IObserver> observers;
    private int value1;
    private double value2;
    
    public Subject(){
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObs(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObs(IObserver o) {
        if (observers.contains(o))
            observers.remove(o);
        else
            System.out.println("No observer with that information found");
    }

    @Override
    public void notifyObs() {
        for (IObserver obs : observers) {
            obs.update(value1, value2);
        }
    }
    
    public void setValues(int value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
        notifyObs();
    }
    
    public void setValue1(int value1) {
        this.value1 = value1;
        notifyObs();
    }
    
    public void setValue2(double value2) {
        this.value2 = value2;
        notifyObs();
    }
    
    
    
}
