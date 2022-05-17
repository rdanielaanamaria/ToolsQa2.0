package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

public class ElementsPage {
    WebDriver driver;
    WebDriverWait wait;


//    By elementsItems = By.xpath("//div[@class='header-right']");
    By elementsItems = By.xpath("//div[text()='Elements'][@class='header-text']");
//    Text Box items
    By textBoxItem = By.xpath("//span[text()='Text Box']");
    By fullNameField = By.id("userName");
    By emailField = By.id("userEmail");
    By currentAddressField = By.id("currentAddress");
    By permanentAddressField = By.id("permanentAddress");
    By submitButton = By.id("submit");
//    Check Box items
//    By checkBoxItem = By.xpath("//span[text()='Check Box']");
    By checkBoxItem = By.id("item-1");
    By expandAllButton = By.xpath("//button[@title='Expand all']");
    By selectedItems = By.xpath("//div[span='You have selected :']");
    By checkHomeCheckBox = By.xpath("//span[@class='rct-checkbox']");
    By checkDesktopCheckBox = By.xpath("//span[@class='rct-checkbox']");
    By checkDocumentsCheckBox = By.xpath("//span[@class='rct-checkbox']");
    By checkDownloadsCheckBox = By.xpath("//span[@class='rct-checkbox']");
//    By checkDownloadsCheckBox = By.xpath("//label[@for='tree-node-downloads']/span");
//    By checkDownloadsCheckBox = By.xpath("//input[@id=\"tree-node-downloads\"]");


    public ElementsPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void clickOnElementsItems(){
        driver.findElement(elementsItems).click();
        driver.findElement(textBoxItem).click();
    }
    public void fillInTheTextBoxForm(){
        driver.findElement(fullNameField).sendKeys(Constants.FULL_NAME_FIELD);
        driver.findElement(emailField).sendKeys(Constants.EMAIL_FIELD);
        driver.findElement(currentAddressField).sendKeys(Constants.CURRENT_ADDRESS_FIELD);
        driver.findElement(permanentAddressField).sendKeys(Constants.PERMANENT_ADDRESS_FIELD);
    }
    public void clickOnSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
    }


    public void clickOnCheckBoxItems(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxItem));
        driver.findElement(checkBoxItem).click();
        driver.findElement(expandAllButton).click();
    }
    public void checkHomeCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkHomeCheckBox));
        driver.findElements(checkHomeCheckBox).get(0).click();
    }
    public void expectedMessage(){
        driver.findElement(selectedItems).isEnabled();
    }
    public void checkDesktopCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkDesktopCheckBox));
        driver.findElements(checkDesktopCheckBox).get(1).click();
    }
    public void checkDocumentsCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkDocumentsCheckBox));
        driver.findElements(checkDocumentsCheckBox).get(4).click();
    }
    public void checkDownloadsCheckBox(){
//        wait.until(ExpectedConditions.elementToBeClickable(checkDownloadsCheckBox));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkDownloadsCheckBox));
        driver.findElements(checkDownloadsCheckBox).get(14).sendKeys(Keys.ENTER);
//        driver.findElement(checkDownloadsCheckBox).click();
    }






}
