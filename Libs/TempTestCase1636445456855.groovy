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


RunConfiguration.setExecutionSettingFile('/var/folders/3q/h1sgcb2n07dfh7z7c5f8v1xc0000gn/T/Katalon/20211109_134056/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://katalon-demo-cura.herokuapp.com/\')\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars\'))\n\nWebUI.doubleClick(findTestObject(\'Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars\'))\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars\'))\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/a_Login\'))\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/div_Demo account\'))\n\nWebUI.setText(findTestObject(\'Page_CURA Healthcare Service/input_Username_username\'), \'John Doe\')\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/input_Demo account_form-control\'))\n\nWebUI.doubleClick(findTestObject(\'Page_CURA Healthcare Service/input_Demo account_form-control\'))\n\nWebUI.setEncryptedText(findTestObject(\'Page_CURA Healthcare Service/input_Password_password\'), \'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM\')\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/button_Login\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107\'), \n    \'Hongkong CURA Healthcare Center\', true)\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f\'))\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/input_Medicaid_programs\'))\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date\'))\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/td_14\'))\n\nWebUI.setText(findTestObject(\'Page_CURA Healthcare Service/textarea_Comment_comment\'), \'Demo Comment\')\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/button_Book Appointment\'))\n\nWebUI.verifyElementText(findTestObject(\'Page_CURA Healthcare Service/h2_Appointment Confirmation\'), \'Appointment Confirmation\')\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

