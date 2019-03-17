 

public interface Component {

     void printReceipt(String type) ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     double getPrice();
}
 
