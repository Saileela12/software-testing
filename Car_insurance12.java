package insuranse;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Car_insurance12
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tonbo\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.policybazaar.com/");
		Thread.sleep(2000);
		
		
		
		w.findElement(By.xpath("//body[1]/cclink[1]/main[1]/div[2]/section[1]/div[4]/a[1]/div[1]/p[1]")).click();
		
		Thread.sleep(3000);
		w.findElement(By.className("btn-proceed")).click();
		System.out.println("proceed without car number");
		
		w.findElement(By.xpath("//*[@id=\"dvRTO\"]/h3")).click();

		w.findElement(By.xpath("//*[@id=\"spn3\"]")).click();
		w.findElement(By.xpath("//span[contains(text(),'KA01')]")).click();
		System.out.println("car plateNumeber will display");
		Thread.sleep(3000);
		

		Actions a = new Actions(w);
		a.moveToElement(w.findElement(By.xpath("//*[contains(text(),'MAHINDRA')]"))).click().perform();
		Thread.sleep(3000);

		a.moveToElement(w.findElement(By.xpath("(//*[contains(@class,'col-sm-6 col-xs-6 ')])[1]"))).click().perform();
		Thread.sleep(3000);

		a.moveToElement(w.findElement(By.xpath("//*[contains(@id,'Diesel')]"))).click().perform();
		Thread.sleep(3000);

		a.moveToElement( w.findElement(By.xpath("(//*[contains(@class,'col-sm-6 col-xs-12')])[2]"))).click().perform();
		Thread.sleep(3000);
		 
		a.moveToElement(w.findElement(By.xpath("(//*[contains(@class,'col-sm-4 col-xs-4 ')])[2]"))).click().perform();
		Thread.sleep(3000);
		 
		w.findElement(By.xpath("//*[contains(@id,'name')]")).sendKeys("Sai");
		w.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("sai123@gmail.com");
		w.findElement(By.xpath("//*[contains(@id,'mobileNo')]")).sendKeys("9876543217");
		w.findElement(By.xpath("//*[contains(@id,'btnLeadDetails')]")).click();
		System.out.println("sucessfull done and Enter keywords");
		Thread.sleep(3000);

		a.moveToElement(w.findElement(By.xpath("(//*[contains(@class,'ui-state-default')])[61]"))).click().perform();
		Thread.sleep(3000);

		w.findElement(By.xpath("(//*[contains(@class,'radio_text')])[3]")).click();
	    Thread.sleep(3000);
		
		
		
	     
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		
		w.findElement(By.xpath("//label[contains(text(),'Select All')]")).click();
	    Thread.sleep(3000);
	    System.out.println("To click on all ");
	    w.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	    Thread.sleep(4000);
		TakesScreenshot t =(TakesScreenshot) w;
		File src = t.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D:\\screenshot\\sai123.png"));
		
		
		
		
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
		Thread.sleep(3000);
		
		w.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		
		
		JavascriptExecutor js =(JavascriptExecutor)w;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)" );
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	//	w.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
	//	Thread.sleep(3000);
	//	w.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	//	Thread.sleep(3000);
	//	w.findElement(By.xpath("//button[contains(text(),'20')]")).click();
	//	Thread.sleep(3000);
	//	w.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		
	//	w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
		//w.findElement(By.xpath("//input[@id='radio_lowest']")).click();
		//Thread.sleep(3000);
		//w.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
	//	w.close();
		
		w.findElement(By.xpath("//button[contains(text(),'Why Policybazaar >')]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		
		w.findElement(By.xpath("//button[contains(text(),'Email Plans')]")).click();
		Thread.sleep(3000);
		
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")).click();
		System.out.println("policy bazzar is sucessfull Done");
		
		List<WebElement> Links=w.findElements(By.tagName("a"));
		int Total_links=Links.size();
		System.out.println("Total links are: " + Total_links);
		
		List<WebElement> button=w.findElements(By.tagName("input"));
		int Total_buttons=button.size();
		System.out.println("Total buttons are: " + Total_buttons);
		
		Thread.sleep(3000);
		
		//w.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/div/a[2]")).click();
		//Thread.sleep(3000);
		
		//w.close();
		
		
		
		
		
		
		
		
	}

}
