package Test;

import org.testng.annotations.Test;

public class LoanTest {
	
	@Test(groups= {"Sanity"})
	public void sbc() {
		System.out.println("this is sanity");
	}
	
	@Test(groups= {"Sanity"})
	public void sbcc() {
		System.out.println("this is sanity2");
	}
	
	@Test(groups= {"regression"})
	public void axis() {
		System.out.println("this is regression");
	}

}
