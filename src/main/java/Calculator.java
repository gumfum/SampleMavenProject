public class Calculator {
	private int a, b;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int plus() {
		return a + b;
	}

	public int minus() {
		return a - b;
	}

	public int multiply() {
		return a * b;
	}

	public int devide() throws Exception {
		if (b == 0) {
			new ArithmeticException();
		}
		return a / b;
	}
}
