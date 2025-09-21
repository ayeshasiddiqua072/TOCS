import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.context.TestCaseContext

class LoginTestListener {

	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		println "The test case '" + testCaseContext.getTestCaseId() + "' has finished."

		
		String status = testCaseContext.getTestCaseStatus()
		println "Current status: " + status

		if (status == 'PASSED') {
			println "Great! The test passed successfully."
		} else if (status == 'FAILED') {
			println "Oh no! The test failed. Check the details above."
		}
	}
}
