
public class Multiplication implements Calculator<Integer> {

	@Override
	public Integer calculate(Integer a, Integer b) {
		System.out.print("Multiplication: \n" + a + " * " + b + " = ");
		return a * b;
	}
	
}