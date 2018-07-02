package gmailProject;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
// com.qait.tap.hristest.AutomationQAmaven.*; 

public class TestGmail {
  WebDriver driver;
 Gmail Obj;
 
  @Test(priority = 0)
  public void Test_gmail_login() {
   Obj.Gmail_Login("rahultesting96@gmail.com","rahultest@123");
   }
  
  @BeforeClass
  public void testlaunchGmail() 
  {
  driver= new ChromeDriver();
  driver.get("https://mail.google.com"); 
  driver.manage().window().maximize();
 Obj = new Gmail(driver); 
  }
  @Test(priority =2)
  public void composetest()
  {
	  Obj.Compose();
  }
@Test(priority=1)
public void auto_message() {
	Obj.message_automate();
}
/*@AfterClass
  public void closeGmail() throws InterruptedException {
   Thread.sleep(10000);

  // driver.quit();
  }*/

}
