package pages;

import org.openqa.selenium.By;

public class CatalogPage extends BasePage {

    By fishCategory = By.xpath("//img[@src='../images/sm_fish.gif']");
    
    By dogsCategory = By.linkText("DOGS");

    public void selectFishCategory() {

        driver.findElement(fishCategory).click();
    }

    public void selectDogsCategory() {

        driver.findElement(dogsCategory).click();
    }
}