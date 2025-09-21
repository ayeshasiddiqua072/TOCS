package mykeywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

class LoginKeywords {

	@Keyword
	def loginToSwagLabs() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.baseUrl)


		WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.username)
		WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.password)
		WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))


		WebUI.verifyElementText(findTestObject('Page_Home/lbl_Title'), 'Products')


		WebUI.closeBrowser()
	}
}
