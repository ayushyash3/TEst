import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\QATEST\\Tranning\\src\\chromedriver.exe");
			//	+ ""
				//+ "D:/QATEST/Tranning/src/chromedriver.exe");
	
	//	ChromeOptions options = new ChromeOptions();
		//options.addArguments("user-data-dir=C:/Users/user_name/AppData/Local/Google/Chrome/User Data");
	//	options.addArguments("--user-agent=Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
	//	options.addArguments("--start-maximized");
		
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//ChromeOptions options = new ChromeOptions();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

	}

}
