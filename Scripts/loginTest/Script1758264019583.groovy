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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

// Load internal test data
def testData = TestDataFactory.findTestData('LoginData_Internal')

// Loop through all rows in the internal data
for (int i = 1; i <= testData.getRowNumbers(); i++) {
	def username = testData.getValue('username', i)
	def password = testData.getValue('password', i)

	// --- Open Browser and Go to Login Page ---
	WebUI.openBrowser('')
	WebUI.navigateToUrl('https://www.saucedemo.com/')

	// --- Enter Username and Password ---
	WebUI.setText(findTestObject('Page_Login/txt_Username'), username)
	WebUI.setText(findTestObject('Page_Login/txt_Password'), password)

	// --- Click Login ---
	WebUI.click(findTestObject('Page_Login/btn_Login'))

	// --- Optional: Verify login ---
	WebUI.delay(2)  // wait for page load
	WebUI.takeScreenshot()

	// --- Close Browser ---
	WebUI.closeBrowser()
}

// --- Open Browser and Go to Login Page ---
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')

// --- Enter Username and Password ---
WebUI.setText(findTestObject('Page_Login/txt_Username'), username)
WebUI.setEncryptedText(findTestObject('Page_Login/txt_Password'), password)

// --- Click Login ---
WebUI.click(findTestObject('Page_Login/btn_Login'))

// --- Verify login successful (e.g., Products page visible) ---
WebUI.verifyElementPresent(findTestObject('Page_Home/lbl_Products'), 10)

// --- Close Browser ---
WebUI.closeBrowser()

