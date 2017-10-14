package core;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	static WebDriver driver;
	public static void openChrome (String url) {
	//public static void main (String [] args) {
	Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		String driverPath="";
   //String url = "http://alex.academy/exe/signup/v1/index.php";
	     if (System.getProperty("os.name").toUpperCase().contains("MAC"))      driverPath = "./resources/webdrivers/mac/chromedriver";
	else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))  driverPath = "./resources/webdrivers/pc/chromedriver.exe";
	else throw new IllegalArgumentException("Unknown OS");
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars"); 
		option.addArguments("--disable-notifications");
		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			option.addArguments("-start-fullscreen");
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			option.addArguments("--start-maximized");
		else throw new IllegalArgumentException("Unknown OS");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Page URL"+driver.getCurrentUrl());
	driver.get(url);
	}
	public static void openFireFox(String url) {
		//public static void main (String [] args) {
		 Logger.getLogger("").setLevel(Level.OFF);
			
	     String driverPath=""; 
	      if (System.getProperty("os.name").toUpperCase().contains("MAC"))   driverPath="./resources/webdrivers/mac/geckodriver.sh";
	      else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "";
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		//String url = "http://alex.academy/exe/signup/v1/index.php";
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,15);
		System.out.println("Page URL"+driver.getCurrentUrl());
		driver.get(url);
	}
	public static void openSafari(String url) {
	//public static void main (String [] args) {
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		
		if (!System.getProperty("os.name").contains("Mac")) {throw new IllegalArgumentException("Safari is available only on Mac");}
		
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,15);
		//String url = "http://alex.academy/exe/signup/v1/index.php";
		System.out.println("Page URL"+driver.getCurrentUrl());
		driver.get(url);}
	//public static void main(String [] args) {	
	public static void openHml (String url) {
			String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("UserAgent Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.");
		System.out.println("Page URL" + driver.getCurrentUrl());
		driver.get("url");
	
	}
	public static void quite() {
		driver.quit();
	}
    public static void isPresent(String [] b) {
    	
	for (String x:b )
		if (!driver.findElements(By.id(x)).isEmpty()){
			System.out.println("Element is Present");
		}
		else {System.out.println("Element is not present");}}
	
	public static void isVisable(String [] b) {
    	//for (int i = 1;i<=10;i++);
		for (String x:b )
			if ((driver.findElements(By.id(x)).size()>0)&& driver.findElement(By.id(x)).isDisplayed()){
				System.out.println("Element is Visable");
			}
			else {System.out.println("Element is not Visable");}}
		
		
		public static void isVisableConfirmation(String[]b) {
			for (String x:b )
				if (!driver.findElements(By.id(x)).isEmpty()){
					System.out.println("Element is Present");
				}
				else {System.out.println("Element is not present");}}
		
		
		
		
}