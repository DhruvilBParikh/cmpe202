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
		if (cnt >= 17 && cnt <= 20)
			date += ch;
		else if (nextHandler != null)
			nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}