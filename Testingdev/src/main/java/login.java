import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://thomasdigital.com/");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            driver.findElement(By.xpath("//a[text()='Services']")).click();

            // Wait for "Services" menu and hover
            

            // Wait for "Website Design" link to appear under dropdown
            WebElement websiteDesign = wait.until(
            	    ExpectedConditions.elementToBeClickable(
            	        By.xpath("//a[@title='Website Design' and contains(@class, 'dropdown-item') and text()='Website Design']")
            	    )
            	);
            // Scroll into view and click
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", websiteDesign);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", websiteDesign);

            // Validate URL
            wait.until(ExpectedConditions.urlContains("The World’s Best"));
            if (driver.getCurrentUrl().contains("The World’s Best")) {
                System.out.println("✅ Successfully navigated to Website Design page.");
            } else {
                System.out.println("❌ Navigation failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
		 