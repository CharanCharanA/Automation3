package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Demo123 
 { public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./Softwares3/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demoqa.com/frames");
driver.findElement(By.xpath("//iframe[@name='globalsqa']")).click();

 }
}
