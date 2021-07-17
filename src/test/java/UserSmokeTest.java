
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
        import  org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import  org.openqa.selenium.chrome.ChromeDriver;
public class UserSmokeTest {
    public static  WebDriver driver;

@Test
    public void  login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        //Test for login
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/user/login/index.html");
        driver.findElement(By.name("login")).sendKeys("sssss@gmail.com");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[2]//td[2]//input[1]")).sendKeys("1111");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[3]//td[2]//input[1]")).click();
        WebElement addUserButton=driver.findElement(By.xpath("//a[contains(text(),'Добавить пользователя')]"));
        Assert.assertEquals(true,addUserButton.isDisplayed() );

        driver.findElement(By.xpath("//input[@placeholder=\"Введите email или имя\"]")).sendKeys("sssss@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(),'Найти')]")).click();
    driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
    driver.findElement(By.xpath("//html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).click();
    driver.findElement(By.xpath("//html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).clear();
    driver.findElement(By.xpath("//html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("Ttest1");
    Select dropdown = new Select(driver.findElement(By.xpath("//html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")));
    dropdown.selectByIndex(2);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement dateBox = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
    dateBox.sendKeys("09052013");
    WebElement dateBox1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
    dateBox1.sendKeys("09052013");
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("music");
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("Dr000000678970001");
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();

      driver.quit();



    }
}

