package StarPatternPractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Programme {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhand\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String abc = driver.getTitle();
	System.out.println(abc);
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Set<String> win = driver.getWindowHandles();
//ArrayList<String> al=new ArrayList<>(win);
//String s1 = al.get(0);
//driver.switchTo().window(s1);
//	String text = driver.findElement(By.xpath("//button[text()='No thanks']")).getText();
//System.out.println(text);
}
}
