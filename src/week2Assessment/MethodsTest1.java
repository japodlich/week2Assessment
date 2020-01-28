package week2Assessment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MethodsTest1 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void test() 
	{
		int test = Methods.addNumber(3, 5);
		boolean test2;
		if (test == 8)
		{
			test2 = true;
		}
		else
			test2 = false;
		assertEquals(true, test2);
	}

}
