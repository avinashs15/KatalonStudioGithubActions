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

WebUI.openBrowser(GlobalVariable.URL)

'HomePage\r\n'
WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('WindowsIFramesAndAlerts/HomePage/PersonalInfoFrame/iframe_PersonalInfoFrame'), 0)

WebUI.setText(findTestObject('WindowsIFramesAndAlerts/HomePage/PersonalInfoFrame/input_firstName'), 'Avinash')

WebUI.setText(findTestObject('WindowsIFramesAndAlerts/HomePage/PersonalInfoFrame/input_lastName'), 'Rananatha')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('WindowsIFramesAndAlerts/HomePage/AddressInfoFrame/iframe_AddressInfoFrame'), 0)

WebUI.setText(findTestObject('WindowsIFramesAndAlerts/HomePage/AddressInfoFrame/input_Address_streetAddress'), 'Address1')

WebUI.setText(findTestObject('WindowsIFramesAndAlerts/HomePage/AddressInfoFrame/input_Address_addressLine2'), 'Address2')

WebUI.setText(findTestObject('WindowsIFramesAndAlerts/HomePage/AddressInfoFrame/input_Address_postCode'), '560043')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('WindowsIFramesAndAlerts/HomePage/a_LOGIN'))

'LoginPage\r\n'
WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('WindowsIFramesAndAlerts/LoginPage/input_userName'), 'test')

WebUI.click(findTestObject('WindowsIFramesAndAlerts/LoginPage/a_Forgot your password'))

'forgotPassword Page\r\n'
WebUI.switchToWindowIndex(2)

WebUI.setText(findTestObject('WindowsIFramesAndAlerts/ForgotPasswordPage/input_Forgotten Password_emailAddress'), 'something')

WebUI.closeWindowIndex(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('WindowsIFramesAndAlerts/HomePage/button_Open an ALERT box'))

if (WebUI.waitForAlert(2)) {
    println(WebUI.getAlertText())

    WebUI.acceptAlert()
}

WebUI.click(findTestObject('WindowsIFramesAndAlerts/HomePage/button_Open a CONFIRM box'))

if (WebUI.waitForAlert(2)) {
    WebUI.dismissAlert()
}

WebUI.click(findTestObject('WindowsIFramesAndAlerts/HomePage/button_Open a PROMPT box'))

if (WebUI.waitForAlert(2)) {
    WebUI.setAlertText('Testing')
}

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.closeBrowser()

