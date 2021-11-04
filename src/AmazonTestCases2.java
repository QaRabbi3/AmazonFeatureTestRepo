package TestCases;

import org.testng.annotations.Test;

import Base.Configurations;
import Locators.AmazonLocators;
import TestData.AmazonTestValues;

public class AmazonTestCases2 extends Configurations{
	AmazonLocators objL = new AmazonLocators();
	AmazonTestValues objValue= new AmazonTestValues ();
	
	
	
	
	@Test(priority=1)
	public void ElectronicDepartment() {
		sleep(3000);
		EwaitpresenceOf(objL.AllMenueL);
		clickByXpath(objL.AllMenueL);
		sleep(3000);
		Ewait_elementToBeClickable(objL.SeeMoreL);
		clickByXpath(objL.SeeMoreL);
		Ewait_elementToBeClickable(objL.ElectronicDEPTL);
		clickByXpath(objL.ElectronicDEPTL);
		EwaitpresenceOf(objL.HeadphoneL);
		clickByLinkText(objL.HeadphoneL);
		Ewait_elementToBeClickable(objL.InEarHP);
		clickByLinkText(objL.InEarHP);
		
	}
	

}
