public class Main {

    public static void main(String[] args) {
        
        int coins1[] ={25};
        int coins2[] ={25,25};
        int coins3[]= {25,10,10,5};
        
        GumballMachine variant1 = new GumballMachine(5,1);
        GumballMachine variant2 = new GumballMachine(5,2);
        GumballMachine variant3 = new GumballMachine(5,3);
        
        System.out.println(variant1);
        variant1.insertQuarter(coins1);
        variant1.turnCrank();

        System.out.println(variant2);
        variant2.insertQuarter(coins2);
        variant2.turnCrank();
        
        System.out.println(variant3);
        variant3.insertQuarter(coins3);
        variant3.turnCrank();
        
    }
}