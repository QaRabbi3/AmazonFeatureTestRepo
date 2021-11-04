package TestCases;

import org.testng.annotations.Test;

import Base.Configurations;
import Locators.AmazonLocators;
import TestData.AmazonTestValues;

public class Testcase5 extends Configurations {
	AmazonLocators objL = new AmazonLocators();
	AmazonTestValues objValue= new AmazonTestValues ();
	
@Test(priority=4)
public void itemVerifyInCart() {
	verifyItemInCart(objL.VerifyCartCheckboxL, objL.ItemTitleL, objValue.expectedTitle);
	clickByCssSelector(objL.ProccedToCheckOut);
}

}
