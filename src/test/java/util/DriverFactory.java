package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
    private WebDriver driver;
    private static DriverFactory myObj = null;

    private DriverFactory() {
    	
    }

    public WebDriver getDriver() {	    	
        return this.driver;
    }

    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static DriverFactory getInstance() {
        if(myObj == null) {
            myObj = new DriverFactory();
            return myObj;
        } else {
            return myObj;
        }
    }

    public void initializeDriver() throws Exception {
    	try {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
    		driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void closeDriver(){
    	 getInstance().getDriver().close();
    }

    public void getURL(String url) {
        getInstance().getDriver().get(url);
    }

}
