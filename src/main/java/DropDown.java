import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {
    ChromeDriver driver;
    @BeforeMethod
    void setup()
    {
     driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/dropdown");

    }
    @Test
    void TC_1()
    {
        Select sel = new Select(driver.findElement(By.id("dropdown")));
        sel.selectByIndex(1);
    }
    @Test
    void TC_2()
    {
   Select sel = new Select(driver.findElement(By.id("dropdown")));
   sel.selectByIndex(2);
    }
    @AfterMethod
    void close()
    {
    driver.quit();
    }
}
