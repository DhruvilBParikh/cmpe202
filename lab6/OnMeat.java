import java.util.ArrayList;
public class OnMeat extends Leaf
{
    
    protected ArrayList<String> onMeatToppings = new ArrayList<String>()  ;
     protected String description ;
    
    public OnMeat( String description )
    {
        super(description);
        this.description = description;
    }
    
    public void printReceipt(String type) {
    	 for(int i=0; i<onMeatToppings.size(); i++) 
         	System.out.println(onMeatToppings.get(i));
    }
    
    public void addChild(String item){
       onMeatToppings.add(item);
    }
    
}
