
public class NoQuarterState3 extends NoQuarterState1{
    GumballMachine variant3;

    
    public NoQuarterState3(GumballMachine variant3) {
        this.variant3 = variant3;
    }


    public void insertQuarter(int coins[]) {

        int total=0;
        boolean flag=false;
        if(coins.length >0){
            for(int i=0;i<coins.length;i++){

                if(coins[i]==25||coins[i]==10||coins[i]==5){
                    flag=true;

                }else{
                    flag=false;
                    break;
                }
            }
            
            if(flag){
                
                for(int i=0; i<coins.length; i++){
                    total =total+coins[i];
                }
                if(total==50){
                    System.out.println("You inserted a quarter in variant 3");
                    variant3.setState(variant3.getHasQuarterState());
                }else{
                    variant3.setState(variant3.getNoQuarterState());
                }
            }

        }else{
            variant3.setState(variant3.getNoQuarterState());
        }
        
    }

}