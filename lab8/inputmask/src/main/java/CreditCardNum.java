/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String number = "";
	private IDecorator decorator = null;

	public CreditCardNum() {
		// TODO Auto-generated constructor stub
		decorator = new CreditCardNumDecorator();
	}

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (number.equals(""))
			return "[4444 4444 4444 4444]" + "  ";
		else {
			number = decorator.decorate(number);
			return "[" + number + "]" + "  ";
		}

	}

	public void key(String ch, int cnt) {
		if (cnt <= 16) {
			if (!ch.equalsIgnoreCase("x"))
				number += ch;
			else{
				int n=number.length();
				if(n==5 || n==10 || n==15)
					number = number.substring(0, n - 2).trim();
				else
					number = number.substring(0, n - 1).trim();
				
			} 
				
		} else if (nextHandler != null)
			nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}