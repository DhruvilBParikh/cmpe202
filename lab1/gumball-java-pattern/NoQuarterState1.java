public class NoQuarterState1 implements State {
    GumballMachine variant1;
    
    public NoQuarterState1(){
    }
 
    public NoQuarterState1(GumballMachine variant1) {
        this.variant1 = variant1;
    }
 
    public void insertQuarter(int coins[]) {
        if(coins.length == 1){
            
            if(coins[0] == 25){
                System.out.println("You inserted a quarter in variant 1");
                variant1.setState(variant1.getHasQuarterState());
            }else{
                variant1.setState(variant1.getNoQuarterState());   
            }
                
        }
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}