import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // write your code here




        System.setProperty("webdriver.chrome.driver","C:\\Users\\ramesh\\IdeaProjects\\aytomation_2\\.idea\\Chrome Driver\\chromedriver.exe");
        System.out.println("neelam");
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://en-gb.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("neelampawar2796@gmail.com");
       // driver.findElement(By.id("password")).sendKeys("DDLJ2796");
       // driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        //TakesScreenshot ts =(TakesScreenshot)driver;
       // File Srcfile = ts.getScreenshotAs(OutputType.FILE);


    }
    }

