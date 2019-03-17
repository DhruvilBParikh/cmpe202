import java.text.DecimalFormat;

public class CustomerStrategy implements IStrategy
{
    
    public CustomerStrategy()
    {
        
    }

    public void printReceipt(Component order){
    	DecimalFormat fmt = new DecimalFormat("$0.00");
    	double subtotal = order.getPrice();
    	double tax = order.getPrice() * 0.09;
    	double total = subtotal + tax;
        System.out.println("Receipt\n\n");
        order.printReceipt("Customer");
        System.out.println("\nSub. Total:\t" + fmt.format(subtotal));
        System.out.println("Tax:\t\t" + fmt.format(tax));
        System.out.println("Total:\t\t" + fmt.format(total) + "\n\n");
    }
}
