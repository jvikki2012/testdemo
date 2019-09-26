package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browsertest {
	
	public static void main(String[] args) {
		
		//String path=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	
		System.out.println("Hello world");
		System.out.println("Step completed");
		System.out.println("Step completed1");
		
	}

}
