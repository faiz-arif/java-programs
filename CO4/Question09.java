package CO4;
import java.util.*;

class BubbleSort 
{
  public static <T extends Comparable<T>> void bubbleSort (T[] list, int size) 
  {
    int swap = 1, oc, ic; 
    T temp;
    // swapOccurred helps to stop iterating if the array gets sorted before 
    // outCounter reaches to size
    for (oc = size - 1; oc > 0 && swap == 1; oc--)
    {
      swap = 0;
      for (ic = 0; ic < oc; ic++)
      {
        if (list[ic].compareTo(list[ic+1]) > 0)
        {
          temp = list[ic];
          list[ic] = list[ic+1];
          list[ic+1] = temp;
          swap = 1;
        }
      }
    }
  }
}
 
public class Question09 
{
  public static void main (String[] args)
  {
    Integer arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    BubbleSort.bubbleSort(arr, arr.length);
 
    System.out.println("Sorted Array no 1: ");
    for(Integer i : arr)
    {
      System.out.println(i);
    }
    //separation1
    String arrx[] = {"Bmw","Audi","Ferrari","Mazerati","Koenigsegg","Lexus"};
    BubbleSort.bubbleSort(arrx, arrx.length);
 
    System.out.println("Sorted Array no 2: ");
    for(String i : arrx)
    {
      System.out.println(i);
    }
  }
}