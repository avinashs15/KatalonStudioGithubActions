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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('HealthCareDemo/HomePage/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('HealthCareDemo/HomePage/a_Login'))

WebUI.setText(findTestObject('HealthCareDemo/LoginPage/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('HealthCareDemo/LoginPage/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('HealthCareDemo/LoginPage/button_Login_selfHealing'))

WebUI.selectOptionByValue(findTestObject('HealthCareDemo/AppointmentPage/select_Facility'), 'Hongkong CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/radio_Medicaid_programs'))

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/date_15'))

WebUI.setText(findTestObject('HealthCareDemo/AppointmentPage/textarea_Comment_comment'), 'Self Healing Demo')

WebUI.click(findTestObject('HealthCareDemo/AppointmentPage/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('HealthCareDemo/AppointmentPage/h2_Appointment Confirmation'))

WebUI.click(findTestObject('HealthCareDemo/HomePage/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('HealthCareDemo/HomePage/a_Logout'))

WebUI.closeBrowser()

