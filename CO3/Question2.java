import java.util.*;

class Employee {
    int Empid, Salary;
    String  Name,Address;
    Employee (int id, String name ,int salary,String address) {
        this.Empid = id;
        this.Name = name;
        this.Salary = salary;
        this.Address = address;
    }

}
class Teacher extends Employee {
    String Department;
    String Subject;
    Teacher(int id, String name ,int salary,String address,String department ,String subject) {
        super(id, name, salary, address);
        this.Department = department;
        this.Subject = subject;
    }
    void display() {
        System.out.println("Employee ID: "+ Empid + " Name: " + Name + " Salary: " + Salary + " Address: " + Address);
        System.out.println("Department: " + this.Department + " Subjects taught: " + this.Subject);
    }
}

class functions {
    Scanner scan = new Scanner(System.in);
    Teacher[] object;
    void insert() {
        System.out.println("Enter the number of Teacher:");
        int n =  scan.nextInt();
         object = new Teacher[n];
        for(int i = 0; i < object.length; i++) {
            System.out.println("Enter the Details:");
            System.out.println("Enter the Employee ID, Name, Salary and Address of the Teacher:");
            int id = scan.nextInt();
            String name = scan.next();
            int salary = scan.nextInt();
            String address = scan.next();
            System.out.println("Enter the Department and Subjects taught :");
            String department = scan.next();
            String subject = scan.next();
            object[i] = new Teacher(id,name,salary,address,department,subject);
        }
    }
    void display() {
        for(int i = 0; i < object.length; i++) {
            object[i].display();
        }
    }
}
public class Question2 {
    public static void main(String[] args) {
        functions object = new functions();
        object.insert();
        object.display();
    }
}
