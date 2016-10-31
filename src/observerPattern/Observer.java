
package observerPattern;

/**
 *
 * @author Ryan Darnell
 */
public class Observer extends SubObs{
    
    private int value1;
    private double value2;
    private Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.registerObs(this);
    }
    
    @Override
    public void update(int value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
        display();
    }

    @Override
    public void display() {
        System.out.println("---UPDATE---");
        System.out.printf("Value1 = %d\n", value1);
        System.out.printf("Value2 = %.2f\n", value2);
        System.out.println();
    }
    
}
