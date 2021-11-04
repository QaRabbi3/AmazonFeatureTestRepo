package TestCases;

import org.testng.annotations.Test;

import Base.Configurations;
import Locators.AmazonLocators;
import TestData.AmazonTestValues;

public class TestCase4 extends Configurations {
	 
		AmazonLocators objL = new AmazonLocators();
		AmazonTestValues objValue= new AmazonTestValues ();
		
	@Test(priority=3)
	public void ItemToCart() {
		clickByXpath(objL.PurchaseItem);
		SubmitByCssSelector(objL.AddtoCart);
		
	}
		
}
