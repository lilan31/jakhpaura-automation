package TestScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class DemoOne extends BaseClass {

	@Test
	public void testCaseOne(){
		
		System.out.println("testcase one");
		System.setProperty("webdriver.chrome.driver", "F:\\APTTUS_INTERVIEW\\GithubPractice\\Resourses\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println("testscript completed");
	}
}
