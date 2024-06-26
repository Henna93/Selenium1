package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		
		String Pagetitle= driver.getTitle();
		System.out.println(Pagetitle);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String handleid= driver.getWindowHandle();
		System.out.println(handleid);
		
		String page= driver.getPageSource();
		System.out.println(page);
		
		driver.close();
	}
	

}
