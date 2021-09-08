package com.osa.steps;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.osa.base.Browser;
import com.osa.pages.Forum;
import com.osa.pages.Home;
import com.osa.utility.Uitility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps {
	public static Logger log=Uitility.getLog(Steps.class);
	public WebDriver dr;
	public Home hp;
	public Forum forum;
	@Given("^I open the browser$")
	public void i_open_the_browser() {
		dr=Browser.openBrowser("chrome");
	}
	@And("^I nevigate to \"([^\"]*)\"$")
	public void i_nevigate_to(String url) throws Throwable {
	   dr.get(url);
	}

	@And("^I click on Forum button$")
	public void i_click_on_Forum_button() throws Throwable {
	  hp=new Home(dr);
	  hp.clickOnForumButton();
	}
	@And("^I enter username$")
	public void i_enter_username() throws Throwable {
		forum=new Forum(dr);
		forum.enterUsername("fsedfsdfsdf");
	}

	@And("^I enter password$")
	public void i_enter_password() throws Throwable {
		log.info("We are entering password");
	   forum.enterPassword("545345435435");
	}
	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
	   forum.clickOnLoginButton();
	}

	@Then("^I verify that I am on student page$")
	public void i_verify_that_I_am_on_student_page() throws Throwable {
	
	}
	@And("^I close the page$")
	public void i_close_the_page() throws Throwable {
		dr.close();
	}
	
	@And("^I click on OSA Forum button$")
	public void i_click_on_OSA_Forum_button() throws Throwable {
		  hp=new Home(dr);
		  hp.clickOnForumButton();
	}

	@Given("^I enter my username$")
	public void i_enter_my_username() throws Throwable {
		forum=new Forum(dr);
		forum.enterUsername("xfedfd");
	}

	@Given("^I enter my password$")
	public void i_enter_my_password() throws Throwable {
	    forum.enterPassword("222222222222");
	}

	@Given("^I click on OSA login button$")
	public void i_click_on_OSA_login_button() throws Throwable {
		 forum.clickOnLoginButton();
	}

	@When("^I click on inteview Question button$")
	public void i_click_on_inteview_Question_button() throws Throwable {
	   
	}

	@Then("^I verify that I am on interview question page$")
	public void i_verify_that_I_am_on_interview_question_page() throws Throwable {
	   
	}
	
	
	@Given("^I open the browsers$")
	public void i_open_the_browsers(DataTable dataTable) throws Throwable {
//			List<List<String>> list=dataTable.raw();
//				String a=list.get(0).get(0);
//				String b=list.get(0).get(1);
//				System.out.println(a+"    "+b);
	}

}
