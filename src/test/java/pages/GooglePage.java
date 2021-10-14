package pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage {

    private String acceptCookiesButton = "L2AGLb";
    private String searchButton = "//input[@value='Buscar con Google']";
    private String searchTextField = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
        driver.manage().window().maximize();
        driver.getWindowHandle();
        driver.findElement(By.id(acceptCookiesButton)).click();
    }

    public void clickGoogleSearch() {
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria) {
        write(searchTextField, criteria);
    }

}
