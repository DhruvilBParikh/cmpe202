
public class CreditCardNumDecorator implements IDecorator{

	@Override
	public String decorate(String num) {
		// TODO Auto-generated method stub
		
		String stringWithoutSpaces = num.replaceAll("\\s+", "");
		int length = stringWithoutSpaces.length();
		if(length==4 || length==8 || length==12)
			num += " ";
		return num;
	}

}
