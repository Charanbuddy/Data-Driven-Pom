package org.test2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom02a extends BaseMethods {

	public Pom02a() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement printFrstLine;

	public WebElement getPrintFrstLine() {
		return printFrstLine;
	}

}
