package browser;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest {

    @Test
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().equals("Google"));
        Assert.assertTrue("Page title is not correct", driver.getTitle().equals("Google"));
    }
}
