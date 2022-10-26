package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginList {
	
	@Test
	public void test1() {
		
		System.out.println("inside test1");
		Assert.assertEquals("Sowmya", "Sowmya"); //true
	}
	

	@Test
	public void test2() {
		
		System.out.println("inside test2");
		Assert.assertEquals("sowmya", "Sowmya"); //false
	}


}
