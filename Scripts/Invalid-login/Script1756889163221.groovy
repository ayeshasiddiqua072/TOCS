import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

// Open browser and navigate
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')

// Enter username and password
WebUI.setText(findTestObject('Object Repository/Invalid-Login/Page_Swag Labs/input_Swag Labs_user-name'), 'hello')
WebUI.setEncryptedText(findTestObject('Object Repository/Invalid-Login/Page_Swag Labs/input_Swag Labs_password'), 'wk1826zyhF2x3KCNNswjoQ==')

// Click login button
WebUI.click(findTestObject('Object Repository/Invalid-Login/Page_Swag Labs/input_Swag Labs_login-button'))

// Define elements to interact with
def elements = [
    'Object Repository/Invalid-Login/Page_Swag Labs/div_Swag Labs_login_credentials',
    'Object Repository/Invalid-Login/Page_Swag Labs/h3'
]

// Loop through elements and perform actions
for (elementPath in elements) {
    def testObj = findTestObject(elementPath)
    
    // Check if element is present
    boolean isPresent = WebUI.verifyElementPresent(testObj, 5, FailureHandling.OPTIONAL)
    
    if (isPresent) {
        // Perform actions on the element
        WebUI.click(testObj)
        WebUI.doubleClick(testObj)
        WebUI.rightClick(testObj)
        WebUI.comment("Actions performed on: " + elementPath)
    } else {
        WebUI.comment("Element not found: " + elementPath)
    }
}

// Final verification for error message (login failed)
def errorObj = findTestObject('Object Repository/Invalid-Login/Page_Swag Labs/h3')
boolean isErrorDisplayed = WebUI.verifyElementPresent(errorObj, 5, FailureHandling.OPTIONAL)

if (isErrorDisplayed) {
    WebUI.comment("Login failed: Invalid credentials")
    WebUI.takeScreenshot('Screenshots/InvalidLogin.png')
} else {
    WebUI.comment("Login successful!")
}

// Close browser
WebUI.closeBrowser()


