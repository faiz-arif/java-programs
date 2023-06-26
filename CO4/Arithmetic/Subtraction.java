package CO4.Arithmetic;
import java.util.*;

interface Sub{
    void subtraction(float a, float b);
}

public class Subtraction implements Sub{
    public void subtraction(float a, float b){
        System.out.println("The difference of two numbers is: "+(a-b));
    }
}
