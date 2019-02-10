public class NoQuarterState2 extends NoQuarterState1
{

    GumballMachine variant2;
    
    public NoQuarterState2(GumballMachine variant2) {
        this.variant2 = variant2;
    }
     
    public void insertQuarter(int coins[]) {

        if(coins.length == 2){
            
            if(coins[0] == 25 && coins[1]==25){
                System.out.println("You inserted a quarter in variant 2");
                variant2.setState(variant2.getHasQuarterState());
            }else{
                variant2.setState(variant2.getNoQuarterState());   
            }
               
        }
        
    }
    
}