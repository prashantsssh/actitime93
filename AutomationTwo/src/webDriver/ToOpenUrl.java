package webDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ToOpenUrl
{
	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
}
