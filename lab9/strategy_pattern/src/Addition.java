
public class Addition implements Calculator<Integer> {

	@Override
	public Integer calculate(Integer a, Integer b) {
		System.out.print("Addition: \n" + a + " + " + b + " = ");
		return a + b;
	}
	
}
