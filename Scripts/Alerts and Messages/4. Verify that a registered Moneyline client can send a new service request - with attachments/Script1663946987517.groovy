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

WebUI.callTestCase(findTestCase('Login/login with correct credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Alerts and Messages/Flag Button'))

WebUI.click(findTestObject('Alerts and Messages/Messages tab'))

WebUI.click(findTestObject('Alerts and Messages/Select Messages'))

WebUI.click(findTestObject('Alerts and Messages/Compose new message button'))

WebUI.selectOptionByIndex(findTestObject('Alerts and Messages/Category input box'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Alerts and Messages/Enter subject'), 'My accounts are locked')

WebUI.setText(findTestObject('Alerts and Messages/enter description'), 'Can you please unlock all my accounts')

WebUI.uploadFile(findTestObject('Alerts and Messages/Attachments messages'), 'C:\\Users\\lwynter\\Documents\\t24 credentials.txt')

'Capturing the file name after upload and storing it in a variable'
FilePath = WebUI.getAttribute(findTestObject('Alerts and Messages/Attachments messages'), 'value')

'Verifying the Actual path and Expected path of file'
WebUI.verifyMatch(FilePath, 'C:\\Users\\lwynter\\Documents\\t24 credentials.txt', false)

