package co2;

import java.util.*;

class Functions{
    Scanner sc = new Scanner(System.in);
    void concatenation(){
        System.out.println("Enter the two strings you want to concatenate:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Result:");
        System.out.println(String.join(" ",str1,str2));
    }
    void upper(){
        System.out.println("Enter the string you want to convert to upper case:");
        String str = sc.nextLine();
        System.out.println("Entered String: "+str);
        System.out.println("Upper Case: "+str.toUpperCase());
    }
    void lower(){
        System.out.println("Enter the string you want to convert to lower case:");
        String str = sc.nextLine();
        System.out.println("Entered String: "+str);
        System.out.println("Lower Case: "+str.toLowerCase());
    }
    void length(){
        System.out.println("Enter the string to find the length:");
        String str = sc.nextLine();
        System.out.println("Length of the string: "+str.length());
    }
    void substring(){
        System.out.println("Enter the string to find the substring:");
        String str = sc.nextLine();
        System.out.println("Enter the first index:");
        int ind1 = sc.nextInt();
        System.out.println("Enter the second index:");
        int ind2 = sc.nextInt();
        System.out.println("Entered string: "+str);
        System.out.println("Substring of entered string: "+str.substring(ind1,ind2));
    }
    void replace(){
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String l1 = sc.nextLine();
        System.out.println("Enter the word to replace: ");
        String l2 = sc.nextLine();
        System.out.println("String before replacing: "+str);
        System.out.println("String replaced at the first occurrence only: "+str.replaceFirst(l1,l2));
        System.out.println("String replaced with every occurrence: "+str.replaceAll(l1,l2));
    }
    void split(){
        System.out.println("Enter the string to be split:");
        String str = sc.nextLine();
        String[] arrStr = str.split(" ");
        System.out.println("Array:");
        for(String x : arrStr){
            System.out.println(x);
        }
        System.out.println();
    }
}

public class Question3 {
    public static void main(String[] args) {
        Functions func = new Functions();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the choice:");
            System.out.println("1. String concatenation \n2. Convert to Upper Case\n3. Convert to lower case\n4. Find the length of the string\n5. Find the substring of a string\n6. Replace the string\n7. Split the string\n0. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: func.concatenation();
                        break;
                case 2: func.upper();
                        break;
                case 3: func.lower();
                        break;
                case 4: func.length();
                        break;
                case 5: func.substring();
                        break;
                case 6: func.replace();
                        break;
                case 7: func.split();
                        break;
                case 0: System.out.println("Exiting....!!");
                        break;
                default: System.out.println("Invalid Choice!!");
                        break;
            }
        }while(choice!=0);
    }
}