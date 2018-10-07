package application;

public class Model {
	public float calculate(long num1, long num2, String oper) {
		switch (oper) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			if (num2 == 0)
				return 0;
			else
				return num1 / num2;
		default:
			return 0;
		}
	}
}
