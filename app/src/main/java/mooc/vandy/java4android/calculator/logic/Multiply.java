package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements OperationInterface{
    int mArgumentOne;
    int mArgumentTwo;
    public Multiply(int m1, int m2){
        mArgumentOne = m1;
        mArgumentTwo = m2;
    }
    @Override
    public String toString() {
        return String.valueOf(mArgumentOne*mArgumentTwo);
    }
}
