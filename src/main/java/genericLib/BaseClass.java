package genericLib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass{

	@BeforeClass

	public void launchBrowsr() {
		System.out.println("open Browser");
	}

	@BeforeMethod

	public void loginApp() {
		System.out.println("login the application");
	}

	@AfterMethod

	public void logoutApp() {
		System.out.println("logout the application");
	}

	@AfterClass

	public void tearDown() {
		System.out.println("close Browser");
	}
}
