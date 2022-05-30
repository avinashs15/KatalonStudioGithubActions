import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/3q/h1sgcb2n07dfh7z7c5f8v1xc0000gn/T/Katalon/20220523_165040/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://www.saucedemo.com/\')\n\nWebUI.click(findTestObject(\'Page_Swag Labs/input_Useraname\'))\n\nWebUI.setText(findTestObject(\'Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac\'), \'standard_user\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9\'), \'qcu24s4901FyWDTwXGr6XA==\')\n\nWebUI.click(findTestObject(\'Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71\'))\n\nWebUI.click(findTestObject(\'Page_Swag Labs/div_Sauce Labs Fleece Jacket\'))\n\nWebUI.click(findTestObject(\'Page_Swag Labs/button_Add to cart\'))\n\nWebUI.click(findTestObject(\'Page_Swag Labs/a_1\'))\n\nWebUI.click(findTestObject(\'Page_Swag Labs/button_Checkout\'))\n\nWebUI.setText(findTestObject(\'Page_Swag Labs/input_Checkout Your Information_firstName\'), \'Joh\')\n\nWebUI.setText(findTestObject(\'Page_Swag Labs/input_Checkout Your Information_lastName\'), \'Snow\')\n\nWebUI.setText(findTestObject(\'Page_Swag Labs/input_Checkout Your Information_postalCode\'), \'Winterfell\')\n\nWebUI.click(findTestObject(\'Page_Swag Labs/input_Cancel_continue\'))\n\nWebUI.click(findTestObject(\'Page_Swag Labs/button_Finish\'))\n\nWebUI.verifyElementText(findTestObject(\'Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER\'), \'THANK YOU FOR YOUR ORDER\')\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

