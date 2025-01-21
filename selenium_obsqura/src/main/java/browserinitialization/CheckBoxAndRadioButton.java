package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxAndRadioButton extends Base {
	
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']")); //single check box selection
		checkBox.click();
		
		System.out.println(checkBox.isSelected());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckBoxAndRadioButton obj = new CheckBoxAndRadioButton();
		obj.initializeBrowser();
		obj.checkBox();
		
	}

}
