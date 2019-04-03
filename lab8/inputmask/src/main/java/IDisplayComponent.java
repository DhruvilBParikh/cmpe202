/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public interface IDisplayComponent
{

    String display() ;								// Display all UI components on a Screen
    void addSubComponent( IDisplayComponent c ) ;	// Add a Nested / Subcomponent 
    
}
