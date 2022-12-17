package day45Two;

public class IOSDriver implements MobileDriver {

	@Override
	public void startApp(String appName) {
		System.out.println("Open app in ios: " + appName);
	}

	@Override
	public void clickOnBtn(String btnName) {
		System.out.println("Click on ios: " + btnName);
	}

	@Override
	public void tapOnScreen(int x, int y) {
		System.out.println("Tap on screen in IOS");
	}

	@Override
	public void swipeScreen(int xInit, int yInit, int xTarget, int yTarget) {
		System.out.println("Swipe screen in IOS");
	}

	@Override
	public String readText(String elementName) {
		System.out.println("Reading in ios text of " + elementName);
		return "welcome to homepage";
	}

	@Override
	public void insertText(String elementName, String txt) {
		System.out.println("Inserting text in IOS");
	}

	@Override
	public void closeApp(String appName) {
		System.out.println("Closing the app in IOS: " + appName);
	}
	
}
