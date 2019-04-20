import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Calculator<Integer>> expressions = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(), new Division());

		for (Calculator<Integer> calc : expressions) {
			System.out.println(calc.calculate(100, 25));
		}
		
	}

}
