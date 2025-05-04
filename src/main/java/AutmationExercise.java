import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutmationExercise {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        //open URL
        driver.get("https://www.automationexercise.com/");

        driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();
        driver.findElement(By.name("name")).sendKeys("sohiel");
        driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]")).sendKeys("sohiel@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]")).click();
        driver.findElement(By.id("uniform-id_gender1")).click();
        driver.findElement(By.name("password")).sendKeys("ASD123");

        WebElement dayDropdown     = driver.findElement(By.id("days"));
        WebElement monthDropdown   = driver.findElement(By.id("months"));
        WebElement yearDropdown    = driver.findElement(By.id("years"));
        WebElement countryDropdown = driver.findElement(By.id("country"));
        //Dropdown
        Select sel_day = new Select(dayDropdown);
        sel_day.selectByIndex(15);
        Select sel_month = new Select(monthDropdown);
        sel_month.selectByIndex(3);
        Select sel_year = new Select(yearDropdown);
        sel_year.selectByIndex(6);

        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.id("optin")).click();

        driver.findElement(By.id("first_name")).sendKeys("sohiel");
        driver.findElement(By.id("last_name")).sendKeys("shehab");
        driver.findElement(By.id("company")).sendKeys("Software");

        driver.findElement(By.id("address1")).sendKeys("Abo qir st 10");
        driver.findElement(By.id("address2")).sendKeys("Toson");
        Select sel_country = new Select(countryDropdown);
        sel_country.selectByIndex(2);

        driver.findElement(By.id("state")).sendKeys("Egypt");
        driver.findElement(By.id("city")).sendKeys("Alexandria");
        driver.findElement(By.id("zipcode")).sendKeys("12345");
        driver.findElement(By.id("mobile_number")).sendKeys("0123456789");







    }
}
