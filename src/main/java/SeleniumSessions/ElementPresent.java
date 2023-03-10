package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPresent {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By search = By.name("search");

//		List<WebElement> searchList = driver.findElements(search);
//		if (searchList.size() == 1) {
//			System.out.println("search field is present on page");
//
//		}
//
//		else {
//			System.out.println("search filed is not available on page");
//		}

		checkElementDisplayed(search);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static boolean checkElementDisplayed(By locator) {
		if (getElements(locator).size() == 1)
			return true;

		return false;
	}

	public static boolean checkElementDisplayed(By locator, int eleOccurrence) {
		if (getElements(locator).size() == eleOccurrence)
			return true;
		return false;
	}

}
