

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleWrkshopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


     //public static WebDriver driver;
	
		// TODO Auto-generated method stub
		
     WebDriver driver=new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user01");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin' or @name='Submit']")).click();
		//driver.quit();
	}




	
}
