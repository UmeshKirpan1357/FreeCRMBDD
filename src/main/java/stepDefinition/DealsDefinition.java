//package stepDefinition;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsDefinition {
//	WebDriver driver;
//	@Given("^User is on Login Page$")
//	public void user_is_on_Login_Page()  {
//	   
//		System.setProperty("webdriver.chrome.driver", "D:\\Work\\AutomationSoft\\Chrome DriverV93\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	 driver.get("https://ui.cogmento.com/");
//	}
//
//	@When("^Title of page is Free CRM$")
//	public void title_of_page_is_Free_CRM() {
//	    
//		 System.out.println(driver.getTitle());
//		  Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
//	}
//
//	@Then("^Enter username and password$")
//	public void enter_username_and_password(DataTable credential)  {
//	  
//		List<List<String>> data=credential.raw();
//		   driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//		   driver.findElement(By.name("password")).sendKeys(data.get(0).get(1)); 
//	}
//
//	@Then("^Click on Login button$")
//	public void click_on_Login_button() {
//	  
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//	}
//
//	@Then("^User is on home page$")
//	public void user_is_on_home_page()  {
//	  
//		String Username=driver.findElement(By.xpath("//span[text()='Umesh Kirpan']")).getText();
//		Assert.assertEquals(Username, "Umesh Kirpan");
//	}
//
//	@Then("^user moved to create deals page$")
//	public void user_moved_to_create_deals_page()  {
//	    
//		
//		Actions action=new Actions(driver);
//		WebElement dealslink=driver.findElement(By.xpath("//i[contains(@class, 'money')]"));
//		action.moveToElement(dealslink).click().perform();
//		driver.findElement(By.xpath("//span[contains(text(), 'Deals')]")).click();
//		//Click on create button
//		driver.findElement(By.xpath("//a[contains(@href, '/deals/new')]")).click();
//	}
//
//	@Then("^user enters deals details$")
//	public void user_enters_deals_details(DataTable deals_data)  {
//	   
//		List<List<String>> dealsdata=deals_data.raw();
//	    driver.findElement(By.name("title")).sendKeys(dealsdata.get(0).get(0));
//	    driver.findElement(By.name("description")).sendKeys(dealsdata.get(0).get(1));
//	    driver.findElement(By.name("amount")).sendKeys(dealsdata.get(0).get(2));
//	    driver.findElement(By.name("commission")).sendKeys(dealsdata.get(0).get(3));
//	}
//
//	@Then("^click on save button$")
//	public void click_on_save_button()  {
//	   
//	   driver.findElement(By.xpath("//i[contains(@class, 'save icon')]")).click();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	
//	 driver.quit();
//	}
//	
//}
