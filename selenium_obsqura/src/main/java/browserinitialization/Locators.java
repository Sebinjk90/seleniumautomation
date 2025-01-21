package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void idLocator()
	{
		
		WebElement messageField = driver.findElement(By.id("single-input-field"));
		System.out.println(messageField);
	}
	
	public void nameLocator()
	{
		
		WebElement descript = driver.findElement(By.name("description"));
	}
	
	public void classNameLocator()
	{
		
		WebElement header= driver.findElement(By.className("navbar navbar-expand-md navbar-dark"));
	}

	public void linkTextLocator()
	{
		WebElement checkBox = driver.findElement(By.linkText("check-box-demo.php"));
		
	}
	
	public void partialLinkTextLocator()
	
	{
		WebElement radioButton = driver.findElement(By.partialLinkText("radio-button"));
	}
	
	public void cssselectorLocator()
	{
		//tag#id Tag and id 
		
		
		WebElement msgfield1 = driver.findElement(By.cssSelector("input#single-input-field"));
		
		//tag.class  Tag and class
		
		WebElement header = driver.findElement(By.cssSelector("ul.navbar-nav"));
		
		//tag[attribute=value]  Tag and attribute value
		
		WebElement msgfield2 = driver.findElement(By.cssSelector("input[id=single-input-field]"));
		
		//tag.class[attribute=value]  Tag, class and attribute
		
		WebElement yourmsgfield = driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
		
	}
	
	public void absoluteXpath()
	{
		
		///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
		WebElement msgfield3 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		
	}
	
	public void relativeXpath()
	{
		////tagname[@attribute='value']
		
		WebElement btn1 = driver.findElement(By.xpath("//button[@id=button-one]")); 
		// double slash indicates current node
		
		
	}
	
	public void dynamicXpath()
	{
		WebElement msgfield4 = driver.findElement(By.xpath("//div[contains(@id,'message-one')]")); //contains method in dynamic xpath
		
		WebElement showmessage = driver.findElement(By.xpath("//button[text()='Show Message']")); // text method in dynamic xpath
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locators obj=new Locators();
		obj.initializeBrowser();
		obj.idLocator();
	}

}
