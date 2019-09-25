package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browsertest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Eclipse workspace/Oneprodapt/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("Hello world");
		System.out.println("Step completed");
		
	}

}
