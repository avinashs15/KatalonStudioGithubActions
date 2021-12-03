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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import java.util.ArrayList as ArrayList
import static org.assertj.core.api.Assertions.*
import common.Utilities as Utilities

def authToken = CustomKeywords.'common.getAuthorisationToken.GetAuthorisationToken'()

RequestObject ScopeToProject = findTestObject('PizzaAppAPI/addPizzaOrder')

TestObjectProperty header1 = new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + authToken)

TestObjectProperty header2 = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')

ArrayList defaultHeaders = Arrays.asList(header1, header2)

def flavor = "DDT_" + orderFlavor + Utilities.randomString('abcedfghijklmnopqrstuvwxyz', 10)

def pazzaOrder = '{ "Crust":"'+ crust + '", "Flavor": "' + flavor + '","Size": "' + size +'", "Table_No":'+ tableNumber +'}'

ScopeToProject.setHttpHeaderProperties(defaultHeaders)

ScopeToProject.setBodyContent(new HttpTextBodyContent(pazzaOrder))

ResponseObject response = WS.sendRequest(ScopeToProject)

assertThat(response.getStatusCode()).isEqualTo(201)

JsonSlurper slurper = new JsonSlurper()

parsedJson = slurper.parseText(response.getResponseText())

def order_ID = parsedJson.Order_ID

assertThat(order_ID).isNotNull()

GlobalVariable.orderID = order_ID

def resFlavor = parsedJson.Flavor

assertThat(resFlavor).isEqualTo(flavor)

String pizzaOrders = CustomKeywords.'common.getAuthorisationToken.getPizzaOrders'()

assert pizzaOrders.contains(flavor)



