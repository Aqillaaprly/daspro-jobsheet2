import java.util.Scanner;

public class PurchasePrice04 {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    String bookBrand;
    int price, quantity, pageCount;
    double totalPrice, purchasePrice, totalDiscount, discount;

    System.out.println("Input Book Brand");
    bookBrand=input.nextLine();
    System.out.println("Input price: ");
    price=input.nextInt();
    System.out.println("Input quantity: ");
    quantity=input.nextInt();
    System.out.println("Input Page Count");
    pageCount=input.nextInt();
    System.out.println("Input Discount");
    discount=input.nextInt();

    totalPrice=price*quantity;
    totalDiscount=totalPrice*discount;
    purchasePrice=totalPrice-totalDiscount;

    System.out.println("Book Brand: " +bookBrand);
    System.out.println("Book Page: " +pageCount);
    System.out.println("Total discount: " +totalDiscount);
    System.out.println("Final purchase price: " +purchasePrice);

    }
}
