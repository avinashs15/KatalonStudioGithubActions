import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.MobileBy

import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.connection.ConnectionState
import io.appium.java_client.android.connection.ConnectionStateBuilder
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory




Mobile.startApplication(RunConfiguration.getProjectDir() + '/ExternalFiles/APIDemos.apk', true)
AppiumDriver<?> driver = MobileDriverFactory.getDriver()
ConnectionState cs = new ConnectionStateBuilder()..withWiFiDisabled().build()
driver.setConnection(cs)

Mobile.tap(findTestObject('Object Repository/MobileApp/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/MobileApp/android.widget.TextView - Graphics'), 0)

Mobile.tap(findTestObject('Object Repository/MobileApp/android.widget.TextView - AlphaBitmap'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/MobileApp/android.widget.TextView - Compass'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/MobileApp/android.widget.TextView - CreateBitmap'), 0)

Mobile.pressBack()

Mobile.takeElementScreenshotAsCheckpoint('', findTestObject(null))

Mobile.closeApplication()

Mobile.tap(findTestObject('MobileApp/android.widget.Button - OK'), 0)

