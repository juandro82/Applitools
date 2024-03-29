//import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import org.junit.jupiter.api.*;


public class App_Test2 {
 

 static WebDriver driver;
 Eyes eyes;
 static ChromeOptions option;


 @BeforeAll
 public static void beforeAll() {
     // Configuración global antes de ejecutar todos los casos de prueba
	 option= new ChromeOptions();
	 option.setBinary("C:\\Users\\neoju\\Eclipse Resources\\chrome-win64\\chrome.exe");
	 driver = new ChromeDriver(option);
	 
 	 
 }

@BeforeEach
public void beforeEach (TestInfo testInfo)
{
	
	eyes=new Eyes();
	eyes.setApiKey("AlJH5Vbu3TMUdH8hhPehSsHp1aea0vbEW44ep6Ve5xs110");
	eyes.open(driver,"eyestest",testInfo.getTestMethod().get().getName(), new RectangleSize(1042,962));
	
}



@Test
public void exampleTestCase(){
	
	driver.get("https://i.imgur.com/Ib3Ld2k.png");
	eyes.check(Target.window());
}



@AfterEach
public  void afterEach () {
	eyes.closeAsync();
	
}

@AfterAll
public static void afterAll() {
    driver.close();
}
}