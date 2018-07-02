package gmailProject;

	import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Gmail {
	WebDriver driver;
	WebDriverWait wait;
	
	public Gmail(WebDriver driver)
	 {
	  this.driver= driver;
	  wait = new WebDriverWait(driver, 10);
	 }

	public WebElement getUsername()
	{
	 return this.driver.findElement(By.id("identifierId"));
	}
	
	 public WebElement getPassword()
	 {
	 return this.driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
	 }
	 
	public void Gmail_Login(String Username, String Password)
	{
	getUsername().clear();
	getUsername().sendKeys(Username);
	driver.findElement(By.id("identifierNext")).click();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	getPassword().sendKeys(Password);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"passwordNext\"]/content/span")));
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	}
	public void message_automate()
	{
	//WebElement table = driver.findElement(By.className("yW"));
	List<WebElement> rows = driver.findElements(By.tagName("div[id=':2l']"));
	for (WebElement row : rows) {
	System.out.println(rows.size());
	 }
	}
	public void Compose() {
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#\\3a 4g > div > div")));

		driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3")).click();//to compose a message
	driver.findElement(By.cssSelector("textarea[name='to']")).sendKeys("rahultesting96@gmail.com");//recipient
driver.findElement(By.cssSelector("input[name='subjectbox']")).sendKeys("test");//subject
	driver.findElement(By.cssSelector("div[role='textbox']")).sendKeys("testing time");//body
	driver.findElement(By.cssSelector("div[data-tooltip='Send ‪(Ctrl-Enter)‬']")).click();//send
	}
	}
	

	


	
	

