package FirstPKG;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Clem\\Automation\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.uk");
		
		
	}

}
