package sacucedemopage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import saucedemobase.BaseClass;

public class SauceDemoPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement username;

	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement loginBtn;

	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement backBag;

	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement boltShirt;

	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement osineTshirt;

	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement bikeLight;

	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement jacket;

	@FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement redTshirt;

	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartIcon;

	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkout;

	@FindBy(xpath = "//*[@id=\"first-name\"]")
	WebElement firstName;

	@FindBy(xpath = "//*[@id=\"last-name\"]")
	WebElement lastName;

	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	WebElement postalCode;

	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement continueBtn;

	@FindBy(xpath = "//*[@id=\"finish\"]")
	WebElement finishBtn;

	@FindBy(xpath = "//*[@id=\"back-to-products\"]")
	WebElement backHomeBtn;

	@FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
	WebElement harmBrugerMenu;

	@FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
	WebElement logoutLink;

	public SauceDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setValues(String usr, String pswd) throws Exception {

		username.sendKeys(usr);
		password.sendKeys(pswd);

	}

	public void login() {
		loginBtn.click();
	}

	public void AddCart() {
		backBag.click();
		boltShirt.click();
		osineTshirt.click();
		bikeLight.click();
		jacket.click();
		redTshirt.click();
		cartIcon.click();

	}

	public void checkoutPage() {
		checkout.click();
		firstName.sendKeys("abc");
		lastName.sendKeys("rahul");
		postalCode.sendKeys("679322");
		continueBtn.click();
		finishBtn.click();
		backHomeBtn.click();
		harmBrugerMenu.click();
		logoutLink.click();

	}


}
