
import java.util.ArrayList;

public class CustomBurger extends Composite
{

    protected ArrayList<Component> customBurger = new ArrayList<Component>()  ;
    protected String description;
    protected double price;

    public CustomBurger(String description, double price)
    {
        
        super(description);
        this.description = description;
        this.price = price;
    }
    

    public void addChild(Component c){
        customBurger.add(c);
    }
    
    public void printReceipt(String type) {
        if(type.equalsIgnoreCase("Customer")){
            System.out.println("\n"+description+"\t\t$"+price);
            for(int i=0; i<customBurger.size(); i++)
            	customBurger.get(i).printReceipt(type);
        }
        else if(type.equalsIgnoreCase("Packing")) {
            
            System.out.println("\n"+description);
            for(int i=0; i<3; i++) {
            	for(int j=0; j<3; j++) {
            		switch(i) {

            			case 1: if(customBurger.get(j).getClass().getName().equalsIgnoreCase("OnTopBun")){
		                        	customBurger.get(j).printReceipt(type);
		                    	}
	            				break;
	            				
	            		case 2: if(customBurger.get(j).getClass().getName().equalsIgnoreCase("OnMeat")){
		                        	customBurger.get(j).printReceipt(type);
		                    	}
		        				break;
		        				
	            		case 3: if(customBurger.get(j).getClass().getName().equalsIgnoreCase("OnBottomBun")){
		                        	customBurger.get(j).printReceipt(type);
		                    	}
		        				break;
            		}
                }
            }
        }
    }
    
    
    public double getPrice(){
        return price;
    }
    
}
