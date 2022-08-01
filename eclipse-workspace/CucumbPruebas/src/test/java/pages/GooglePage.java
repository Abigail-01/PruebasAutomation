package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage extends BasePage {

	private String txtName="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]";
	private String txtLastName="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]";
	private String txtAddres ="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]";
	private String txtemail ="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]";
	private String txtphone="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";
	private String listLanguaje="//span[@id='select2-country-container']";

	
	
	
	public GooglePage() {
		super(driver);
	}

	public void navigateToGoogle() {

		navigateTo("https://demo.automationtesting.in/Register.html");
		//  https://demo.automationtesting.in/Register.html
	}
	public void registerUser() {
		write(txtName, "Cesar");
		write(txtLastName,"Carlos");
		write(txtAddres,"Cuahtemoc");
		write(txtemail,"Carlos@gmail.com");
		write(txtphone,"23812903810");
	}
	public void enterSearchCriteria(String criteria) {
		//write(searchTextField, criteria);
		
	}
	public void addProductCart() {
		/*clickElement(btn_add);
		clickElement(btn_closedAdd);
		clickElement(btn_add2);
		clickElement(btn_closedAdd);*/
	}
	public void selectLanjuage() {
		selecFromDropdownByIndex(listLanguaje, 3);
	}


}
