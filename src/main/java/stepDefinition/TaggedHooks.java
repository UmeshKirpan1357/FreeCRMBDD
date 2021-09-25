package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooks {

	//Global Hook
	@Before(order=0)
	public void openBrowser() {
		System.out.println("Open Browser");
	}
	@After(order=0)
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	@Before(order=1)
	public void openBrowser1() {
		System.out.println("Open Browser");
	}
	@After(order=1)
	public void closeBrowser2() {
		System.out.println("Close browser");
	}
	//local hooks
	@Before("@First")
	public void brforeFirst() {
		System.out.println("I am before first Scenario");
	}
	@After("@First")
	public void afterFirst() {
		System.out.println("I am after first Scenario");
	}
	
	@Before("@Second")
	public void beforeSecond() {
		System.out.println("I am before second Scenario");
	}
	@After("@Second")
	public void afterSecond() {
		System.out.println("I am after second Scenario");
	}
	
	@Before("@Third")
	public void beforeThird() {
		System.out.println("I am before third Scenario");
	}
	@After("@Third")
	public void afterThird() {
		System.out.println("I am after third Scenario");
	}
	@Given("^First Step$")
	public void first_Step() throws Throwable {
	   System.out.println("First Step");
	}

	@When("^Second Step$")
	public void second_Step() throws Throwable {
		System.out.println("Second Step");
	}

	@Then("^Third Step$")
	public void third_Step() throws Throwable {
		System.out.println("Third Step");
	}
}
