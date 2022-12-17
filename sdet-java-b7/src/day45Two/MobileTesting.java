package day45Two;

public class MobileTesting {
	public static void main(String[] args) {
		MobileDriver driver = new IOSDriver();
		//MobileDriver driver = new AndroidDriver();
		
		driver.startApp("Grademe");
		String welcomeMsg = driver.readText("h2");
		
		if (!welcomeMsg.equals("welcome to homepage")) {
			System.out.println("Test failed");
			return;
		}
		
		driver.clickOnBtn("Projects");
		String projectPageTxt = driver.readText("header");
		if (!projectPageTxt.equals("Projects")) {
			System.out.println("Test failed");
			return;
		}
		
		// more steps for automation
	}
}
