
package observerPattern;

/**
 *
 * @author Ryan Darnell
 */
public class DifferentObserver extends SubObs{
    
    private int value1 = 0;
    private double value2 = 0;
    private Subject subject;

    public DifferentObserver(Subject subject) {
        this.subject = subject;
        subject.registerObs(this);
    }
    
    @Override
    public void update(int value1, double value2) {
        this.value1 += value1;
        this.value2 += value2;
        display();
    }

    @Override
    public void display() {
        System.out.println("---UPDATE FROM DIFFERENT OBSERVER---");
        System.out.printf("Sum of Value1's = %d\n", value1);
        System.out.printf("Sum of Value2's = %.2f\n", value2);
        System.out.println();
    }

}
