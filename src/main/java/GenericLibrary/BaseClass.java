package GenericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Propertyfile pdata = new Propertyfile();
	public WebDriverUtilities utilities = new WebDriverUtilities();
	@BeforeMethod
	public void OpenApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void CloseApp(ITestResult res) throws IOException {
		int status = res.getStatus();//bydefault status is there 1-pass,2-fail,3-skip
		String name = res.getName();//give name of testcase which will get fail
		if (status == 2) {		
			Photo p = new Photo();
			p.getPhoto(driver, name);

		}
		driver.quit();
	}

}
