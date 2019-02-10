
/**
 * Write a description of class GumballCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballCheck
{
    public static void main(String args[]){
        
        GumballMachine variant1 = new GumballMachine(5,1);
        GumballMachine variant2 = new GumballMachine(5,2);
        GumballMachine variant3 = new GumballMachine(5,3);
        
        int coins1[] = {25};
        int coins2[] = {25,25};
        int coins3[] = {25,5,10,10};
        
        variant1.insertQuarter(coins1);
        variant1.turnCrank();
        
        variant2.insertQuarter(coins2);
        variant2.turnCrank();
        
        variant3.insertQuarter(coins3);
        variant3.turnCrank();
        
    }
}
