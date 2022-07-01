package TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static Properties prop;
	public static WebDriver driver;

	public base() throws Exception {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\snjai\\eclipse-workspace\\KairosTechnologies\\config\\config.properties");
		prop.load(fis);
	}

	public static void intialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\snjai\\eclipse-workspace\\KairosTechnologies\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\snjai\\eclipse-workspace\\KairosTechnologies\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
