
public class Subtraction implements Calculator<Integer> {
	
	@Override
	public Integer calculate(Integer a, Integer b) {
		System.out.print("Subtraction: \n" + a + " - " + b + " = ");
		return a - b;
	}
	
}