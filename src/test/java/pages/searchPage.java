package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class searchPage {
	WebDriver driver;
	
	By searchbox_find = By.xpath("//body/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]");

	By weblist_list = By.xpath("//body/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
	
	By txtbox_box = By.xpath("//input[@id='search_description']");
	
	By button_price1 = By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	
	By radio_distance2 = By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[2]/label[1]/div[1]/div[1]/input[1]");
	
	By button_price3 = By.cssSelector("div.spinnerContainer__09f24__2XcuX.border-color--default__09f24__R1nRO.background-color--white__09f24__2jFAt:nth-child(9) div.mainContentContainer__09f24__1mGmV.border-color--default__09f24__R1nRO div.leftRailContainer__09f24__3fttY.border-color--default__09f24__R1nRO div.leftRailMainContent__09f24__1ncfZ.padding-r5__09f24__hWLOF.padding-b5__09f24__28TLK.padding-l5__09f24__3g2Ty.border-color--default__09f24__R1nRO div.verticalFilterPanelInline__09f24__3AlM1.border-color--default__09f24__R1nRO div.container__09f24__3TFAQ.bottomAligned__09f24__1UWPk.margin-r5__09f24__zGC6v.padding-t4__09f24__21DX9.border-color--default__09f24__R1nRO div.padding-t2__09f24__3kzNV.padding-b2__09f24__2wk0A.border--bottom__09f24__2FjZW.border-color--default__09f24__R1nRO:nth-child(2) div.verticalLayout__09f24__A40CI.display--inline-block__09f24__FsgS4.border-color--default__09f24__R1nRO div.border-color--default__09f24__R1nRO div.growContainer__09f24__da8cO.display--inline-block__09f24__FsgS4.border-color--default__09f24__R1nRO > button.pill-container__09f24__21XGO.filterToggle__09f24__40Unn.growFilter__09f24__1jDas.noRightBorder__09f24__Eg2Fe.growFilterContainer__09f24__2XPZj.button__09f24__1VFaY:nth-child(2)");
	
	By radio_distance4 = By.cssSelector("div.spinnerContainer__09f24__2XcuX.border-color--default__09f24__R1nRO.background-color--white__09f24__2jFAt:nth-child(9) div.mainContentContainer__09f24__1mGmV.border-color--default__09f24__R1nRO div.leftRailContainer__09f24__3fttY.border-color--default__09f24__R1nRO div.leftRailMainContent__09f24__1ncfZ.padding-r5__09f24__hWLOF.padding-b5__09f24__28TLK.padding-l5__09f24__3g2Ty.border-color--default__09f24__R1nRO div.verticalFilterPanelInline__09f24__3AlM1.border-color--default__09f24__R1nRO div.container__09f24__3TFAQ.bottomAligned__09f24__1UWPk.margin-r5__09f24__zGC6v.padding-t4__09f24__21DX9.border-color--default__09f24__R1nRO div.padding-t2__09f24__3kzNV.padding-b2__09f24__2wk0A.border-color--default__09f24__R1nRO:nth-child(7) div.verticalLayout__09f24__A40CI.display--inline-block__09f24__FsgS4.border-color--default__09f24__R1nRO div.border-color--default__09f24__R1nRO div.border-color--default__09f24__R1nRO:nth-child(3) label:nth-child(1) div.arrange__09f24__AiSIM.border-color--default__09f24__R1nRO div.arrange-unit__09f24__1gZC1.border-color--default__09f24__R1nRO > input.input__09f24__30UUZ");
	
	By button_price5 = By.cssSelector("div.spinnerContainer__09f24__2XcuX.border-color--default__09f24__R1nRO.background-color--white__09f24__2jFAt:nth-child(9) div.mainContentContainer__09f24__1mGmV.border-color--default__09f24__R1nRO div.leftRailContainer__09f24__3fttY.border-color--default__09f24__R1nRO div.leftRailMainContent__09f24__1ncfZ.padding-r5__09f24__hWLOF.padding-b5__09f24__28TLK.padding-l5__09f24__3g2Ty.border-color--default__09f24__R1nRO div.verticalFilterPanelInline__09f24__3AlM1.border-color--default__09f24__R1nRO div.container__09f24__3TFAQ.bottomAligned__09f24__1UWPk.margin-r5__09f24__zGC6v.padding-t4__09f24__21DX9.border-color--default__09f24__R1nRO div.padding-t2__09f24__3kzNV.padding-b2__09f24__2wk0A.border--bottom__09f24__2FjZW.border-color--default__09f24__R1nRO:nth-child(2) div.verticalLayout__09f24__A40CI.display--inline-block__09f24__FsgS4.border-color--default__09f24__R1nRO div.border-color--default__09f24__R1nRO div.growContainer__09f24__da8cO.display--inline-block__09f24__FsgS4.border-color--default__09f24__R1nRO > button.pill-container__09f24__21XGO.filterToggle__09f24__40Unn.growFilter__09f24__1jDas.noRightBorder__09f24__Eg2Fe.growFilterContainer__09f24__2XPZj.button__09f24__1VFaY:nth-child(3)");
	
	By radio_distance6 = By.cssSelector("div.spinnerContainer__09f24__2XcuX.border-color--default__09f24__R1nRO.background-color--white__09f24__2jFAt:nth-child(9) div.mainContentContainer__09f24__1mGmV.border-color--default__09f24__R1nRO div.leftRailContainer__09f24__3fttY.border-color--default__09f24__R1nRO div.leftRailMainContent__09f24__1ncfZ.padding-r5__09f24__hWLOF.padding-b5__09f24__28TLK.padding-l5__09f24__3g2Ty.border-color--default__09f24__R1nRO div.verticalFilterPanelInline__09f24__3AlM1.border-color--default__09f24__R1nRO div.container__09f24__3TFAQ.bottomAligned__09f24__1UWPk.margin-r5__09f24__zGC6v.padding-t4__09f24__21DX9.border-color--default__09f24__R1nRO div.padding-t2__09f24__3kzNV.padding-b2__09f24__2wk0A.border-color--default__09f24__R1nRO:nth-child(7) div.verticalLayout__09f24__A40CI.display--inline-block__09f24__FsgS4.border-color--default__09f24__R1nRO div.border-color--default__09f24__R1nRO div.border-color--default__09f24__R1nRO:nth-child(4) label:nth-child(1) div.arrange__09f24__AiSIM.border-color--default__09f24__R1nRO div.arrange-unit__09f24__1gZC1.border-color--default__09f24__R1nRO > input.input__09f24__30UUZ");
	
	
	public searchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSearch() {
		driver.findElement(searchbox_find).click();
	}
	public void clickOnRestaurants() {
		driver.findElement(weblist_list).click();
	}
	
	public void clickOnBox() throws InterruptedException {
		String sitio = "Restaurants";
		Actions action = new Actions(driver);
		WebElement box = driver.findElement(txtbox_box);
		action.doubleClick(box).perform();
		Thread.sleep(2000);
		driver.findElement(txtbox_box).sendKeys(sitio + " Pizza");
		Thread.sleep(2000);
		driver.findElement(txtbox_box).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
	public void filter1() throws InterruptedException {
			driver.findElement(button_price1).click();
			Thread.sleep(5000);
			driver.findElement(radio_distance2).click();
			Thread.sleep(5000);
	}
}
