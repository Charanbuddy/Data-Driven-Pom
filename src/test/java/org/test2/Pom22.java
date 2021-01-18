package org.test2;

public class Pom22 extends BaseMethods {

	public static void main(String[] args) throws InterruptedException {
		loadBrowser();

		launchUrl("http://www.greenstechnologys.com/");

		maxwindow();

		pom02e g4 = new pom02e();

		cursorMovement(g4.getClickCourses());
		cursorMovement(g4.getMveToJava());
		cursorMovement(g4.getMveToCorejTraining());
		click(g4.getMveToCorejTraining());
		Thread.sleep(3000);
		cursorMovement(g4.getClicktestrimonials());
		click(g4.getClicktestrimonials());
		scrollDown(g4.getScrollDown());
		String txtEmail1 = gettingText(g4.getScrollDown());
		System.out.println(txtEmail1);
	}
}
