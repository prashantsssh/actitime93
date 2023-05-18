package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PrintPopUp 
{
	public static void main(String[] args) throws AWTException, FindFailed, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		Robot robot=new Robot();
		//Closing the Notification PopUp
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//Pressing Ctrl+P to print/save the page
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(5000);
		//Pressing Enter on the Print Preview Page
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern fileNameSnap = new Pattern("C:\\Selenium\\AutomationTwo\\testData\\saveFileName.PNG");
		Pattern saveButtonSnap = new Pattern("C:\\Selenium\\AutomationTwo\\testData\\savePrint.PNG");
		
		Screen screen=new Screen();
		screen.wait(fileNameSnap, 20);
		screen.type(fileNameSnap, "Demo_document");
		screen.click(saveButtonSnap);
	}
}
