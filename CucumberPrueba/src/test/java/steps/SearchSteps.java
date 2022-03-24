package steps;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SearchSteps {
  WebDriver driver;
  @Given("The user is in the index page")
  public void theUserIsInTheIndexPage() {
    System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
    driver = new FirefoxDriver();
    driver.navigate().to("http://automationpractice.com/index.php");
  }

  @When("the user enters dresses in the search bar")
  public void theUserEntersDressesInTheSearchBar() {
    driver.findElement(By.id("search_query_top")).sendKeys("dresses");
    
  }

  @When("the user clicks on the search button")
  public void funcion3() {
    driver.findElement(By.name("submit_search")).click();
    }

  @Then("dresses page appears")
  public void dressesPage() {
    String title = driver.findElement(By.className("lighter")).getText();
    Assert.assertEquals(title, "\"DRESSES\"");
  }
}
