//package stepDefinition;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
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
//public class DealsMapDefinition {
//	WebDriver driver;
//	Actions action;
//
//	@Given("^User is on Login Page$")
//	public void user_is_on_Login_Page() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Work\\AutomationSoft\\Chrome DriverV93\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.get("https://ui.cogmento.com/");
//	}
//
//	@When("^Title of page is Free CRM$")
//	public void title_of_page_is_Free_CRM() {
//
//		System.out.println(driver.getTitle());
//		Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
//	}
//
//	@Then("^Enter username and password$")
//	public void enter_username_and_password(DataTable credential) {
//
//		for (Map<String, String> data : credential.asMaps(String.class, String.class)) {
//			driver.findElement(By.name("email")).sendKeys(data.get("username"));
//			driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		}
//	}
//
//	@Then("^Click on Login button$")
//	public void click_on_Login_button() {
//
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//	}
//
//	@Then("^User is on home page$")
//	public void user_is_on_home_page() {
//
//		String Username = driver.findElement(By.xpath("//span[text()='Umesh Kirpan']")).getText();
//		Assert.assertEquals(Username, "Umesh Kirpan");
//	}
//
//	@Then("^user moved to create deals page$")
//	public void user_moved_to_create_deals_page() {
//
//		action = new Actions(driver);
//		WebElement dealslink = driver.findElement(By.xpath("//i[contains(@class, 'money')]"));
//		action.moveToElement(dealslink).click().perform();
//		driver.findElement(By.xpath("//span[contains(text(), 'Deals')]")).click();
//		// Click on create button
//		driver.findElement(By.xpath("//a[contains(@href, '/deals/new')]")).click();
//	}
//
//	@Then("^user enters deals details$")
//	public void user_enters_deals_details(DataTable dealsdata) throws InterruptedException {
//
//		for (Map<String, String> dealsvalues : dealsdata.asMaps(String.class, String.class)) {
//			driver.findElement(By.name("title")).sendKeys(dealsvalues.get("Title"));
//			driver.findElement(By.name("description")).sendKeys(dealsvalues.get("Description"));
//			driver.findElement(By.name("amount")).sendKeys(dealsvalues.get("Amount"));
//			driver.findElement(By.name("commission")).sendKeys(dealsvalues.get("Commission"));
//
//			WebElement button = driver.findElement(By.xpath("//div[@class='item']/button[2] //i[@class='save icon']"));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", button);
//
//			WebElement dealslink = driver.findElement(By.xpath("//i[contains(@class, 'money')]"));
//			action.moveToElement(dealslink).click().perform();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[contains(text(), 'Deals')]")).click();
//			Thread.sleep(3000);
//			// Click on create button
//			driver.findElement(By.xpath("//a[contains(@href, '/deals/new')]")).click();
//		}
//	}
//
//	@Then("^click on save button$")
//	public void click_on_save_button() {
//		System.out.println("I am change in code");
//
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//
//		driver.quit();
//	}
//
//}
