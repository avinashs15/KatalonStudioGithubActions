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

WebUI.setText(findTestObject('null'), 'avinash.ranganatha@katalon.com')

WebUI.setEncryptedText(findTestObject('null'), 'zEUcwQbRsi3fgls/TnbcFg==')

WebUI.click(findTestObject('null'))

not_run: WebUI.delay(15)

WebUI.enableSmartWait()

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('null'))

def userName = 'TestAutomationDemo' + Utilities.randomString('TestAsds', 5)

WebUI.setText(findTestObject('null'), userName)

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

TestObject linkuserName = AppObjects.GetObjectByTypeAndProperty('xpath', ('//a[text()=\'' + userName) + '\']')

WebUI.verifyElementPresent(linkuserName, 5)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.acceptAlert()

