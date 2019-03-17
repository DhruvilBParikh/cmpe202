

public class PackagingStrategy implements IStrategy
{
    public PackagingStrategy()
    {
       
    }
    
    public void printReceipt(Component order){
        System.out.println("Packing Slit\n\n");
        order.printReceipt("Packing");
    }
}
