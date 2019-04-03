
public class CreditCardExpDecorator implements IDecorator {

	@Override
	public String decorate(String num) {
		// TODO Auto-generated method stub
		String stringWithoutSlash = num.replaceAll("/", "");
		if (stringWithoutSlash.length() == 2)
			num += "/";
		return num;
	}

}
