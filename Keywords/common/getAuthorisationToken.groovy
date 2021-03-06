package common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import groovy.json.JsonSlurper
import com.kms.katalon.core.testobject.ConditionType
import java.util.ArrayList

import internal.GlobalVariable

public class getAuthorisationToken {

	@Keyword
	def String GetAuthorisationToken() {
		ResponseObject response = WS.sendRequest(findTestObject('PizzaAppAPI/getPizzaAccessToken'))

		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(response.getResponseText())

		def authorisationToken = parsedJson.access_token

		return(authorisationToken)
	}

	@Keyword
	def String getPizzaOrders() {
		def authToken = GetAuthorisationToken()

		RequestObject ScopeToProject = findTestObject('PizzaAppAPI/getPizzaOrders')
		TestObjectProperty header1 = new TestObjectProperty("Authorization", ConditionType.EQUALS, "Bearer " + authToken)
		TestObjectProperty header2 = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
		ArrayList defaultHeaders = Arrays.asList(header1, header2)

		ScopeToProject.setHttpHeaderProperties(defaultHeaders)

		ResponseObject response = WS.sendRequest(ScopeToProject)

		return (response.getResponseText());
	}
}
