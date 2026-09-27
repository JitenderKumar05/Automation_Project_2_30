package User_Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User_Details {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		By Name = By.xpath("//input[@id='name']");
		By Email = By.xpath("//input[@id='email']");
		By Phone = By.xpath("//input[@id='phone']");
		By Address = By.xpath("//textarea[@id='textarea']");
		By Gender = By.xpath("//input[@id='male']");
		
		public User_Details(WebDriver driver) {
			this.driver;
		}
		

	}

}
