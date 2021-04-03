package soen.tutorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {


	@Test
	public void testAdd()
	{

		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.addOrSub(2, 6);
		Integer expected = 8;
		Integer Notexpected = 2;
		//assertEquals(expected, actual);
		assertEquals(Notexpected, actual);

	}
/*
    @Test
    public void testSub()
    {

        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.addOrSub(6, 2);
        Integer expected = 4;
        assertEquals(expected, actual);

    }
    */

}
