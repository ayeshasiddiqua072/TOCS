import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

def testData = TestDataFactory.findTestData('LoginData_Internal')
def username = testData.getValue('username', 1)
def password = testData.getValue('password', 1)

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), username)
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), password)
WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.delay(2)
WebUI.closeBrowser()

