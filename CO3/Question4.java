package CO3;
import java.util.Scanner;

class Publisher
{
  String publicationName;
  public Publisher(String publicationName)
  {
    this.publicationName = publicationName;
  }
}

class Book extends Publisher
{
  String author;
  int price;

  public Book(String publisherName, String author, int price) {
    super(publisherName);
    this.author = author;
    this.price = price;
  }
  
}

class Litrature extends Book
{
  String genre, bookName;

  public Litrature(String publicationName, String author, int price, String genre, String bookName) {
    super(publicationName, author, price);
    this.genre = genre;
    this.bookName = bookName;
  }

  void display()
  {
    System.out.println("-------------------------------------------------");
    System.out.println("DETAILS OF LITRATURE"); 
    System.out.println("----------------------");
    System.out.println(
    "PUBLISHER: " + publicationName +
    "\nAUTHOR: " + author +
    "\nPRICE: " + price + 
    "\nGENRE: " + genre +
    "\nBOOKNAME: " + bookName);
    System.out.println("-------------------------------------------------");
  }
}

class Fiction extends Book
{
  String genre, bookName;

  public Fiction(String publicationName, String author, int price, String genre, String bookName) {
    super(publicationName, author, price);
    this.genre = genre;
    this.bookName = bookName;
  }

  void display()
  {
    System.out.println("-------------------------------------------------");
    System.out.println("DETAILS OF FICTION"); 
    System.out.println("----------------------");
    System.out.println(
    "PUBLISHER: " + publicationName +
    "\nAUTHOR: " + author +
    "\nPRICE: " + price + 
    "\nGENRE: " + genre +
    "\nBOOKNAME: " + bookName);
    System.out.println("-------------------------------------------------");
  }
}

public class Question4
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int ch;
    do
    {
      System.out.print("Choose an option:-\n1. Literature\n2. Fiction\n0. Exit\nOption: ");
      ch = sc.nextInt();
      switch(ch)
      {
        case 1: 
          System.out.print("ENTER PUBLISHER, AUTHOR, PRICE, GENRE, BOOK NAME: ");
          Litrature l = new Litrature(sc.next(),sc.next(),sc.nextInt(), sc.next(),sc.next());
          l.display();
          break;
        case 2: 
          System.out.print("ENTER PUBLISHER, AUTHOR, PRICE, GENRE, BOOK NAME: ");
          Fiction f = new Fiction(sc.next(),sc.next(),sc.nextInt(), sc.next(),sc.next());
          f.display();
          break;
        case 0:
        	System.out.println("EXITING...");
        	break;
        default:
          System.out.println("NOT VALID!!");
      }
    }while(ch != 0);
    sc.close();
  }
}