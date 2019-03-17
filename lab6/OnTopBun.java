import java.util.ArrayList;

public class OnTopBun extends Leaf
{
	private String[] toppings ;
    
    protected ArrayList<String> toppingsOnTop = new ArrayList<String>()  ;
    protected String description ;
    
    public OnTopBun( String description )
    {
        super(description);
        this.description = description;
    }
    
    public void addChild(String item){
        toppingsOnTop.add(item);
    }
    
    public void printReceipt(String type) {
        for(int i=0; i<toppingsOnTop.size(); i++) 
        	System.out.println(toppingsOnTop.get(i));
    }
    
    public String getDescription() 
    {
        String description = "   " ;
        for ( int i = 0; i<toppings.length; i++ )
        {
            if (i>0) 
            	description += " + " + toppings[i] ;
            else
            	description = toppings[i] ;
        }        
        return description ;
    }
    
}
