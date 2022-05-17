import org.testng.annotations.Test;
import pages.BaseClass;
import pages.ElementsPage;
import utils.Constants;

public class Tests extends BaseClass {

    @Test
    public void testingTextBoxItems() {
        driver.get(Constants.ELEMENTS_ITEMS);
        ElementsPage textBoxItems = new ElementsPage(driver);

        textBoxItems.clickOnElementsItems();
        textBoxItems.fillInTheTextBoxForm();
        textBoxItems.clickOnSubmitButton();
    }
    @Test
    public void testingCheckingAllCheckBoxItems(){
        driver.get(Constants.ELEMENTS_ITEMS);
        ElementsPage checkBoxItems = new ElementsPage(driver);
        checkBoxItems.clickOnElementsItems();
        checkBoxItems.clickOnCheckBoxItems();
        checkBoxItems.checkHomeCheckBox();
        checkBoxItems.expectedMessage();
        System.out.println("All fields were selected. " + Constants.ALL_FIELDS_ARE_SELECTED);
        }
    @Test
    public void testingCheckDesktopCheckBox(){
        driver.get(Constants.ELEMENTS_ITEMS);
        ElementsPage checkBoxItems = new ElementsPage(driver);
        checkBoxItems.clickOnElementsItems();
        checkBoxItems.clickOnCheckBoxItems();
        checkBoxItems.checkDesktopCheckBox();
        checkBoxItems.expectedMessage();
        System.out.println("Desktop fields were selected. " + Constants.DESKTOP_FIELDS);
    }
    @Test
    public void testingCheckDocumentsCheckBox() {
        driver.get(Constants.ELEMENTS_ITEMS);
        ElementsPage checkBoxItems = new ElementsPage(driver);
        checkBoxItems.clickOnElementsItems();
        checkBoxItems.clickOnCheckBoxItems();
        checkBoxItems.checkDocumentsCheckBox();
        checkBoxItems.expectedMessage();
        System.out.println("Documents fields were selected. " + Constants.DOCUMENTS_FIELDS);
    }
    @Test
    public void testingCheckDownloadsCheckBox() {
        driver.get(Constants.ELEMENTS_ITEMS);
        ElementsPage checkBoxItems = new ElementsPage(driver);
        checkBoxItems.clickOnElementsItems();
        checkBoxItems.clickOnCheckBoxItems();
        checkBoxItems.checkDownloadsCheckBox();
        checkBoxItems.expectedMessage();
        System.out.println("Downloads fields were selected. " + Constants.DOWNLOADS_FIELDS);
    }
}

