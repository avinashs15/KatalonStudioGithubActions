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

WebUI.openBrowser('https://katalon-inc--demo.my.salesforce.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('SalesForce/Page_Login  Salesforce/input_Username_username'), 'avinash.ranganatha@katalon.com')

WebUI.setEncryptedText(findTestObject('SalesForce/Page_Login  Salesforce/input_Password_pw'), 'zEUcwQbRsi3fgls/TnbcFg==')

WebUI.click(findTestObject('SalesForce/Page_Login  Salesforce/input_Password_Login'))

not_run: WebUI.delay(15)

WebUI.enableSmartWait()

WebUI.click(findTestObject('SalesForce/Page_Home  Salesforce/span_Chatter'))

WebUI.click(findTestObject('SalesForce/Page_Home  Salesforce/svg_Accounts_btn_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('SalesForce/Page_Home  Salesforce/span_New Account'))

WebUI.click(findTestObject('SalesForce/Page_New Account  Popup/raido_businessAccount'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SalesForce/Page_New Account  Popup/btn_Next'))

def userName = 'TestAutomationDemo' + Utilities.randomString('TestAsds', 5)

WebUI.setText(findTestObject('SalesForce/Page_New Account  Popup/text_AccountName'), userName)

WebUI.delay(2)

WebUI.click(findTestObject('SalesForce/Page_New Account  Popup/btn_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('SalesForce/Page_Home  Salesforce/span_Accounts'))

WebUI.delay(2)

TestObject linkuserName = AppObjects.GetObjectByTypeAndProperty('xpath', ('//a[text()=\'' + userName) + '\']')

WebUI.verifyElementPresent(linkuserName, 5)

WebUI.click(findTestObject('SalesForce/TopPanel/btnUserProfile'))

WebUI.click(findTestObject('SalesForce/TopPanel/a_Log Out'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.acceptAlert()

