package org.stepdef;

import org.baseclass.BaseClass;
import org.pojo.PageObjectModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	PageObjectModel pom = new PageObjectModel();

	@Given("user opens the Gmail application")
	public void userOpensTheGmailApplication() {
		launchUrl("http://www.gmail.com/");
	}

	@When("user enters the valid username {string} and valid password {string} to login Gmail")
	public void userEntersTheValidUsernameAndValidPasswordToLoginGmail(String username, String password) {
		pom.getGmailLogin().loginGmail(username, password);
	}

	@Then("user compose the subject {string} and body {string} and send mail to mail-ID {string}")
	public void userComposeTheSubjectAndBodyAndSendMailToMailID(String subject, String body, String emailAddress) {
		pom.getGmailCompose().sendNewMail(subject, body, emailAddress);
	}

}
