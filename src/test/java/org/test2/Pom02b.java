package org.test2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom02b extends BaseMethods {

	public Pom02b() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certifications;
	
	@FindBy(xpath="(//a[text()='Course Content'])[40]")
	private WebElement courseContent;
	
	@FindBy(xpath="(//p[contains(text(),'confidence')])[1]")
	private WebElement prntTestrimonials;
	
	@FindBy(xpath="//h2[text()='Selenium Training in Chennai']")
	private WebElement prntTitle;

	public WebElement getCertifications() {
		return certifications;
	}

	public WebElement getCourseContent() {
		return courseContent;
	}

	public WebElement getPrntTestrimonials() {
		return prntTestrimonials;
	}

	public WebElement getPrntTitle() {
		return prntTitle;
	}
}
