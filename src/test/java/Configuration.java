


    
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import com.applitools.eyes.RectangleSize;
	import com.applitools.eyes.selenium.Eyes;
	import com.applitools.eyes.selenium.fluent.Target;
	import org.junit.jupiter.api.*;
	import com.applitools.eyes.BatchInfo;
	//import com.applitools.eyes.selenium.Configuration;
	//import com.applitools.eyes.selenium.ClassicRunner;
	//import com.applitools.eyes.EyesRunner;
	//import com.applitools.eyes.TestResultsSummary;


	public class Configuration {
	 

	 static WebDriver driver;
	 static ChromeOptions option;
	 static BatchInfo myBatch;
	 static Configuration suiteConfig;
	 Eyes eyes;
	 


	 @BeforeAll
	 public static void beforeAll() {
	     // Configuración global antes de ejecutar todos los casos de prueba
		 
		 myBatch=new BatchInfo("My First Batch");
		 option= new ChromeOptions();
		 option.setBinary("C:\\Users\\neoju\\Eclipse Resources\\chrome-win64\\chrome.exe");
		 driver = new ChromeDriver(option);
		 suiteConfig=new Configuration();
		 suiteConfig.setApiKey("AlJH5Vbu3TMUdH8hhPehSsHp1aea0vbEW44ep6Ve5xs110");
		 suiteConfig.setBatch(myBatch);
		 
	 	 
	 }

	@BeforeEach
	public void beforeEach (TestInfo testInfo)
	{
		
		eyes=new Eyes();
		eyes.setConfiguration (suiteConfig);
		eyes.open(driver,"eyestest",testInfo.getTestMethod().get().getName(), new RectangleSize(1042,962));
		
	}


	@Test
	public void applitoolsHelloWorld() {
	    driver.get("https://applitools.com/helloworld/");
	    eyes.check(Target.window());
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



