package Reuseble;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	
	public static WebDriver driver;
	public String browser = "Chrome";
	
	public Basepage(){
		if (driver==null){
			if (browser.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", "G:\\chrome78\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		}else if (driver.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "firefox location");
			driver =new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
		
		public void clickjavascript(WebElement element){
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
					
		}
		public boolean elementfound(WebElement element){
			boolean res = false;
			try{
				res =element.isDisplayed();
			}catch(Exception e){
			e.printStackTrace();
		}
			return res;
}
		public void settext(WebElement element ,String name){
			if(name !=null){
				element.click();
				element.clear();
				element.sendKeys(name);
			}
			}
			public String getTxtAttribute(WebElement element) {
				return element.getAttribute("value");
			}

			public String selectFromDropDown(WebElement element, String option) {
				Select obj = new Select(element);
				obj.selectByValue(option);
				return obj.getFirstSelectedOption().getText();
			}

			public boolean isElementVisible(WebElement element) {
				try {
					WebDriverWait wait = new WebDriverWait(driver, 90);
					wait.until(ExpectedConditions.visibilityOf(element));
					return true;
				} catch (Exception e) {
					return false;
				}
			}

			public String getTitlte() {
				return driver.getTitle();
			}

			public void quitDriver() {
				driver.quit();
			}

			public String getURL() {
				return driver.getCurrentUrl();
			}

			public void mouseOver(WebElement element) {
				Actions ac = new Actions(driver);
				ac.moveToElement(element).perform();		
			}

		}

