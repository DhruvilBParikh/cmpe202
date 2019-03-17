

public class PackagingStrategy implements IStrategy
{
    public PackagingStrategy()
    {
       
    }
    
    public void printReceipt(Component order){
        System.out.println("Packing Slit");
        order.printReceipt("Packing");
    }
}
