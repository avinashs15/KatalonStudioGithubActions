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

WebUI.openBrowser('')

WebUI.maximizeWindow()

'Home Page\r\n'
WebUI.navigateToUrl('automationpractice.com')

WebUI.click(findTestObject('eCommerceWebsite/HomePage/button_Sign in'))

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/LoginPage/RegistrationSection/input_EmailAddress'), 'asdasd@ss.com')

WebUI.click(findTestObject('eCommerceWebsite/UserAccountPages/LoginPage/RegistrationSection/button_CreateAccount'))

WebUI.check(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/radio_Mr_id_gender'))

WebUI.delay(5)

WebUI.click(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/radio_Mrs_id_gender'))

WebUI.check(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/check_Newsletter'))

WebUI.check(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/check_Optin'))

WebUI.selectOptionByLabel(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/select_DOB_Day'), '4  ', false)

WebUI.selectOptionByValue(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/select_DOB_Month'), '9', false)

WebUI.selectOptionByValue(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/select_DOB_year'), '1983', false)

WebUI.delay(5)

WebUI.closeBrowser()

