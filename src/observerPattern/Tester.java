
package observerPattern;

/**
 *
 * @author Ryan Darnell
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject sub = new Subject();
        
        Observer obs1 = new Observer(sub);
        DifferentObserver difObs = new DifferentObserver(sub);
        
        sub.setValues(0, 0);
        sub.setValues(5, 4.1);
        sub.setValue1(7);
        sub.setValue2(9.21435);
    }
    
}
