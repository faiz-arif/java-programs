import java.sql.SQLSyntaxErrorException;
import java.util.*;

class Publisher {
    String publisherName;
    int Year;
    Publisher( String pName, int year){
        this.publisherName = pName;
        this.Year = year;
    }
}

class Book extends Publisher {
    String bookName;
    String Author;
    int bookPrice;
    int pageNo;

    Book( String pName, int year, String bName,String author, int price, int no) {
        super(pName, year);
        this.bookName = bName;
        this.Author = author;
        this.bookPrice = price;
        this.pageNo = no;
    }
}

class Literature extends Book {
    String literatureForm;
    Literature(String pName, int year, String bName,String author, int price, int no, String form){
        super( pName, year, bName, author, price, no);
        this.literatureForm = form;
    }
    void display() {
        System.out.println("Publisher: " + publisherName +" Published Year : " + Year);
        System.out.println("Name of the Book: " + bookName +  " Author Name:" + Author +" Price: " + bookPrice + " Page No: " + pageNo);
        System.out.println("Literature Form :" + literatureForm);
    }
}

class Fiction extends Book {
    String fictionType;
    Fiction(String pName, int year, String bName,String author, int price, int no, String type ){
        super( pName, year, bName, author, price, no);
        this.fictionType = type;
    }

    void display() {
        System.out.println("Publisher: " + publisherName +" Published Year : " + Year);
        System.out.println("Name of the  Book: " + bookName +  " Author Name: " + Author +" Price: " + bookPrice + " Page No: " + pageNo);
        System.out.println("Fiction Type :" + fictionType);
    }
}

public class Question4 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        Literature[] litObject;
        Fiction[] ficObject;
        int choice;
        System.out.println("OPTIONS:\n1.For Literature\n2.For Fiction\n0.For Exit");
        do{
            System.out.println("Enter your choice:");
            choice= scan.nextInt();
            switch (choice){
                case  1 : {
                    System.out.println("Enter the NO of Literature books:");
                    int n = scan.nextInt();
                    litObject = new Literature[n];
                    for(int i = 0; i < litObject.length; i++) {
                        System.out.println("Enter the Publisher Name ,published Year :");
                        String pName = scan.next();
                        int year = scan.nextInt();
                        System.out.println("Enter the  Name of the Book ,Author Name,Price and Page No:");
                        String bName = scan.next();
                        String bAuthor = scan.next();
                        int bPrice = scan.nextInt();
                        int pNo = scan.nextInt();
                        System.out.println("Enter Literature Form: ");
                        String form = scan.next();
                        litObject[i] = new Literature(pName, year, bName, bAuthor, bPrice, pNo, form);
                        }
                    System.out.println("\nDisplaying Literature Books:");
                    for(int i = 0; i < litObject.length;i++) {
                        litObject[i].display();
                        System.out.println();
                    }
                    break;
                }
                case 2 : {
                    System.out.println("Enter the NO of Fiction books:");
                    int n = scan.nextInt();
                    ficObject = new Fiction[n];
                    for(int i = 0; i < ficObject.length; i++) {
                        System.out.println("Enter the Publisher Name ,published Year :");
                        String pName = scan.next();
                        int year = scan.nextInt();
                        System.out.println("Enter the  Name of the Book ,Author Name,Price and Page No:");
                        String bName = scan.next();
                        String bAuthor = scan.next();
                        int bPrice = scan.nextInt();
                        int pNo = scan.nextInt();
                        System.out.println("Enter Fiction Type: ");
                        String type = scan.next();
                        ficObject[i] = new Fiction(pName, year, bName, bAuthor, bPrice, pNo, type);
                    }
                    System.out.println("\nDisplaying Fiction Books:");
                    for(int i = 0; i < ficObject.length;i++) {
                        ficObject[i].display();
                        System.out.println();
                    }
                    break;
                }
                case 0 : {
                    System.out.println("Exiting...!");
                    break;
                }
                default : {
                    System.out.println("Invalid Operations...!");
                    break;
                }
            }
        }while(choice!= 0);
    }
}

//    fairy tales, folklore
//    forms such as novel, prose, play, etc