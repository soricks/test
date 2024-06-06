package test;
import org.junit.Test;

import com.testproject.Main;
		
public class TestRunner {
	
	@Test
	public void Testrunner() {
	try {
         
     	Main.MyTest();
     } catch (Exception e) {
         e.printStackTrace();
     }
	}
}
