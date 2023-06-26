package CO4.Arithmetic;
import java.util.*;

interface Div{
    void division(float a, float b);
}

public class Division implements Div {
    public void division(float a, float b){
        System.out.println("The quotient of two numbers is: "+(a/b));
    }
}
