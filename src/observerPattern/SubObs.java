
package observerPattern;

/**
 *
 * @author Ryan Darnell
 */
public abstract class SubObs implements ISubject, IObserver, IDisplay {

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(int value1, double value2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void registerObs(IObserver o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void removeObs(IObserver o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void notifyObs() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
