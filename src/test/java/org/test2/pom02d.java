package org.test2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class pom02d extends BaseMethods {

	public pom02d() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(xpath = "//a[text()='CAREERS']") })
	private WebElement clickCarreers;

	@FindBy(xpath = "(//a[@title='+91-8939915577'])[12]")
	private WebElement scrollDown;

	@FindBy(xpath = "(//p[@class='mail-info'])[16]")
	private WebElement txtEmail;

	public WebElement getClickCarreers() {
		return clickCarreers;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	

}
