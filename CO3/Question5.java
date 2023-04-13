package CO3;
import java.util.Scanner;

class Student
{
  int studId;
  String name, address;
  public Student(int studId, String name, String address) {
    this.studId = studId;
    this.name = name;
    this.address = address;
  }
}

class Sports extends Student
{
  String sportName;
  int score;
  public Sports(int studId, String name, String address, String sportName, int score) {
    super(studId, name, address);
    this.sportName = sportName;
    this.score = score;
  }
}

class Result extends Sports
{
  int mark;

  public Result(int studId, String name, String address, int mark, String sportName, int score) {
    super(studId, name, address, sportName, score);
    this.mark = mark;
  }
  public void show()
  {
    System.out.println(
      "STUDENT_ID: " + studId 
      + "\nNAME: " + name 
      + "\nADDRESS: " + address 
      + "\nMAKR: " + mark 
      + "\nSPORTS_NAME: " + sportName
      + "\nSCORE: " + score);
  }
}

 class Question5
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER STUDENT_ID, NAME, ADDRESS, MARK, SPORT_NAME, SCORE :");
    Result obj = new Result(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
    obj.show();
  }
}