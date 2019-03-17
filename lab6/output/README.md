Five Guys Burger Design Pattern:

I have used Composite Pattern and Strategy Pattern.

For Custom Burger order with n number of toppings on top bun, on bottom bun and on meat, I have used composite patterns i.e. adding child components to customized burger and OnTopBun, OnbottomBun and OnMeat as children of customized burger.

To print receipts in two formats, customer receipt and packing slit, I have used Strategy Pattern. It has one IStrategy interface which has method print. Two classes, CustomerStrategy and PackagingStrategy implement that interface and print receipt in their own way.