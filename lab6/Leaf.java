
public class Leaf implements Component {

    protected String description ;
    protected double price ;

    public Leaf ( String description, double price )
    {
        this.description = description ;
        this.price = price ;
    }
    
    public Leaf ( String description )
    {
        this.description = description ;
    }
    
    public void printReceipt(String type) {
        if(type.equalsIgnoreCase("Customer")){
            System.out.println("\n"+description+"\t\t$"+price);
        }else if(type.equalsIgnoreCase("Packing")){
            System.out.println("\n"+description);
        }
    }
    
    public double getPrice(){
        return price;
    }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
     
}
 