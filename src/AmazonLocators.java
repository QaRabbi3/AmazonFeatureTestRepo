package Locators;

public class AmazonLocators {
	
	// linktext locator for Signin Element
	public String SignINLocator = "Sign in";
	// css locator for Email in Signin
	public String SignInEmailL = "#ap_email";
	//Css for clicking continue
	public String SingInContinueL="#continue";
	// css locator for Email in Password
	public String SignInPwL =	"#ap_password";
	
	public String SubmitL ="#signInSubmit";
	
	public String AllMenueL ="//a[@id='nav-hamburger-menu']";
	public String SeeMoreL="//a[@class='hmenu-item hmenu-compressed-btn']";
	public String ElectronicDEPTL="//div[contains(text(),'Electronics')]";
	public String HeadphoneL="Headphones";
	public String InEarHP= "In Ear Earbud Headphones";
	
	
	//filitering 
	public String filter1="//span[@class='a-size-base a-color-base'][contains(text(),'Sony')]";
	//public String filter2 ="//span[@class='a-size-base a-color-base'][contains(text(),'SAMSUNG')]";
	public String PriceMin ="#low-price";
	public String PriceMax="#high-price";
	public String setPrice="//span[@class='a-button-inner']//input[@type='submit']";

	//Adding to Cart
	
	public String PurchaseItem="//span[contains(text(),'Sony MDREX15LP in-Ear Earbud Headphones, Black, Mo')]";
	public String AddtoCart= "#add-to-cart-button";
	
	
	// verify item in the cart
	
	public String VerifyCartCheckboxL ="//div[@class='a-checkbox a-checkbox-fancy sc-item-check-checkbox-pc-desktop sc-list-item-checkbox']";
	public String ItemTitleL ="//span[@class='a-size-medium a-color-base sc-product-title']";
	
	// proceed to checkout
	public String ProccedToCheckOut="#sc-buy-box-ptc-button";
}
