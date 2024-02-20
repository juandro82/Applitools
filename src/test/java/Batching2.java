
    
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import com.applitools.eyes.RectangleSize;
	import com.applitools.eyes.selenium.Eyes;
	import com.applitools.eyes.selenium.fluent.Target;
	import org.junit.jupiter.api.*;
	import com.applitools.eyes.BatchInfo;


	public class Batching2 {
	 

	 static WebDriver driver;
	 static ChromeOptions option;
	 static BatchInfo myBatch;
	 Eyes eyes;
	 


	 @BeforeAll
	 public static void beforeAll() {
	     // Configuración global antes de ejecutar todos los casos de prueba
		 
		 myBatch=new BatchInfo("My First Batch");
		 option= new ChromeOptions();
		 option.setBinary("C:\\Users\\neoju\\Eclipse Resources\\chrome-win64\\chrome.exe");
		 driver = new ChromeDriver(option);
		 
	 	 
	 }

	@BeforeEach
	public void beforeEach (TestInfo testInfo)
	{
		
		eyes=new Eyes();
		eyes.setBatch(myBatch);
		eyes.setApiKey("AlJH5Vbu3TMUdH8hhPehSsHp1aea0vbEW44ep6Ve5xs110");
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

