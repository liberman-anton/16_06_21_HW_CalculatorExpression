import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculatorExpression {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(10, CalculatorExpression.calculate(" 1 + 6+  8-5"));
		assertEquals(0, CalculatorExpression.calculate(" 1 + 6er+  8-5"));
		assertEquals(0, CalculatorExpression.calculate(" 1 + 6er8+  8-5"));
		assertEquals(7, CalculatorExpression.calculate(" 1 + 5+  8/2"));
		assertEquals(0, CalculatorExpression.calculate(" 1 + 6+  8/0"));
		assertEquals(51, CalculatorExpression.calculate(" 1 + 6 *  8-5"));
		assertEquals(0, CalculatorExpression.calculate("ytd1 + 6uy *  8-5"));
		assertEquals(51, CalculatorExpression.calculate("1 + 6 *  8-5"));
		assertEquals(51, CalculatorExpression.calculate("     1 + 6 *  8-5"));
		assertEquals(0, CalculatorExpression.calculate("   hj  1 + 6 *  8-5"));
		assertEquals(0, CalculatorExpression.calculate("1 + 6 5 *  8-5"));
	}

}
