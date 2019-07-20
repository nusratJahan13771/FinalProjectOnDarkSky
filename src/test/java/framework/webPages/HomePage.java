package framework.webPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("u_0_e");
	private By lastNameTextField = By.id("u_0_g");
	private By mobileNumberTextField = By.id("mobileNumber");
	private By newPasswordTextField = By.id("newPwd");
	private By errorMessage = By.linkText("Sign up for an account.");
//	private By errorMessage = By.xpath("//div[contains(text(),'Incorrect email address or phone number')");
	//private By errorMessegemessenger=By.xpath("//div[contains(text(),'Incorrect email address or phone number')]");
	private By femaleGender = By.id("u_0_9");
	private By maleGender = By.id("u_0_a");
	//private By messengerLink = By.xpath("//a[contains(text(),'Messenger')]");
	private By messengerLink=By.linkText("Messenger");
	private By signupButton = By.id("u_0_y");
	private By firstName=By.id("u_0_l");
	private By lastName=By.id("u_0_n");
	private By invalidEmailAdresss=By.id("u_0_q");
	private By newPasswordTextFieldd=By.id("u_0_x");
	private By redWarningButtonTextField=By.xpath("//div[@id='u_0_p']//i[@class='_5dbc img sp_iIvgq58YJ3n_2x sx_b687c7']  ");
	//darksky
	private  By register=By.xpath("//button[contains(text(),'Register')]");
	private By errorMsg=By.xpath("//input[@placeholder='hacker@example.com']");
	private By darkskyurlxpath=By.xpath("//span[@class='logo company-name']");
	private By temperature=By.xpath("//div[@class='temps']//span//span");


	public void clickOnRegister(){
	clickOn(register);
	}
	public String geterrorMsg(String value){
	return geterrorMsg(value);
}
	public String getDark(){
	return getTextFromElement(darkskyurlxpath);
}
	public String getAllTemperature(){
	return getTextFromElement(temperature);
	}

	public void enterFirstNamee(String value){
		setValue(firstName,value);
	}

	public void enterLastNamee(String value){
		setValue(lastName,value);
	}

	public void enterEnvalidEmailAddress(String value){
		setValue(invalidEmailAdresss,value);
	}



	public void clickOnNewPasswordTextField(){
		clickOn(newPasswordTextField);
	}

	public void clickOnRedWarningButtonTextField(){
		clickOn(redWarningButtonTextField);
	}

	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		setValue(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		setValue(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValue(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValue(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValue(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValue(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public boolean isGenderFemaleSelected() {
		return isElementSelected(femaleGender);
	}

	public void clickOnFemaleGender() {
		clickOn(femaleGender);
	}

	public boolean isGenderMaleSelected() {
		return isElementSelected(maleGender);
	}

	public void clickOnMaleGender() {
		clickOn(maleGender);
	}

	public void clickOnMessengerLink() {
		clickOn(messengerLink);
	}

	public boolean isSignupButtonEnable() {
		return isElementEnabled(signupButton);
	}
	}
