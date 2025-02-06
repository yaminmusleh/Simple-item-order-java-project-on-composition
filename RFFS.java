
package rffs;
/*hope you like it <3
  also this code was written using netbeans*/
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
class Item{
    static int c=0;
    private int ino=++c;
    private double price;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIno() {
        return ino;
    }

    @Override
    public String toString() {
        return "Item{" + "ino=" + ino + ", price=" + price + '}';
    }
    
    
}
class Order{
    static int l=0;
    private int OrderId=++l;
    private LocalDate date;
   private  Item[]items;

    public Order(LocalDate date, Item[] items) {
        this.date = date;
        this.items = items;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getOrderId() {
        return OrderId;
    }

    @Override
    public String toString() {
        return "Order{" + "OrderId=" + OrderId + ", date=" + date + ", items=" + Arrays.toString(items) + '}';
    }
   
}
class oMan{
    ArrayList<Order>orders = new ArrayList<>();
    void addAnOrder(){
        System.out.println("enter the number of your Items: ");
        int n=Integer.parseInt( RFFS.sc.nextLine());
         System.out.println("enter the prices of your items: ");
         double price[]=new double[n];
         Item[]items= new Item[n];
        for(int i=0;i<n;i++){
       price[i]=Integer.parseInt( RFFS.sc.nextLine());
        }
        for(int x=0;x<price.length;x++){
            items[x]=new Item(price[x]);
        }
       Order orr=new Order(LocalDate.now(),items);//adding the whole array
       orders.add(orr);
        System.out.println(orders);
        System.out.println("do you want the sum of your prices?: ");
        String result = RFFS.sc.nextLine();
        double sum=0;
        switch(result){
            case "yes":
            case "Yes":
            case "YES":
               
                for(int i = 0;i<price.length;i++){
                    sum+=price[i];
                }
                System.out.println(sum);
                break;
            default : System.out.println("Have a nice day, come back soon!");
        }
        System.out.println();
    }
     
}
public class RFFS {
static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Type a number between 1-5 to add an order: ");
        int result = Integer.parseInt(sc.nextLine());
        switch(result){
            case 1:
            case 2:
                case 3:
                case 4: 
                case 5:
                    oMan oo= new oMan();
                    oo.addAnOrder();
                    break;
                default:
                    System.out.println("invalid");
        }
        
  }
    
}
