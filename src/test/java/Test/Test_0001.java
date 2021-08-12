package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_0001
{

	@Test
	public void VerifyUserNameAndPasswrod()
	{
		ReadConfig read=new ReadConfig();
		
		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		
		String URL=read.getApplicationURL();
		String uName=read.getUsername();
		String pass=read.getPassword();
		
		System.out.println(URL);
		System.out.println(uName);
		System.out.println(pass);
		driver.get(URL);
		// comment
	}
}
