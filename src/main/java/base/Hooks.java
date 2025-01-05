package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public  void setup() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
		} else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--incognito");
			option.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver(option);
		} else if (browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--incognito");
			option.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(option);
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		WebElement name=driver.findElement(By.xpath("//input[@autocomplete='email']"));
		WebDriverWait wait= new  WebDriverWait((WebDriver) driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(name));
		name.sendKeys(prop.getProperty("Name"));
		WebElement pass = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		pass.sendKeys(prop.getProperty("Password"));
		WebElement click = driver.findElement(By.xpath("//input[@value='Log in']"));
		click.click();

	}
	
	@After
	public void tearDown (Scenario s) {
		if (s.isFailed()) {
			getscreenshot();
		}
			driver.quit();
	}

}

	



