import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.applitools.eyes.selenium.Eyes;


public class App_Test {

	
@Test	

public void Test ()
{
	ChromeOptions option= new ChromeOptions();
	option.setBinary("C:\\Users\\neoju\\Eclipse Resources\\chrome-win64\\chrome.exe");
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\neoju\\eclipse-workspace\\JavaSeleniumDemo\\src\\resources\\chromedriver-win64");
	WebDriver driver = new ChromeDriver(option);
	/*WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();*/
	
	
	Eyes eye=new Eyes();
	eye.setApiKey("AlJH5Vbu3TMUdH8hhPehSsHp1aea0vbEW44ep6Ve5xs110");
	eye.open(driver,"eyestest","secondtests");
	driver.get("https://i.imgur.com/Ib3Ld2k.png");
	eye.checkWindow("test");
	eye.closeAsync();
	driver.close();
	
	
}
	
}
