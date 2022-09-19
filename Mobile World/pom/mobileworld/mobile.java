package mobileworld;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mobile {
@Test
	public  void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.manage().window().maximize();
	    Pom home=new Pom(driver);
	    home.goTo();
	    home.registrationPage("pavithra","shan","abc@gmail.com","abc123","3/12/2000","0123456789","Hi everyone");
	    
	    
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver1=new ChromeDriver();
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver1.manage().window().maximize();
	    Pom home1=new Pom(driver1);
	    home1.goTo();
	    home1.registrationPage("pa","sh","abc@gml.com","abc!123","3/12/2000","0126789","Hi everyone");
	
	
	

}

	}


