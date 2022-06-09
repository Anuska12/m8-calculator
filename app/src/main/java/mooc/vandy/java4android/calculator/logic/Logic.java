package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        if(operation == ADDITION){
            Add a = new Add(argumentOne,argumentTwo);
            mOut.print(a.toString());
        }else if(operation == SUBTRACTION){
            Subtract s = new Subtract(argumentOne,argumentTwo);
                mOut.print(s.toString());
        }else if(operation == MULTIPLICATION){
            Multiply m = new Multiply(argumentOne,argumentTwo);
            mOut.print(m.toString());
        }else {
            if(operation == DIVISION) {
            Divide d = new Divide(argumentOne, argumentTwo);
            mOut.print(d.toString());
        }
        }
        
    }
}
