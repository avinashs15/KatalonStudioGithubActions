package common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class BusinessLogic {

	@Keyword
	def LoginToHealthcareApp() {
		String userNameValue = WebUI.getAttribute(findTestObject('HealthCareDemo/LoginPage/input_Demo_userName'), 'value')
		String userPasswordValue = WebUI.getAttribute(findTestObject('HealthCareDemo/LoginPage/input_Demo_Password'), 'value')
		LoginApplicationUsingUSNAndPwd(userNameValue, userPasswordValue)
	}

	@Keyword
	def LoginApplicationUsingUSNAndPwd(String userName, String passWord) {
		WebUI.setText(findTestObject('HealthCareDemo/LoginPage/input_Username_username'), userName)
		WebUI.setText(findTestObject('HealthCareDemo/LoginPage/input_Password_password'), passWord)

		WebUI.click(findTestObject('HealthCareDemo/LoginPage/button_Login'))
	}

	@Keyword
	def LogOut() {
		WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/a_Go to Homepage'))
		WebUI.click(findTestObject('HealthCareDemo/HomePage/a_CURA Healthcare_menu-toggle'))
		WebUI.click(findTestObject('HealthCareDemo/HomePage/a_Logout'))
	}

	@Keyword
	def Boolean VerifyHomePage() {
		return WebUI.verifyElementVisible(findTestObject('Object Repository/HealthCareDemo/AppointmentPage/button_Book Appointment'))
	}
}
