package co4programs;
import java.util.*;
public class Question09  {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;
         for (int i = 0; i < n - 1; i++) {
            swapped = false;
          for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
        public static void main(String[] args) {
        Integer[] intArray = {7,6,9,1,2,4};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));
        String[] stringArray = {"ashna","joshna","aswin","devika","saniya"};
        System.out.println("Original String array: " + Arrays.toString(stringArray));
        bubbleSort(stringArray)
 System.out.println("Sorted String array: " + Arrays.toString(stringArray));
    }
}
