package CO3;

import java.util.*;

class Person {
    String Name, Gender, Address;
    int Age;

    Person(String name ,String gender , String address, int age) {
        this.Name = name;
        this.Gender = gender;
        this.Address = address;
        this.Age = age;
    }
}

class Employees extends Person {
    int Emp_id ;
    String Company_name;
    String Qualification;
    int Salary;
    Employees(String name , String gender , String address, int age, int id ,String company_name, String qualification, int salary) {
        super(name ,gender,address,age);
        this.Emp_id = id;
        this.Company_name = company_name;
        this.Qualification = qualification;
        this.Salary = salary;
    }

}
class Teachers extends Employees {
    String Department;
    String Subject;
    int Teacher_id;

    Teachers(String name, String gender, String address, int age, int id, String company_name, String qualification, int salary, String department, String subject, int teacher_id) {
        super(name, gender, address, age, id, company_name, qualification, salary);
        this.Department = department;
        this.Subject = subject;
        this.Teacher_id = teacher_id;
    }

    void display() {
        System.out.println("Name: " + Name + " Gender: " + Gender + " Address: " + Address + " Age: " + Age);
        System.out.println("Employee ID: " + Emp_id + " Company Name: " + Company_name + " Salary: " + Salary + " Qualification: " + Qualification);
        System.out.println("Department: " + this.Department + " Subjects taught: " + this.Subject + " Teacher's ID: " + this.Teacher_id);
    }
}

class Functions1 {
    Scanner scan = new Scanner(System.in);
    Teachers[] object;
    void insert() {
        System.out.println("Enter the number of Teacher:");
        int n =  scan.nextInt();
        object = new Teachers[n];
        for(int i = 0; i < object.length; i++) {
            System.out.println("Enter the Details:");
            System.out.println("Enter the Name, Gender, Address and Age of the Teacher:");
            String name = scan.next();
            String gender = scan.next();
            String address = scan.next();
            int age = scan.nextInt();
            System.out.println("Enter the Employee_ID, Company Name, Salary and Qualification:");
            int id = scan.nextInt();
            String company_name = scan.next();
            int salary = scan.nextInt();
            String qualification = scan.next();
            System.out.println("Enter the Department, Subjects taught and Teacher ID:");
            String department = scan.next();
            String subject = scan.next();
            int teacher_id =  scan.nextInt();
            object[i] = new Teachers( name, gender, address, age, id, company_name, qualification, salary, department, subject, teacher_id);
        }
    }
    void display() {
        for(int i = 0; i < object.length; i++) {
            object[i].display();
            System.out.println("-------------------------------------------------------------------------------------------------");
        }
    }
}
 class Question3 {
    public static void main(String[] args) {
        Functions1 object = new Functions1();
        object.insert();
        object.display();
    }
}
