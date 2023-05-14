import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ClearTrip {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.cleartrip.com/");
		/*driver.findElement(By.xpath(".//*[@id='RoundTrip']")).click();
		driver.findElement(By.xpath(".//*[@id='FromTag']")).sendKeys("ban");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Bangkok')]")).click();	
		driver.findElement(By.xpath(".//*[@id='ToTag']")).sendKeys("delhi");		
		driver.findElement(By.xpath("//a[contains(text(),'New Delhi')]")).click();	
		//To check whether element is see in UI or not
		//driver.findElement(By.className("span24 clearField")).isDisplayed();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='To']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//*[@id='To']")).getAttribute("name"));
		*/
		driver.findElement(By.xpath(".//*[@id='RoundTrip']")).click();
		driver.findElement(By.xpath(".//*[@id='FromTag']")).sendKeys("bangalore");
		driver.findElement(By.xpath(".//*[@id='ToTag']")).sendKeys("delhi");
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//tr[3]/td[5]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[3]/a")).click();
			
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='Adults']"));
		Select sel=new Select(ele);
		sel.selectByIndex(4);
		//sel.selectByVisibleText("3");
		//sel.selectByValue("3");
		
		List<WebElement> opt=sel.getOptions();
		for(int i=0;i<opt.size();i++){
			System.out.println(opt.get(i).getText());
		}
		
		String month="April";
		String day="25";
		String xpath123="//span[text()='"+month+"']/../../../descendant::a[text()='"+day+"']";
		driver.findElement(By.xpath(xpath123)).click();
		driver.findElement(By.xpath(".//*[@id='SearchBtn']")).click();
	}
}
