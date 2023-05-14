import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=http://mail.google.com/mail/&scc=1&ltmpl=default&ltmplcache=2&emr=1");
	driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("manuchadha650");
	driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("23456");
	driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	//driver.findElement(By.)
	}

}
