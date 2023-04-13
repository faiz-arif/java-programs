import java.util.*;
import java.text.DateFormat;
import java.util.Calendar;
interface calculate {
    double Total(int quantity, float price);
    void NetAmount();
}

class Order implements calculate {
    Calendar cal = Calendar.getInstance();
    DateFormat DFormat = DateFormat.getDateInstance();
    String date;
    int orderNo;
    double Net_Amount;

    Product[] pObject;
    Scanner scan = new Scanner(System.in);
    Order (int no) {
        this.orderNo = no;
        this.date =  DFormat.format(cal.getTime());
        System.out.println("Enter the No: of products:");
        int n = scan.nextInt();
        pObject = new Product[n];
        for(int i = 0; i < pObject.length; i++){
            System.out.println("Enter the product ID, Name, Quantity and Unit Price:");
            int id = scan.nextInt();
            String name = scan.next();
            int quantity = scan.nextInt();
            float price = scan.nextFloat();
            pObject[i] = new Product( id, name, quantity, price);
        }
        this.NetAmount();
    }
    public double  Total(int quantity, float price) {
        return quantity * price;
    }
    public void NetAmount() {
        for( int i = 0; i < pObject.length; i++){
            this.Net_Amount += pObject[i].total;
        }
    }

    class Product {
        int ProductId, Quantity;
        float unitPrice;
        String Name;
        double total;
        Product(int id,String name, int quantity, float Price) {
            this.ProductId = id;
            this.Name = name;
            this.Quantity = quantity;
            this.unitPrice = Price;
            this.total = (float)Total(this.Quantity,this.unitPrice);
        }
    }


    void display (){
        System.out.println("Order No:" + this.orderNo);
        System.out.println("Date:" + this.date);
        System.out.println("ProductId   Name   Quantity   unit price   Total");
        System.out.println("---------------------------------------------------------------------------------------------------");
        for(int i = 0; i < pObject.length; i++){
            System.out.println(pObject[i].ProductId +"  " + pObject[i].Name + "   " + pObject[i].Quantity + "   " + pObject[i].unitPrice + "   " + pObject[i].total);
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Net.Amount:" + Net_Amount);
    }
}
public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Orders:");
        int n = scan.nextInt();
        Order[] object =  new Order[n];
        for (int i = 0; i < object.length; i++) {
            System.out.println("Enter the Order No:");
            int no = scan.nextInt();
            object[i] = new Order(no);
        }
        System.out.println("Displaying..........");
        for (int i = 0; i < object.length; i++) {
            object[i].display();
            System.out.println();
        }
    }
}
