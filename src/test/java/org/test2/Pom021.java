package org.test2;

public class Pom021 extends BaseMethods {

	public static void main(String[] args) throws InterruptedException {
		loadBrowser();

		launchUrl("http://www.greenstechnologys.com/");

		maxwindow();

		Pom02a g = new Pom02a();

		String y = gettingText(g.getPrintFrstLine());
		System.out.println(y);

		Pom02b g1 = new Pom02b();

		click(g1.getCertifications());
		click(g1.getCourseContent());
		String s = gettingText(g1.getPrntTestrimonials());
		System.out.println(s);
		String t = gettingText(g1.getPrntTitle());
		System.out.println(t);

		pom02c g2 = new pom02c();

		cursorMovement(g2.getMoveToCourse());
		cursorMovement(g2.getMoveToTraining());
		cursorMovement(g2.getMoveToJavaTraining());
		String d = gettingText(g2.getTxtParagraph());
		System.out.println(d);

		pom02d g3 = new pom02d();
		click(g3.getClickCarreers());

		Thread.sleep(3000);
		scrollDown(g3.getScrollDown());
		String getTxt = gettingText(g3.getTxtEmail());
		System.out.println(getTxt);

	}
}
