package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    By productLink = By.partialLinkText("FI");
    By addToCart = By.linkText("Add to Cart");

    public void selectProduct() {

        driver.findElement(productLink).click();
    }

    public void addItemToCart() {

        driver.findElement(addToCart).click();
    }
}