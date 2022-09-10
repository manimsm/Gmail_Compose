package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Login_Pojo extends BaseClass {

	public Gmail_Login_Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "identifierId")
	private WebElement username;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next;
	@FindBy(name = "password")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getNext() {
		return next;
	}

	public void loginGmail(String username, String password) {
		getUsername().sendKeys(username);
		next.click();
		getPassword().sendKeys(password);
		next.click();
	}

}
