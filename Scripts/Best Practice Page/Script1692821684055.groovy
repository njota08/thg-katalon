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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa-dtp.poweredbyhackett.com/accounts/sign-in')

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_E-mail Address_form-row__input'), 'ericdicianno@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Password_form-row__input'), '7q1aKE1wHhStYTYBr26JbA==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Program Select/a_Digital Transformation'))

WebUI.click(findTestObject('Object Repository/Page_Clients/a_American Cancer Society'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Home/a_Resources'))

WebUI.click(findTestObject('Object Repository/Page_Resources - Performance Metrics/a_Best Practices'))

WebUI.takeFullPageScreenshotAsCheckpoint('Best Practice Page')

WebUI.closeBrowser()

