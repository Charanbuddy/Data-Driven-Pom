package org.test2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom02c extends BaseMethods {

	public pom02c() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='COURSES']")
	private WebElement moveToCourse;

	@FindBy(xpath = "//a[text()='Java Training ']")
	private WebElement moveToTraining;

	@FindBy(xpath = "//a[text()='Core Java Training']")
	private WebElement moveToJavaTraining;

	@FindBy(xpath = "//a[text()='Java course in Chennai']")
	private WebElement scrollDown;

	@FindBy(xpath="//p[contains(text(),'Google')]")
	private WebElement txtParagraph;

	public WebElement getMoveToCourse() {
		return moveToCourse;
	}

	public WebElement getMoveToTraining() {
		return moveToTraining;
	}

	public WebElement getMoveToJavaTraining() {
		return moveToJavaTraining;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getTxtParagraph() {
		return txtParagraph;
	}

}
