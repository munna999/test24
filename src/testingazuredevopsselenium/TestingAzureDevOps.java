package testingazuredevopsselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingAzureDevOps {
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.out.println("hello world");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dhruthi.bhamidipati\\Downloads\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhamidipatidhruthi96@gmail.com");
			driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Test@12345");
			driver.findElement(By.xpath("//input[@name='Login']")).click();
			//Thread.sleep(10000);
			
			
			//driver.findElement(By.id("//div//label[text()='Password']//following::input[@class='input r4 wide mb16 mt8 password')")).sendKeys("Sarrath@19960805");
			//driver.findElement(By.id("//div//label[text()='Username']//following::input[@class='input r4 wide primary']")).click();

			//driver.quit();
		}
}
	


