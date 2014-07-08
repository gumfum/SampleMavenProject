import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc;

	@Before
	public void init() {
		calc = new Calculator(1, 2);
	}

	@Test
	public void testPlus() {
		assertThat(calc.plus(), is(3));
	}

	@Test
	public void testMinus() {
		assertThat(calc.minus(), is(-1));
	}
}
