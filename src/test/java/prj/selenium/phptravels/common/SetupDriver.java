package prj.selenium.phptravels.common;

import java.util.Locale;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import prj.selenium.helpers.PropertiesHelper;

public class SetupDriver {
  private WebDriver driver;

  public void setDriver(){
    switch (PropertiesHelper.getValue("browser").toLowerCase(Locale.ROOT)) {
      case "chrome":
        driver = initChromeDriver();
        break;
      default:
        System.out.println("Browser " + PropertiesHelper.getValue("browser") + "is invalid. Launching Chrome ...");
        driver = initChromeDriver();
    }
  }
  public WebDriver getDriver(){
    return this.driver;
  }
  public WebDriver initChromeDriver() {
    System.setProperty("webdriver.chrome.driver", "./driver_chrome/chromedriver.exe");
    return new ChromeDriver();
  }

}
