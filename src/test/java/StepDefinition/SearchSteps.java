package StepDefinition;


import org.testng.annotations.Test;
import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.searchPage;


public class SearchSteps {
	WebDriver driver = null;
	searchPage search;
	
	@Test(priority = 1)
	@Given("Browser is opened")
	public void browser_is_opened() throws InterruptedException {
		System.out.println("Inside Step - browser is open");
		System.setProperty("webdriver.chrome.driver", "/Users/santiagoferreira/SeleniumDemo/Workspace/CucumberJava/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	@And("User is on Yelp page website")
	public void user_is_on_yelp_page_website() throws InterruptedException {
		driver.navigate().to("https://www.yelp.com/");
		if (driver.getCurrentUrl().equals("https://www.yelp.com/")) {
		System.out.println("User is on Yelp page");
		}else {
		System.out.println("User is not on Yelp page");
		driver.close();
		driver.quit();
	}
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	@When("User look up for Restaurants")
	public void user_look_up_for_restaurants() throws InterruptedException {
		search = new searchPage(driver);
		search.enterSearch();
		Thread.sleep(3000);
		
	    //search = new searchPage(driver);
	    //search.enterSearch();
	    //Thread.sleep(2000);
	}

	@Test(priority = 4)
	@And("User clicks on the search button")
	public void user_clicks_on_the_search_button() throws InterruptedException {
		search.clickOnRestaurants();
		Thread.sleep(5000);
		search.clickOnBox();
		Thread.sleep(5000);
		java.util.List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class, ' container__09f24__21w3G hoverable')]"));
		System.out.println("Total de busquedas: "+result.size());
		Thread.sleep(5000);
	}

	@Test(priority = 5)
	@When("^Add (.*)$")
	public void add_filter (String filter) throws InterruptedException {
		if(filter.equals("1")) {
			driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/label[1]/div[1]/div[1]/input[1]")).click();
			Thread.sleep(5000);
			java.util.List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class, ' container__09f24__21w3G hoverable')]"));
			System.out.println("Total de busquedas filtradas: "+result.size());
			Thread.sleep(5000);
			} else if(filter.equals("2")) {
			driver.findElement(By.xpath("//*[contains(text(),'$$')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/label[1]/div[1]/div[1]/input[1]")).click();
//			java.util.List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class, ' container__09f24__21w3G hoverable')]"));
//			System.out.println("Total de busquedas filtradas: "+result.size());
			Thread.sleep(5000);
	} else {
		driver.findElement(By.xpath("//*[contains(text(),'$$$')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/label[1]/div[1]/div[1]/input[1]")).click();
//		java.util.List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class, ' container__09f24__21w3G hoverable')]"));
//		System.out.println("Total de busquedas filtradas: "+result.size());
		Thread.sleep(5000);
	}
	}

	@Test(priority = 6)
	@Then("Results must be displayed")
	public void results_must_be_displayed() throws InterruptedException {
//		if (driver.getCurrentUrl().equals("https://www.yelp.com/search?find_desc=Restaurants%20Pizza&find_loc=San%20Francisco%2C%20CA")) {
//		System.out.println("Result is displayed");
//		driver.close();
//		driver.quit();
//		}else {
//		System.out.println("Result is not displayed");
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//	}
		java.util.List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class, ' container__09f24__21w3G hoverable')]"));
		System.out.println("Total de busquedas filtradas: "+result.size());
		Thread.sleep(5000);
		java.util.List<WebElement> rating = driver.findElements(By.xpath("//*[contains(@aria-label, ' rating')]"));
		int i = 1;
		for(WebElement element : rating) {
			System.out.println("Result number "+i+" "+"is"+" "+ element.getAttribute("aria-label"));
			i++;
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[6]/div[1]")).click();
		Thread.sleep(3000);
		java.util.List<WebElement> address = driver.findElements(By.xpath("//span[@class='lemon--span__373c0__3997G raw__373c0__3rcx7']"));
		System.out.println("Address: ");
		System.out.println(address.get(0).getText());
		System.out.println(address.get(1).getText());
//		for(WebElement element : address) {
//			System.out.println(address.get(0).getText());
//		}
		java.util.List<WebElement> number = driver.findElements(By.xpath("//p[@class='lemon--p__373c0__3Qnnj text__373c0__2Kxyz text-color--normal__373c0__3xep9 text-align--left__373c0__2XGa-']"));
		System.out.println("Phone: "+ number.get(8).getText());
		System.out.println("Website: "+driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/p[2]")).getText());
		
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]")).getText()
				+" "+"says"+":"+address.get(6).getText());
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[2]/div[2]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]")).getText()
		        +" "+"says"+":"+address.get(7).getText());
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[2]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]")).getText()
				+" "+"says"+":"+address.get(8).getText());
		
		driver.close();
		driver.quit();
		
	}

}
