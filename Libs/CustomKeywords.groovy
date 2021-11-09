
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling

import java.util.Map

import java.util.List

import kms.turing.katalon.plugins.helper.table.WebTableHelper.CellTextOptions

import kms.turing.katalon.plugins.helper.XPathHelper.CompareOptions

import com.katalon.plugin.keyword.connection.DBType

import java.sql.Connection

import java.sql.ResultSet

import com.applitools.eyes.selenium.Eyes

import com.applitools.eyes.RectangleSize



def static "common.AppObjects.GetBookAppointmentCheckBox"() {
    (new common.AppObjects()).GetBookAppointmentCheckBox()
}


def static "common.AppObjects.GetObjectByTypeAndProperty"(
    	String type	
     , 	String property	) {
    (new common.AppObjects()).GetObjectByTypeAndProperty(
        	type
         , 	property)
}

 /**
	 * Refresh browser
	 */ 
def static "Utility.refreshBrowser"() {
    (new Utility()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "Utility.clickElement"(
    	TestObject to	) {
    (new Utility()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "Utility.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new Utility()).getHtmlTableRows(
        	table
         , 	outerTagName)
}


def static "common.BusinessLogic.LoginToHealthcareApp"() {
    (new common.BusinessLogic()).LoginToHealthcareApp()
}


def static "common.BusinessLogic.LoginApplicationUsingUSNAndPwd"(
    	String userName	
     , 	String passWord	) {
    (new common.BusinessLogic()).LoginApplicationUsingUSNAndPwd(
        	userName
         , 	passWord)
}


def static "common.BusinessLogic.LogOut"() {
    (new common.BusinessLogic()).LogOut()
}


def static "common.BusinessLogic.VerifyHomePage"() {
    (new common.BusinessLogic()).VerifyHomePage()
}

 /**
	 * Refresh browser
	 */ 
def static "common.Utilities.refreshBrowser"() {
    (new common.Utilities()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "common.Utilities.clickElement"(
    	TestObject to	) {
    (new common.Utilities()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "common.Utilities.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new common.Utilities()).getHtmlTableRows(
        	table
         , 	outerTagName)
}


def static "common.Utilities.getBrowserName"() {
    (new common.Utilities()).getBrowserName()
}


def static "common.Utilities.randomString"(
    	String chars	
     , 	int length	) {
    (new common.Utilities()).randomString(
        	chars
         , 	length)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByIndexes"(
    	WebElement table	
     , 	int columnIndex	
     , 	int rowIndex	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByIndexes(
        	table
         , 	columnIndex
         , 	rowIndex)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByIndexes"(
    	WebElement table	
     , 	int columnIndex	
     , 	int rowIndex	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByIndexes(
        	table
         , 	columnIndex
         , 	rowIndex
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByHeader"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByHeader(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByHeader(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getRowIndexByCellsInfo"(
    	WebElement table	
     , 	java.util.Map<String, java.lang.Object> cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getRowIndexByCellsInfo(
        	table
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getRowIndexByCellsInfo"(
    	WebElement table	
     , 	java.util.Map<String, java.lang.Object> cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getRowIndexByCellsInfo(
        	table
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyRowDisplayed"(
    	WebElement table	
     , 	java.util.Map<String, java.lang.Object> cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyRowDisplayed(
        	table
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyRowDisplayed"(
    	WebElement table	
     , 	java.util.Map<String, java.lang.Object> cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyRowDisplayed(
        	table
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.clickOnColumn"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).clickOnColumn(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.clickOnColumn"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).clickOnColumn(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByAttribute"(
    	WebElement table	
     , 	String attribute	
     , 	String value	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByAttribute(
        	table
         , 	attribute
         , 	value)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByAttribute"(
    	WebElement table	
     , 	String attribute	
     , 	String value	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByAttribute(
        	table
         , 	attribute
         , 	value
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getCellsValueByColumnHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getCellsValueByColumnHeader(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getCellsValueByColumnHeader"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getCellsValueByColumnHeader(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders
         , 	timeout)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByHeaderAndCellsInfo"(
    	WebElement table	
     , 	String columnHeader	
     , 	java.util.Map<String, java.lang.Object> cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByHeaderAndCellsInfo(
        	table
         , 	columnHeader
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByHeaderAndCellsInfo"(
    	WebElement table	
     , 	String columnHeader	
     , 	java.util.Map<String, java.lang.Object> cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByHeaderAndCellsInfo(
        	table
         , 	columnHeader
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByValueAndColHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	String cellValue	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByValueAndColHeader(
        	table
         , 	columnHeader
         , 	cellValue)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByValueAndColHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	String cellValue	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByValueAndColHeader(
        	table
         , 	columnHeader
         , 	cellValue
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	
     , 	CompareOptions compareOption	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption
         , 	compareOption)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	
     , 	CompareOptions compareOption	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption
         , 	compareOption
         , 	flowControl)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection"(
    	DBType type	
     , 	String server	
     , 	String port	
     , 	String dbName	
     , 	String userName	
     , 	String Password	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).createConnection(
        	type
         , 	server
         , 	port
         , 	dbName
         , 	userName
         , 	Password)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection"() {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).getGlobalConnection()
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection"(
    	Connection conn	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).closeConnection(
        	conn)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.execute"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).execute(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeQuery(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeUpdate(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getRowCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getColumnCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).resultSetToArrayList(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	colIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue"(
    	ResultSet rs	
     , 	int fromRowIndex	
     , 	int toRowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListRowValue(
        	rs
         , 	fromRowIndex
         , 	toRowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue"(
    	ResultSet rs	
     , 	int rowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleRowValue(
        	rs
         , 	rowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV"(
    	ResultSet rs	
     , 	String pathFile	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).exportToCSV(
        	rs
         , 	pathFile)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).isEmptyResult(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	int columnIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnIndex)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection"(
    	String fileName	
     , 	String query	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingGlobalConnection(
        	fileName
         , 	query)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection"(
    	String fileName	
     , 	String query	
     , 	String user	
     , 	String password	
     , 	DBType dbType	
     , 	String host	
     , 	String port	
     , 	String dbName	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingInternalConnection(
        	fileName
         , 	query
         , 	user
         , 	password
         , 	dbType
         , 	host
         , 	port
         , 	dbName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}
