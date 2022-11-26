package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programme {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhand\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String ab = driver.getTitle();
	System.out.println(ab);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Set<String> win = driver.getWindowHandles();
//ArrayList<String> al=new ArrayList<>(win);
//String s1 = al.get(1);
//driver.switchTo().window(s1);
	driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
}
}
