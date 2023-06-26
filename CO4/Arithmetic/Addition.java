package CO4.Arithmetic;
import java.util.*;

interface Add{
    void addition(float a, float b);
}

public class Addition implements Add {
    public void addition(float a, float b){
        System.out.println("The sum of two numbers is: "+(a+b));
    }
}
