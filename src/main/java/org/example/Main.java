package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ChromeOptions options = new ChromeOptions();
//        Map<String,Object>prefs = new HashMap<>();
//        prefs.put("credentials_enable_service",false);
//        prefs.put("profile.password_manager_enabled",false);
//        options.setExperimentalOption("prefs",Map.of("credentials_enable_service",false,"profile.password_manager_enabled",false));



        ChromeDriver driver = new ChromeDriver();

     String url ="https://the-internet.herokuapp.com/login";
        /* open url */
     driver.get(url);
     //enter username
     driver.findElement(By.tagName("input")).sendKeys("tomsmith");
     //enter pass
     driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
     //click login button
    driver.findElement(By.className("fa-2x")).click();

   driver.navigate().refresh();


   //Negative scenario
//    driver.findElement(By.tagName("input")).sendKeys("tomsmith");
//    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
//    driver.findElement(By.className("fa-2x")).click();



    }
}