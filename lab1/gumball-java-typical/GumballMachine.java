/**
 * Write a description of class GumballVariant1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine
{
    // instance variables - replace the example below with your own
    private int num_gumballs;
    private boolean has_quarter;
    private int variant_no;

    /**
     * Constructor for objects of class GumballMachine
     */
    public GumballMachine(int size, int variant_no)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.variant_no = variant_no;
        this.has_quarter = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void insertQuarter(int coin[])
    {
        // put your code here
        switch(variant_no){
            
            case 1: if(coin.length == 1){
                        if(coin[0] == 25)
                            this.has_quarter = true;
                        else
                            this.has_quarter = false;
                    }
                    else{
                        this.has_quarter = false;
                    }
                    break;
            
            case 2: if(coin.length == 2){
                        if(coin[0] == 25 && coin[1] == 25)
                            this.has_quarter = true;
                        else
                            this.has_quarter = false;
                    }
                    else{
                        this.has_quarter = false;
                    }
                    break;
                   
            case 3: int totalAmount = 0;
                    boolean flag = false;
                    if(coin.length > 0){
                        for(int i=0; i<coin.length; i++){
                            if(coin[i]==5 || coin[i]==10 || coin[i]==25){
                                totalAmount = totalAmount + coin[i];
                                flag = true;
                            }else{
                                flag = false;
                                break;
                            }
                        }
                        if(flag && totalAmount == 50){
                            this.has_quarter = true;
                        }else{
                            this.has_quarter = false;
                        }
                    }else{
                        this.has_quarter = false;
                    }
                    break;
           default:
        }
    }
    
    public void turnCrank()
    {
        if(this.has_quarter)
        {
            if(num_gumballs > 0)
            {
                this.num_gumballs--;
                this.has_quarter = false;
                System.out.println("Thanks for the coins. Gumball Ejected!");
            }
            else
            {
                System.out.println("No more Gumablls. Sorry, can't return your coins.");
            }
        }
        else
        {
            System.out.println("Please Insert required amount!");
        }
    }            
    
}
