package TestCases;

import org.testng.annotations.Test;

import Base.Configurations;
import Locators.AmazonLocators;
import TestData.AmazonTestValues;

public class AmazonTestCases extends Configurations  {
	
	//logger log4j = new logger()
	
	AmazonLocators objL = new AmazonLocators();
	AmazonTestValues objValue= new AmazonTestValues ();
	
	
	
	//(enabled=false) this is to disable a testcase // add it next to @test anoatation
	@Test(priority=0)
	public void ClickOnSigninP() {
		verifyTitle(objValue.titleExpected);
	
	clickByLinkText(objL.SignINLocator);
	typeByCssSelector(objL.SignInEmailL, objValue.SigninEmail);
	clickByCssSelector(objL.SingInContinueL);
	typeByCssSelector(objL.SignInPwL, objValue.SignInPW);
	clickByCssSelector(objL.SubmitL);
		
	}
	
	// this gives prioity to the whatever testcase you want to run. SEQUENCE*
	/*(priority=0)
	(priority=1)
	(priority=2)
	*/
	/*@Test
	public void ElectronicDepartment() {
		clickByXpath(objL.AllMenueL);
		clickByXpath(objL.SeeMoreL);
		clickByXpath(objL.ElectronicDEPTL);
		clickByLinkText(objL.HeadphoneL);
		
	}*/
	
	

}
