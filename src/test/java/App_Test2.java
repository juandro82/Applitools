import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import org.junit.jupiter.api.*;


public class App_Test2 {
 

 WebDriver driver = new ChromeDriver();
 Eyes eye;
 ChromeOptions option;




@BeforeEach

public void beforeEach (TestInfo testInfo)
{
	option= new ChromeOptions();
	option.setBinary("C:\\Users\\neoju\\Eclipse Resources\\chrome-win64\\chrome.exe");
	driver = new ChromeDriver(option);
	eye=new Eyes();
	eye.setApiKey("AlJH5Vbu3TMUdH8hhPehSsHp1aea0vbEW44ep6Ve5xs110");
	eye.open(driver,"eyestest","HomePage");
	
}



@Test
public void exampleTestCase(){
	
	driver.get("https://i.imgur.com/Ib3Ld2k.png");
	eye.checkWindow("test");
}



@AfterEach
public void afterEach () {
	eye.closeAsync();
}
	


@AfterAll
public void afterAll () {
	driver.close();
}

}
