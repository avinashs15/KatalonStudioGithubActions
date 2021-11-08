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

String emailStr = Utilities.randomString('TestAuto', 5) + 'test@test.com'

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('eCommerceWebsite/HomePage/button_Sign in'))

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/LoginPage/RegistrationSection/input_EmailAddress'), emailStr)

WebUI.click(findTestObject('eCommerceWebsite/UserAccountPages/LoginPage/RegistrationSection/button_CreateAccount'))

WebUI.click(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/radio_Mr_id_gender'))

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/input_customer_firstname'), 
    'Test')

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/input_customer_lastname'), 
    'automation')

WebUI.setEncryptedText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/PersonalInfo/input_Password'), 
    'xawWuIhk6essJvzo9I0/GQ==')

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/Address/input_Addess_Line1'), 'Aster005, test')

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/Address/input_Address_Line2'), 'RakeshFantasyGarden')

WebUI.selectOptionByLabel(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/Address/select_State'), 'California', 
    true)

WebUI.click(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/Address/input_City'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/Address/input_City'), 'California')

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/Address/input_Postcode'), '87451')

WebUI.setText(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/Address/input_Phone_mobile'), '885599854')

WebUI.click(findTestObject('eCommerceWebsite/UserAccountPages/RegistrationPage/button_Register'))

WebUI.closeBrowser()

