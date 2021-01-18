package org.test2;

import java.io.IOException;

public class Pom011 extends BaseMethods {
	public static void main(String[] args) throws InterruptedException, IOException {
		loadBrowser();

		launchUrl("https://www.facebook.com/");

		maxwindow();

		Pom01 l = new Pom01();

		findAndSend(l.getTxtEmail(), readFromExcel(0, 0));
		findAndSend(l.getTxtPass(), readFromExcel(1, 0));
		click(l.getBtnLogin());

		String textget = gettingText(l.getLoginFailed());

		if (textget.contains("The password that you've entered is incorrect. Forgotten password?")) {
			System.out.println("Please enter a valid username and password");
		}

	}
}
