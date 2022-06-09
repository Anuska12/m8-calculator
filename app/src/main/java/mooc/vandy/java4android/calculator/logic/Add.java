package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements OperationInterface{
    int mArgumentOne;
    int mArgumentTwo;
    public Add(int m1, int m2){
       mArgumentOne = m1;
       mArgumentTwo = m2;
    }
    @Override
    public String toString(){
        return String.valueOf(mArgumentOne+mArgumentTwo);
    }

}
