package CO3;
import java.util.Scanner;

interface BillInterface
{
  int calc();
}

class Bill
{
  int[] productId, quantity, unit_price;
  char[] name;
  int net_amount;
  public Bill(int[] productId, char[] name, int[] quantity, int[] unit_price) {
    this.productId = productId;
    this.quantity = quantity;
    this.unit_price = unit_price;
    this.name = name;
  }

  public int calc(int size)
  {
    int net_amount=0;
    for(int i=0; i<size; i++)
    {
      net_amount += quantity[i]*unit_price[i];
    }
    return net_amount;
  }
}

public class Question7
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("HOW MANY PRODUCT: ");
    int size = sc.nextInt();
    int[] prodId = new int[size];
    char[] name = new char[size];
    int[] quantity = new int[size];
    int[] unit_price = new int[size];
    for(int i=0; i<size; i++)
    {
      System.out.println("ENTER DETAILS OF PRODUCT "+ (i+1) + " PRODUCT_ID, NAME, QUANTITY, UNIT_PRICE");
      prodId[i] = sc.nextInt();
      sc.nextLine();
      name[i] = sc.next().charAt(0);
      quantity[i] = sc.nextInt();
      unit_price[i] = sc.nextInt();
    }
    Bill obj = new Bill(prodId,name,quantity,unit_price);
    System.out.println("Net Amount: " + obj.calc(size));
    sc.close();
  }
}
