package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CatalogPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class PetStoreSteps 
{
	HomePage hp = new HomePage();
	LoginPage login = new LoginPage();
    CatalogPage catalog = new CatalogPage();
    ProductPage product = new ProductPage();

	String url = ConfigReader.getProperties().getProperty("url");
	
	@Given("user launches application")
	public void user_launches_application() 
	{
	      hp.openApplication(url);
	}

	@When("user enters store")
	public void user_enters_store() 
	{
		System.out.println("User Enter the Store");
		hp.clickEnterStore();
	}

	@Then("user verifies the title of WebPage")
	public void user_verifies_the_title_of_web_page() 
	{
		System.out.println("User Verifies the Title of the WebPage");
		String exTitle = "JPetStore Demo";
		Assert.assertEquals(exTitle,hp.verifyTitle());
	}
	
	@When("user logs in with {string} and {string}")
	public void user_logs_in_with_and(String username, String password) 
	{
		login.clickSignIn();
        login.login(username,password);
	     
	}
	
	@When("user selects fish category")
	public void user_selects_fish_category() {
		catalog.selectFishCategory();
	}

	@When("user selects product")
	public void user_selects_product() {
		product.selectProduct();
	}

	@When("user adds item to cart")
	public void user_adds_item_to_cart() {
		product.addItemToCart();
	}

	@Then("item should be added successfully")
	public void item_should_be_added_successfully() {
		
		System.out.println("Item added successfully");  
	}


}
