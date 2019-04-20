
public class Division implements Calculator<Integer> {

	@Override
	public Integer calculate(Integer a, Integer b) {
		System.out.print("Division: \n" + a + " / " + b + " = ");
		return a / b;
	}
	
}
