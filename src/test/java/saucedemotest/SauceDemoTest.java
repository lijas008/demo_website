package saucedemotest;

import org.testng.annotations.Test;

import sacucedemopage.SauceDemoPage;
import saucedemobase.BaseClass;
import saucedemoutilties.ExcelUtils;

public class SauceDemoTest extends BaseClass {

		@Test
		public void test() throws Exception {
			SauceDemoPage sp = new SauceDemoPage(driver);
			String file_path = "E:\\Luminar\\Test automation\\SwagLabs.xlsx";
			String sheet = "Sheet1";
			int rowCount = ExcelUtils.getRowCount(file_path, sheet);
			
			for(int i=1;i<=rowCount;i++) {
				String userName = ExcelUtils.getCellValues(file_path, sheet, i, 0);
				driver.navigate().refresh();
				String password = ExcelUtils.getCellValues(file_path, sheet, i, 1);
				driver.navigate().refresh();
				
				sp.setValues(userName, password);
				
				sp.login();
				String expectedurl = "https://www.saucedemo.com/inventory.html";
				String actualurl = driver.getCurrentUrl();
				if (actualurl.equals(expectedurl)) {
					System.out.println("Login successful "+ userName);
					sp.AddCart();
					sp.checkoutPage();
				} else {
					System.out.println("Login failed" + userName);
				}
			}
		}
	
}


