package week2Assessment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MethodsTest2 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void test() 
	{
		boolean test = Methods.biggerThen(10, 5);
		assertTrue(test);
	}
	
	@Test
	public void test2() 
	{
		boolean test = Methods.biggerThen(5, 10);
		assertFalse(test);
	}

}
