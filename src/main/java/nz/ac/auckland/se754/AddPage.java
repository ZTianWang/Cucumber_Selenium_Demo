package nz.ac.auckland.se754;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPage {

    public AddPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "num1")
    private WebElement txtNum1;

    @FindBy(id = "num2")
    private WebElement txtNum2;

    @FindBy(id = "btn")
    private WebElement btnAdd;

    @FindBy(id = "result")
    private WebElement txtResult;

    public void entryNum1(int num1){
        txtNum1.sendKeys(String.valueOf(num1));
    }

    public void entryNum2(int num2){
        txtNum2.sendKeys(String.valueOf(num2));
    }

    public void clickAdd(int result){
        btnAdd.click();
        txtResult.sendKeys(String.valueOf(result));
    }

    public int getResult(){
        return Integer.parseInt(txtResult.getAttribute("value"));
    }

}
