package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements OperationInterface {
    int mArgumentOne;
    int mArgumentTwo;
    public Divide(int m1, int m2){
        mArgumentOne = m1;
        mArgumentTwo = m2;
    }

    @Override
    public String toString() {
        try {
            return mArgumentOne / mArgumentTwo + " " + "R: " + mArgumentOne % mArgumentTwo;
        }catch(Exception e){
            return "Can't divide by zero";
        }
    }
}
