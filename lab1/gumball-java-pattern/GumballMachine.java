
/**
 * Write a description of class GumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine
{
    // instance variables - replace the example below with your own
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;
    int variant_no;

    public GumballMachine(int numberGumballs,int variant_no)
    {
        // initialise instance variables
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState1(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        state = noQuarterState;
        this.count = numberGumballs;
        this.variant_no = variant_no;
        if (numberGumballs > 0) {
            System.out.println("Variant no. is: "+variant_no);
            
            if(variant_no==1){
                state = noQuarterState;
            }else if(variant_no==2){
                state = new NoQuarterState2(this);

            }else if(variant_no==3){ 
                state = new NoQuarterState3(this);
            }
           
        } 
    }
    
    public void insertQuarter(int coins[]) {
        state.insertQuarter(coins);
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
   
}
