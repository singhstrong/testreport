package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class second {

	
    @Test

	
    @Parameters({"url","searchKey"})



    public void testParameterWithXML( String url,String searchKey) throws InterruptedException{

    	System.setProperty("webdriver.chrome.driver","F:\\NIIT\\chromedriver.exe");		
    	WebDriver  driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(searchKey);

        System.out.println("Thread will sleep now");
        Thread.sleep(3000);
        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
        //verifying the value in google search box
      //  AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

}
}


