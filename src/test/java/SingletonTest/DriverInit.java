package SingletonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit{
		
		private static DriverInit instanceDriver = null;   //1st private constructor 			
		private WebDriver driver; 

		private DriverInit() {
			
			
		}
		
		public WebDriver openBrowser() {  //2nd: Public method so we call other methods because this is our base class. 
			System.setProperty("webdriver.chrome.driver" , "/Users/jewellmehedi/Downloads/chromedriver");
			driver = new ChromeDriver();
			return driver;	
		}

			public static DriverInit getInstance() {   //3rd: Lazy Initialization
				if(instanceDriver == null)
					instanceDriver = new DriverInit();
				return instanceDriver;
			}
}

//How do you achieve Singleton in Seleium?

//To achieve Singleton in Selennium webdriver we create one driver initialization class.  Then create private constructor, simple public method so we call 
//other methods because this is our base class. 
//Then create getInstance method and achieve Lazy Initialization to achieve Singleton Pattern! 
