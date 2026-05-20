import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGDemo {

	
		
		@BeforeTest
		public void beforetest() {
			System.out.println("Before test");
		}
		
		@Test
		public void Test() {
			System.out.println("test");
		}
		
		@AfterTest
		public void AfterTest() {
			System.out.println("After test");
		}
		

	
}
