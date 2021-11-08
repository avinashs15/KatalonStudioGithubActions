package loginPackageHealthcareApp
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import junit.framework.Assert

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import common.BusinessLogic
import common.Utilities as Utilities



class Login {
	/**
	 * The step definitions for Login 
	 */
	@Given("I launch healthcare page")
	def I_launch_healthcare_page() {
		WebUI.openBrowser(GlobalVariable.healthcareApp)
		WebUI.maximizeWindow()
	}

	@When("I navigate to login page")
	def I_navigate_to_login_page() {
		WebUI.click(findTestObject('HealthCareDemo/HomePage/a_CURA Healthcare_menu-toggle'))
		WebUI.click(findTestObject('HealthCareDemo/HomePage/a_Login'))
	}

	@When("I login with user '(.*)' and password '(.*)'")
	def I_login_with_user_and_password(String userName, String Password) {

		def BusinessLogic = new BusinessLogic();
		BusinessLogic.LoginApplicationUsingUSNAndPwd(userName, Password)
	}

	@Then("I verify that home page is displayed")
	def I_verify_home_page_is_displayed() {
		def BusinessLogic = new BusinessLogic();
		assert BusinessLogic.VerifyHomePage().TRUE
	}

	@Then("I close the browser")
	def I_close_the_browser() {
		WebUI.closeBrowser();
	}

	@Then("I should be able to add appointment")
	def I_should_be_able_to_add_appointment() {
		WebUI.selectOptionByValue(findTestObject('HealthCareDemo/AppointmentPage/select_Facility'), 'Hongkong CURA Healthcare Center',
				false)
		WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/radio_Medicaid_programs'))
		WebUI.delay(2)
		WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/input_Visit Date (Required)_visit_date'))
		WebUI.delay(2)
		WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/date_15'))
		WebUI.setText(findTestObject('HealthCareDemo/AppointmentPage/textarea_Comment_comment'), (('Test Automation_' + Utilities.randomString(
				'asdaswereewdsfg', 10)) + '_Browser_') + Utilities.getBrowserName())
		WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/button_Book Appointment'))
	}

	@Then("I should log out of the healthcare app")
	def I_should_be_able_to_logout() {
		def BusinessLogic = new BusinessLogic();
		BusinessLogic.LogOut();
	}
}