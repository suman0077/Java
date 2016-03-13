package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basicSelenium {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("Lexmark");
		element.submit();
		System.out.println("waiting");
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_mr kno-fb-ctx")));
		List<WebElement> elements = driver.findElements(By.className("_mr kno-fb-ctx"));
		for(int i=elements.size(); i>0; i--){
			System.out.println(i + " "+ elements.get(i-1));
		}
		
//		System.out.println("Revenue :" + revenue.toString());
		driver.quit();

	}

}
