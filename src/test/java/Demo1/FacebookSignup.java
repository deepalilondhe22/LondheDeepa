package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookSignup {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(5000);
	  driver.get("https://www.facebook.com/");
  }
}
