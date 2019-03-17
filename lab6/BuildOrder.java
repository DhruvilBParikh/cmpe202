 

public class BuildOrder {

    public static Component getOrder()
    {
        Component order = new Composite("Order");
        
        CustomBurger customBurger = new CustomBurger("LBB",5.59);
        
        OnTopBun onTopBun=new OnTopBun("On Top Bun");
        onTopBun.addChild("LETTUCE");
        onTopBun.addChild("TOMATO");
        
        OnBottomBun onBottomBun=new OnBottomBun("On Bottom Bun");
        onBottomBun.addChild("{{{{BACON}}}}");
       
        OnMeat onMeat=new OnMeat("On Meat");
        onMeat.addChild("->|G ONION");
        onMeat.addChild("->|JALA Grilled");
        
        customBurger.addChild( onBottomBun ) ;
        customBurger.addChild( onTopBun ) ;
        customBurger.addChild( onMeat ) ;
       
        order.addChild( customBurger ); 
        order.addChild(new Leaf("LTL CAJ", 2.79 ));
        
        return order ;
    }

}

