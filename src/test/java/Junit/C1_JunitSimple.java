package Junit;

import org.junit.*;

public class C1_JunitSimple {
	
	
	@After
	public void aftermethod(){
		System.out.println("after");
	}
	
	@Before
	
	
	public void beforemethod(){
		System.out.println("Before");
	}
	
	@Test
	
	public void testmethod(){
		System.out.println("test");
	}
	

}
