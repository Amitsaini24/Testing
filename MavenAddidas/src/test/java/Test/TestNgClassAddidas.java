package Test;

import org.testng.annotations.BeforeClass;

public class TestNgClassAddidas {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
		System.setProperty("webdriver.chrome.driver", "")
	}

}
