package nz.ac.auckland.se754.demoselenium;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddStepDefs {

    private WebDriver driver;
    int num1,num2;

    @Before("@Test")
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "webdrivers/win/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    @AfterStep
//    public void afterEachStep(){
//        try {
//            Thread.sleep(1500);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }

    @After("@Test")
    public void tearDown(){
        driver.close();
    }

    @Given("I have opened the Add page")
    public void i_have_opened_the_add_page() {
        driver.get("file:///E:/CoderLife/SE754/SE754-SELENIUM-DEMO/web/add.html");
    }

    @When("I entry the first num {int}")
    public void i_entry_the_first_num(Integer int1) {
        num1 = int1;
        driver.findElement(By.id("num1")).sendKeys(String.valueOf(int1));
    }

    @When("I entry the second num {int}")
    public void i_entry_the_second_num(Integer int1) {
        num2 = int1;
        driver.findElement(By.id("num2")).sendKeys(String.valueOf(int1));
    }

    @When("I click the add button")
    public void i_click_the_add_button() {
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.id("result")).sendKeys(String.valueOf(num1+num2));
    }

    @Then("The result {int} shows")
    public void the_result_shows(Integer int1) {
        int result = Integer.parseInt(driver.findElement(By.id("result")).getAttribute("value"));
        Assertions.assertEquals(int1,result);
    }
}
