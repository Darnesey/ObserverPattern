
package observerPattern;

/**
 *
 * @author Ryan Darnell
 */
public interface ISubject {
    public void registerObs(IObserver o);
    public void removeObs(IObserver o);
    public void notifyObs();
}
