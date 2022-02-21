package com.vote;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;



public class CheckCases
{
	 @BeforeClass  
	    public static void setUpBeforeClass() throws Exception {  
	        System.out.println("It will run Before class");  
	    }  
	@Test
	public void Eligible1()
{  
     
    assertEquals(20,ifloop.Eligible1(96));  
}
	 @Test  
	    public void testFindMax()
	    {  
	        assertEquals(4,ifloop.findMax(new int[]{1,3,4,2}));  
	    }
		@Test
		public void withdraw()
	{  
	     
	    assertEquals(18000,ifloop.withdraw(9000));  
	}
}

