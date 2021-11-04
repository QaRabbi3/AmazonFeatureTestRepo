package TestCases;

import org.testng.annotations.Test;

import Base.Configurations;
import Locators.AmazonLocators;
import TestData.AmazonTestValues;

public class TestCase3 extends Configurations {
	AmazonLocators objL = new AmazonLocators();
	AmazonTestValues objValue= new AmazonTestValues ();
	
	@Test(priority=2)
	public void filtiring() {
		Ewait_visibilityOf(objL.filter1);
		CheckboxByXpath(objL.filter1);
		//CheckboxByXpath(objL.filter2);
		typeByCssSelector(objL.PriceMin, objValue.PriceMin);
		typeByCssSelector(objL.PriceMax, objValue.PriceMax);
		clickByXpath(objL.setPrice);
	}
	
	

}
