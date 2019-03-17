import java.util.ArrayList;

public class OnBottomBun extends Leaf
{
    
    protected ArrayList<String> toppingsOnBottom = new ArrayList<String>()  ;
    protected String description ;
    
    
    public OnBottomBun( String description )
    {
        super(description) ;
        this.description = description;
    }
     
    public void addChild(String item){
        toppingsOnBottom.add(item);
    }
    
    public void printReceipt(String type) {
    	for(int i=0; i<toppingsOnBottom.size(); i++) 
        	System.out.println(toppingsOnBottom.get(i));
    }
    
    public String getDescription() 
    {
        return "";
    }
    
}
