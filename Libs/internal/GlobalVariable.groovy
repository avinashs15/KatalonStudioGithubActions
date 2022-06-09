package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object healthcareApp
     
    /**
     * <p></p>
     */
    public static Object fileUploadURL
     
    /**
     * <p></p>
     */
    public static Object pizzaAPI
     
    /**
     * <p></p>
     */
    public static Object orderID
     
    /**
     * <p></p>
     */
    public static Object accesstoken
     
    /**
     * <p></p>
     */
    public static Object usn
     
    /**
     * <p></p>
     */
    public static Object APIUSN
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            healthcareApp = selectedVariables['healthcareApp']
            fileUploadURL = selectedVariables['fileUploadURL']
            pizzaAPI = selectedVariables['pizzaAPI']
            orderID = selectedVariables['orderID']
            accesstoken = selectedVariables['accesstoken']
            usn = selectedVariables['usn']
            APIUSN = selectedVariables['APIUSN']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
