package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gmail_Compose_Pojo extends BaseClass {

	@FindBy(xpath = "//div[text()='Compose']")
	private WebElement composeButton;
	@FindBy(name = "to")
	private WebElement toAddress;
	@FindBy(name = "subjectbox")
	private WebElement subject;
	@FindBy(xpath = "//table[@id='undefined']")
	private WebElement messageBody;
	@FindBy(xpath = "//div[text()='Send']")
	private WebElement sendMail;

	public WebElement getComposeButton() {
		return composeButton;
	}

	public WebElement getToAddress() {
		return toAddress;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMessageBody() {
		return messageBody;
	}

	public WebElement getSendMail() {
		return sendMail;
	}

	public void sendNewMail(String subject, String body, String emailAddress) {
		getComposeButton().click();
		getToAddress().sendKeys(emailAddress);
		getSubject().sendKeys(subject);
		getMessageBody().sendKeys(body);
		getSendMail().click();
	}

}
