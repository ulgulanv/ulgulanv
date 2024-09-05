package ITM_Test_data;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ITM_Test {
        private static final WebElement Right_click = null;
		public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Sign up page 
		WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://itassetmanagementsoftware.com/rolepermission/admin/login");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       WebElement Username = driver.findElement(By.id("username"));
       Username.sendKeys("vaishaliapawar07@gmail.com");
       WebElement Remember_me = driver.findElement(By.xpath("//label[@for=\"remember_me\"]"));
       Remember_me.click();
       WebElement Continue = driver.findElement(By.id("btnContinue"));
       Continue.click();
       
    // Click on sign up button and move back to the sign up page
       Thread.sleep(10000);           // these threads just for understanding I don't use it while working
       WebElement MSbtn = driver.findElement(By.id("btnMsLogin"));
       MSbtn.click();
            driver.navigate().back();
    // Click on forgot password , terms and conditions, contact us.
        WebElement FP = driver.findElement(By.xpath("//a[text()=\"Forgot password?\"]"));
        FP.click();
        driver.navigate().back();    
        WebElement T_C = driver.findElement(By.xpath("//a[text()=\\\"Terms & Conditions\\\"]"));
        T_C.click();
        driver.navigate().back();
       
	}
	
}
