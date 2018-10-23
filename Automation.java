import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
 		System.setProperty("webdriver.chrome.driver","/home/webonise/eclipse-workspace/Testing/resource/chromedriver");
   	    WebDriver Driver = new ChromeDriver();

        Driver.get( "https://www.carwale.com");
        WebElement element1=Driver.findElement(By.xpath("//a[@ onclick=\"trackHomePage('FirstPanel-Desktop-HP', 'NewCars-View-AllCars-Click', '');\"]"));
        element1.click();
        WebElement element2=Driver.findElement(By.xpath("//a[@ href='/audi-cars/']"));
        element2.click();
        WebElement element3=Driver.findElement(By.xpath("//*[@title=\"Audi A3 Show price in my city\"]"));
        element3.click();
        Thread.sleep(5000);
        Driver.findElement(By.xpath("//div[@class=\"form-control-box city-input-box\"]/input[@class=\"form-control margin-bottom20 city-search ui-autocomplete-input\"]")).sendKeys("Pune");   
        Thread.sleep(1000);
        WebElement element5=Driver.findElement(By.xpath("//div[@class=\"form-control-box area-input-box\"]/input[@class=\"form-control margin-top15 pqlocation-plugin-area ui-autocomplete-input blur\"]"));
        element5.sendKeys("S P College");
        Thread.sleep(2000);
        WebElement element6=Driver.findElement(By.xpath("//div[@class=\"city__input-container\"]/input[@id=\"ctaClick\"]"));
        element6.click();
      }
      catch(Exception e) {
    	  System.out.println(e);
      }
	}

}
