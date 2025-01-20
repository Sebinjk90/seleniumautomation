package browserinitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
public void initializeBrowser() {
	driver = new ChromeDriver();//launch chrome
	driver.get("https://selenium.qabible.in/index.php");//launch url
	driver.manage().window().maximize();//maximize window
}

public void quitAndClose()
{
driver.quit();// close all windows
//driver.close(); // close current window only
}

public static void main(String[] args) {
	Base base = new Base();
			base.initializeBrowser();
			base.quitAndClose();
}
}
