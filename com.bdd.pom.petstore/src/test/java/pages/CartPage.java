package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    By updateCart = By.name("updateCartQuantities");
    By removeItem = By.linkText("Remove");

    public void updateCart() {

        driver.findElement(updateCart).click();
    }

    public void removeItem() {

        driver.findElement(removeItem).click();
    }
}