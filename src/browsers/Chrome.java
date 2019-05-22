package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public void openChrome() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

}
