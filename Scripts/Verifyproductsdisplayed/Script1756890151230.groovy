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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/div_Accepted usernames are_login_password'))

WebUI.doubleClick(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/div_Accepted usernames are_login_password'))

WebUI.click(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/body'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/div_Name (A to Z)_inventory_item_name'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/div_Name (A to Z)_inventory_item_name'), 
    'Sauce Labs Backpack')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/button_29.99_add-to-cart-sauce-labs-backpack'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/button_29.99_add-to-cart-sauce-labs-backpack'), 
    'Add to cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/div_Add to cart_inventory_item_name'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Prodctverify/Page_Swag Labs/button_9.99_add-to-cart-sauce-labs-bike-light'), 
    'Add to cart')

WebUI.verifyElementNotPresent(findTestObject('NonExistingProduct'), 10)

