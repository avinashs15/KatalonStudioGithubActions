import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import common.Utilities as Utilities
import common.AppObjects as AppObjects
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser(GlobalVariable.healthcareApp)

//WebUI.maximizeWindow()
WebUI.click(findTestObject('HealthCareDemo/HomePage/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('HealthCareDemo/HomePage/a_Login'))

CustomKeywords.'common.BusinessLogic.LoginToHealthcareApp'()

WebUI.selectOptionByValue(findTestObject('HealthCareDemo/AppointmentPage/select_Facility'), 'Hongkong CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/radio_Medicaid_programs'))

WebUI.delay(2)

WebUI.click(AppObjects.GetBookAppointmentCheckBox())

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/input_Visit Date (Required)_visit_date'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/date_15'))

def comment = ('Test Automation_' + Utilities.randomString(
        'asdaswereewdsfg', 10)) + '_Browser_' + Utilities.getBrowserName()

WebUI.setText(findTestObject('HealthCareDemo/AppointmentPage/textarea_Comment_comment'), comment)

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('HealthCareDemo/AppointmentPage/h2_Appointment Confirmation'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('HealthCareDemo/HomePage/a_CURA Healthcare_menu-toggle'), 0)

CustomKeywords.'common.BusinessLogic.LogOut'()

WebUI.closeBrowser()

