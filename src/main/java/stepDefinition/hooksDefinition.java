//package stepDefinition;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class hooksDefinition {
//	
//	@Before
//	public void openBrowser() {
//		System.out.println("Open browser");
//	}
//
//	@After
//	public void teadDown() {
//		System.out.println("Close browser");
//	}
//	@Given("^Enter URL$")
//	public void enter_URL() throws Throwable {
//	    System.out.println("Enter URL");
//	}
//
//	@Given("^User is on Deals page$")
//	public void user_is_on_Deals_page() throws Throwable {
//	 System.out.println("User is on Deal page");
//	}
//
//	@Then("^Enter deals details$")
//	public void enter_deals_details() throws Throwable {
//	    System.out.println("Enter deal details");
//	}
//
//	@Then("^Deals get created$")
//	public void deals_get_created() throws Throwable {
//	   System.out.println("Delas get created");
//	}
//
//	@Then("^Logout$")
//	public void logout() throws Throwable {
//	  System.out.println("Logout");
//	}
//
//	@Given("^User is on Contact page$")
//	public void user_is_on_Contact_page() throws Throwable {
//	   System.out.println("On contact page");
//	}
//
//	@Then("^Enter Contact details$")
//	public void enter_Contact_details() throws Throwable {
//	  System.out.println("Enter contact detail");
//	}
//
//	@Then("^Contact get created$")
//	public void contact_get_created() throws Throwable {
//	    System.out.println("Contact get created");
//	}
//	
//}
