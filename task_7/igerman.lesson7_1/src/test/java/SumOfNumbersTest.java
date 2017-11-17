import static junit.framework.TestCase.assertEquals;

import org.junit.Test;


public class SumOfNumbersTest {

	@Test
	public void shouldSumNumbers() {

		int result = SumOfNumbers.sum(123456);

		assertEquals(21, result);
	}

	@Test
	public void shouldSumNumbers2() {

		int result = SumOfNumbers.sum(654321);

		assertEquals(21, result);
	}

	@Test
	public void shouldSumNumbers3() {

		int result = SumOfNumbers.sum(246810);

		assertEquals(21, result);
	}
}
