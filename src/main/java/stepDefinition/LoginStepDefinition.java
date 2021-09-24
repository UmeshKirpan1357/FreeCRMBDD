//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//	
//	@Given("^User is on Login Page$")
//	public void user_is_on_Login_Page() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Work\\AutomationSoft\\Chrome DriverV93\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	 driver.get("https://ui.cogmento.com/");
//	 
//	}
//
//	@When("^Title of page is Free CRM$")
//	public void title_of_page_is_Free_CRM() {
//	  System.out.println(driver.getTitle());
//	  Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
//	}
//
//	
////	@Then("^Enter username and password$")
////	public void enter_username_and_password(){
////	   driver.findElement(By.name("email")).sendKeys("umeshqa2019@gmail.com");
////	   driver.findElement(By.name("password")).sendKeys("Umesh@488");
////	}
//	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void enter_and(String arg1, String arg2)  {
//		   driver.findElement(By.name("email")).sendKeys(arg1);
//		   driver.findElement(By.name("password")).sendKeys(arg2);    
//	}
//
//	@Then("^Click on Login button$")
//	public void click_on_Login_button() {
//	   driver.findElement(By.xpath("//div[text()='Login']")).click();
//	}
//
//	@Then("^User is on home page$")
//	public void user_is_on_home_page(){
//		String Username=driver.findElement(By.xpath("//span[text()='Umesh Kirpan']")).getText();
//		Assert.assertEquals(Username, "Umesh Kirpan");
//	}
//	
//	@Then("^user moved to create contact page$")
//	public void user_moved_to_create_contact_page(){
//		Actions action=new Actions(driver);
//		WebElement contactlink=driver.findElement(By.xpath("//span[contains(text(), 'Contacts')]"));
//		action.moveToElement(contactlink).click().perform();
//		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and_and(String arg1, String arg2, String arg3) {
//	driver.findElement(By.name("first_name")).sendKeys(arg1);
//	driver.findElement(By.name("last_name")).sendKeys(arg2);
//	driver.findElement(By.name("description")).sendKeys(arg3);
//	}
//
//	@Then("^click on save button$")
//	public void click_on_save_button(){
//		driver.findElement(By.xpath("//div[@class='item']/button[2] //i[@class='save icon']")).click();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser(){
//		driver.quit();
//	}
//
//}
