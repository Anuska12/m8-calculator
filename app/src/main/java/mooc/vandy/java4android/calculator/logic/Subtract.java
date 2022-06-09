package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements OperationInterface {
    int mArgumentOne;
    int mArgumentTwo;
    public Subtract(int m1, int m2){
        mArgumentOne = m1;
        mArgumentTwo = m2;
    }
    @Override
    public String toString() {
        return String.valueOf( mArgumentOne - mArgumentTwo );
    }

}
