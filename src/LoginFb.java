import java.util.concurrent.TimeUnit;


//import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class LoginFb {

    
	public static <Selenium> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int x =10;
		System.out.println("This is first "+x);
		Selenium selenium = null;
		
		//THis is edited on Git hub
                System.out.println("This is Edited on git hub");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		//selenium.wait(6000);
		 
	    Thread.sleep(3000);
		WebElement email, password, logout;
		email = driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("priyavertis@gmail.com");
		
		password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("goodsamaritan");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
			
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Mouse over on logOut drop down menu icon,then click logout
	/*	WebElement mouseOverEle = driver.findElement(By.id("pageLoginAnchor"));
 		Actions actions = new Actions(driver);
		actions.moveToElement(mouseOverEle).click().perform();
		*/
        driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
        
        Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Logging out ");
		//click for logout
		driver.findElement(By.xpath("//ul[@class='_54nf']/li[12]/a")).click();
	
		
	//	selenium.wait(6000);
		System.out.println("Logged out ");
		driver.quit();
	}

}
