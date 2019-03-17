import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    
    public Composite ( String description )
    {
        this.description = description ;
    }
    
    public void printReceipt(String type) {
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printReceipt(type);
        }
    }
    
    public double getPrice(){
        double totalPrice=0.0;
        for (Component obj  : components)
        {
            totalPrice += obj.getPrice();
        }
        return totalPrice;
    }
            

    public void addChild(Component c) {
        components.add( c ) ;
    }
	 
    public void removeChild(Component c) {
        components.remove(c) ;
    }
	 
    public Component getChild(int i) {
	    return components.get( i ) ;   
    }
	 
}
 