package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    
    
    WebDriver driver = new ChromeDriver();
    //driver = new FirefoxDriver();
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    
    driver.get("http://demo.guru99.com/test/delete_customer.php");
    Thread.sleep(2000);
    driver.findElement(By.name("cusid")).sendKeys("12345");
    driver.findElement(By.name("submit")).submit();
    Alert obj = driver.switchTo().alert();
    System.out.print("Error"+ obj.getText());
    obj.accept();
   // obj.dismiss();

}

}


