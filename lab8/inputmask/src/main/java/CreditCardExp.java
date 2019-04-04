/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String date = "";
	private IDecorator decorator = null;

	public CreditCardExp() {
		// TODO Auto-generated constructor stub
		decorator = new CreditCardExpDecorator();
	}

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (date.equals(""))
			return "[MM/YY]" + "  ";
		else {
			date = decorator.decorate(date);
			return "[" + date + "]" + "  ";
		}
	}

	public void key(String ch, int cnt) {
		if (cnt >= 17 && cnt <= 20) {
			if (!ch.equalsIgnoreCase("x"))
				date += ch;
			else {
				int n=date.length();
				if(date.length()==3) {
					date = date.substring(0, n-2).trim();
				}
				else {
					date = date.substring(0, n-1).trim();
				}
			}
				
		}
		else if (nextHandler != null)
			nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}