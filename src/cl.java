import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class cl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		 
        driver.get("https://www.google.com");
       // driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("India");
        
      //  driver.findElement(By.xpath("//*[@id='sblsbb']")).click();

        Thread.sleep(3000);
        driver.quit();
	}

}
