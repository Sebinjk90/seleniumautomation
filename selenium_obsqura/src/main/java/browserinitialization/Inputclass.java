package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inputclass extends Base{
	
	
	
	
	public void inputMessageField()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement mesgfield = driver.findElement(By.id("single-input-field"));
		System.out.println(mesgfield.isEnabled());
		mesgfield.sendKeys("Hello");
		
		WebElement showmsg = driver.findElement(By.id("button-one"));
		showmsg.click();
		System.out.println(showmsg.isDisplayed());
		
		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys("10");
		
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("20");
		
		WebElement getTotal = driver.findElement(By.id("button-two"));
		getTotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inputclass obj = new Inputclass();
		
		obj.initializeBrowser();
		obj.inputMessageField();
	}

}
