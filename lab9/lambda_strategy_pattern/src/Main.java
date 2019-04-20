import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Calculator<Integer>> expressions = Arrays.asList((a, b) -> {
			System.out.print("Addition: \n" + a + " + " + b + " = ");
			return a + b;
		}, (a, b) -> {
			System.out.print("Difference: \n" + a + " - " + b + " = ");
			return a - b;
		}, (a, b) -> {
			System.out.print("Product: \n" + a + " * " + b + " = ");
			return a * b;
		}, (a, b) -> {
			System.out.print("Division: \n" + a + " / " + b + " = ");
			return a / b;
		});

		for (Calculator<Integer> calc : expressions) {
			System.out.println(calc.calculate(100, 25));
		}
	}

}
