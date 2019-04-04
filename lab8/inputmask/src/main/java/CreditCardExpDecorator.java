
public class CreditCardExpDecorator implements IDecorator {

	@Override
	public String decorate(String num) {
		// TODO Auto-generated method stub
		if (num.length() == 2)
			num += "/";
		return num;
	}

}
