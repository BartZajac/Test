import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProgramaTestLogin {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\repos\\ProgramaTestLogin\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://qa-test.programa.pl");
    }

    @Test
    public void UserRegistrationWithValidData() throws InterruptedException {

        driver.findElement(By.cssSelector("[data-menu=\"userLogin.login\"]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("user-email")).sendKeys("testmail20min.com@20minutemail.it");
        Thread.sleep(3000);

        driver.findElement(By.id("user-password")).sendKeys("Testmail1");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[value=\"Zaloguj\"]")).click();
        Thread.sleep(3000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
