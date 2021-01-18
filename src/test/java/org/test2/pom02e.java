package org.test2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom02e extends BaseMethods {

	public pom02e() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement clickCourses;
	
	public WebElement getClickCourses() {
		return clickCourses;
	}

	public WebElement getMveToJava() {
		return mveToJava;
	}

	public WebElement getMveToCorejTraining() {
		return mveToCorejTraining;
	}

	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement mveToJava;
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement mveToCorejTraining;
	
	@FindBy(xpath = "//a[text()='TESTIMONIALS']")
	private WebElement clicktestrimonials;

	@FindBy(xpath = "//a[text()='+91 8939 915 577 / +91 6385 149 793']")
	private WebElement scrollDown;

	@FindBy(xpath = "(//a[@title='contact@greenstechnologys.com'])[9]")
	private WebElement txtEmail;

	public WebElement getClicktestrimonials() {
		return clicktestrimonials;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

}
