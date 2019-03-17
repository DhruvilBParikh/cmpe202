 

public class Client {

    public static void runTest()
    {
        Component order = BuildOrder.getOrder() ;
        CustomerStrategy customer = new CustomerStrategy();
        customer.printReceipt(order);
        PackagingStrategy packaging = new PackagingStrategy();
        packaging.printReceipt(order);
    }
    
    public static void main( String [] args )
    {
        Client.runTest() ;
    }    
    
}
 
