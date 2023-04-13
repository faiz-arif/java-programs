import java.util.*;

class Student {
    int rollNo;
    String Name;
    String Department;
    int academicMark;

    Student (int rollno, String name, String department, int aMark) {
        this.rollNo = rollno;
        this.Name = name;
        this.Department = department;
        this.academicMark = aMark;
    }
}

class Sports extends Student {
    String sportsGrade;
    Sports (int rollno, String name, String department, int aMark , String grade) {
        super( rollno, name, department, aMark);
        this.sportsGrade = grade;
    }
}

class Result extends  Sports {
    int Rank;

    Result (int rollno, String name, String department, int mark, String grade , int rank) {
        super( rollno, name , department, mark, grade);
        this.Rank = rank;
    }
    void display() {
        System.out.println("Roll NO: " + rollNo + " Name: " + Name + " Department: " + Department +" Academic Mark: " + academicMark + " Grade: " + sportsGrade +" Rank: " + this.Rank);
    }
}

class methods {
    Scanner scan = new Scanner(System.in);
    Result[] object;
    void insert() {
        System.out.println("Enter the Number of student:");
        int n = scan.nextInt();
        object = new Result[n];
        for(int i = 0; i < object.length; i++){
            System.out.println("Enter the Roll No, Name, Department and Academic Mark:");
            int rollno = scan.nextInt();
            String name = scan.next();
            String department = scan.next();
            int aMark = scan.nextInt();
            System.out.println("Enter the Grade in Sports:");
            String grade = scan.next();
            System.out.println("Enter the Rank:");
            int rank = scan.nextInt();
            object[i] = new Result(rollno, name,  department, aMark, grade, rank);
        }
    }
    void show() {
        System.out.println("Displaying");
        for(int i = 0; i < object.length; i++){
            object[i].display();
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        methods obj = new methods();
        obj.insert();
        obj.show();
    }
}
