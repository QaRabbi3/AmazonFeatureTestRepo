package Utilities;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GenericMethods {
	
	public static WebDriver driver=null;
	public static Logger applicationLog= Logger.getLogger("devpinoyLogger");
	
	
	// Method to click with Xpath
	public void clickByXpath(String Locators) {
		try {
			driver.findElement(By.xpath(Locators)).click();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			applicationLog.debug(e.getMessage());
		}
	}
	
	
	
	// Method for sending value with Xpath
	public void typeByXpath(String Locators, String Value) {
		try {
			driver.findElement(By.xpath(Locators)).clear();
			driver.findElement(By.xpath(Locators)).sendKeys(Value);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	// Method to click with CssSelector
	public void clickByCssSelector(String Locators) {
		try {
			driver.findElement(By.cssSelector(Locators)).click();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	// Method for sending value with CssSelector
	public void typeByCssSelector(String Locators, String Value) {
		try {
			driver.findElement(By.cssSelector(Locators)).clear();
			driver.findElement(By.cssSelector(Locators)).sendKeys(Value);
			} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	// Method to click with CssSelector
		public void SubmitByCssSelector(String Locators) {
			try {
				driver.findElement(By.cssSelector(Locators)).submit();;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	
	// Method to click with Id
		public void clickByID(String Locators) {
			try {
				driver.findElement(By.id(Locators)).click();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		// Method for sending value with ID
		public void typeByID(String Locators, String Value) {
			try {
				driver.findElement(By.id(Locators)).clear();
				driver.findElement(By.id(Locators)).sendKeys(Value);
				} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		
		//LinkText method
		public void clickByLinkText(String Locators) {
			try {
				driver.findElement(By.linkText(Locators)).click();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		
		// Tagname locators method
		public void clickByTagName(String Locators) {
			try {
				driver.findElement(By.tagName(Locators)).click();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		// Dropdown method byxpath
		
		public void DropDownByXpath(String Locators, String Values) {
			
			try {
				WebElement dropdown = driver.findElement(By.xpath(Locators));
				Select Selectdropdown = new Select(dropdown);
				
				Selectdropdown.selectByValue(Values);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		
		
	// Dropdown method by CssSelector
		
		public void DropDownByCSS(String Locators, String Values) {
			
			try {
				WebElement dropdown = driver.findElement(By.cssSelector(Locators));
				Select Selectdropdown = new Select(dropdown);
				
				Selectdropdown.selectByValue(Values);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		
		
	// Dropdown method by ID
		
		public void DropDownByID(String Locators, String Values) {
			
			try {
				WebElement dropdown = driver.findElement(By.id(Locators));
				Select Selectdropdown = new Select(dropdown);
				
				Selectdropdown.selectByValue(Values);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		
	//	Checkbox by Xpath method
		
		public void CheckboxByXpath(String locator) {
			try {
				boolean checkboxStatus = driver.findElement(By.xpath(locator)).isSelected();
				
				if(checkboxStatus==false) {
					driver.findElement(By.xpath(locator)).click();
					System.out.println("Checkbox has been Selected");
					
				}else {
					System.out.println("Checkbox has not been Selected");
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
	
		
//		Checkbox by css method
		public void CheckboxByCss(String locator) {
			try {
				boolean checkboxStatus = driver.findElement(By.cssSelector(locator)).isSelected();
				
				if(checkboxStatus==false) {
					driver.findElement(By.cssSelector(locator)).click();
					System.out.println("Checkbox has been Selected");
					
				}else {
					System.out.println("Checkbox has not been Selected");
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		
//		Checkbox by ID method
		
		
		public void CheckboxByID(String locator) {
			try {
				boolean checkboxStatus = driver.findElement(By.id(locator)).isSelected();
				
				if(checkboxStatus==false) {
					driver.findElement(By.id(locator)).click();
					System.out.println("Checkbox has been Selected");
					
				}else {
					System.out.println("Checkbox has not been Selected");
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		
		
		
		// Method for WindowHandling
		public void windowHandling(String Locators) {
			try {
				// opens all the child window
							
						
							driver.findElement(By.linkText(Locators)).click();
							

							// Stores unique Parent window Id value in a string
							String ParentWindow = driver.getWindowHandle();
							//prints out Parent window ID
							System.out.println(ParentWindow);
							// Stores all the child windows and parent window in a set of String
							Set<String> All_Windows = driver.getWindowHandles();
							System.out.println(All_Windows);
							//Iterator will iterate through all the child windows
							Iterator<String> iteratorHandling= All_Windows.iterator();
							
							// looping through all the windows in the iterator
							while(iteratorHandling.hasNext()) {
								
								String ChildWindow =iteratorHandling.next();
								Thread.sleep(2000); 
								
								
								if(!ParentWindow.equalsIgnoreCase(ChildWindow)) {
									driver.switchTo().window(ChildWindow);
									System.out.println(driver.getTitle());
									 
								}
							}
							
							driver.switchTo().window(ParentWindow);
			
			} catch (InterruptedException e) {
				
				System.err.println(e.getMessage());
			}
					
					}
		
		// Method for Iframe
		public void iframe(int indexValue, String Locators) {
			try {
				// switch to inside the frame 
				// frame by index
				driver.switchTo().frame(indexValue);
				String text = driver.findElement(By.xpath(Locators)).getText();
				System.out.println(text);

					// this switch back to parent window/default content in the pge
				driver.switchTo().defaultContent();
			
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			
		}
		
		
		// method for webtable
		
		
	
		
		
		
		//// Method for LinkCount
		
		public void LinkCount(String tagNameLocator) {
			try {
				// List collection
				java.util.List<WebElement>	linkCount = driver.findElements(By.tagName(tagNameLocator));
				
					// prints # of links in page
				System.out.println("# of links in page: "+ linkCount.size());
				
				  // loops through the tagname and prints all links text
				for(int i=1; i<linkCount.size(); i++) {
					System.out.println(linkCount.get(i).getText());
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		}
		
		public void Assertion(String actual, String expected) {
			//String A=actual;
			//String E= expected;
			Assert.assertEquals(actual, expected);
		}
		
		public void verifyTitle(String TitleValue) {
	
			System.out.println("The title is :"+driver.getTitle());
			int titleLength = driver.getTitle().length(); // length
			System.out.println("The title Length is :"+titleLength);
			// verify
					
				if(driver.getTitle().equalsIgnoreCase(TitleValue)) {
					System.out.println("Title Successfully verfied");
				}else {
					System.out.println("FAIL Title ");
				
				}
			}
	
	
	// Method to launch the browser
		public  void LaunchURL(String url) {
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get(url);
		}
	
	public  void EwaitpresenceOf(String Locators) {
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		 explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Locators)));
	}
	
	public  void Ewait_visibilityOf(String Locators) {
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		WebElement element= driver.findElement(By.xpath(Locators));
		 explicitWait.until(ExpectedConditions.visibilityOf(element));
	}
	public  void Ewait_elementToBeClickable(String Locators) {
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		 explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators)));
	}
	
	
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	// CREATE SEperte wait method for all the conditions 
	
	
	//  Webtable method 
	//Datepicker method
	// iframe method
	// WindowHandling
	
	// method to maximize browser
	public  void MaxPage() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	// not a generic method
	public void verifyItemInCart(String Locators,String Locators2, String Value) {
	 try {
		driver.findElement(By.xpath(Locators));
		//explicitWait.until(ExpectedConditions.visibilityOf(VerifyItemInCart));
		
		String ActualTitle= driver.findElement(By.xpath(Locators2)).getText();
		System.out.println(ActualTitle);
		String ExpectedTitle= Value;
		 //verify to check if Sony checkbox is selected
		boolean CartCheckbox = driver.findElement(By.xpath(Locators)).isSelected();
		 //using if&else to click on checkbox based on boolean result
		if(CartCheckbox== false) {
			
			if(ActualTitle.equalsIgnoreCase(ExpectedTitle)){
				System.out.println("Item has been Sucessfully verifed inside the Cart");
				}else {
					System.out.println("Incorrect Items is in the cart");
				}
		}else {
			driver.findElement(By.xpath(Locators)).click();
		}
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
	
	}
	
	
	
	
	
}
