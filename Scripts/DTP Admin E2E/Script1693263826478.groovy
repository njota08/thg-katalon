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

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_E-mail Address_form-row__input'), user1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Password_form-row__input'), '7q1aKE1wHhStYTYBr26JbA==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/a_Sign In'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image1')

WebUI.click(findTestObject('Object Repository/Page_Program Select/a_Digital Transformation'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image2')

WebUI.click(findTestObject('Object Repository/Page_Clients/a_American Express'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image3')

WebUI.click(findTestObject('Object Repository/Page_Home/a_user'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Admin'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_MasterClientSelect'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Advisory'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image4')

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Users'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image5')

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Events'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image6')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_IP Management'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Best Practices'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image7')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_IP Management'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Performance Metrics'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image8')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_IP Management'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Documents'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image9')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_IP Management'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Surveys'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image10')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_IP Management'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Process Flow Documents'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image11')

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Promoted Content'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image12')

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Tags'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image13')

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Modules'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image14')

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Advisors'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image15')

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Program Management'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image16')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_System'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Master Client'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image17')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_System'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Banner Messages'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image18')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_System'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Token'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image19')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_System'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Application Data'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image20')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_System'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Software Versions'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image21')

WebUI.mouseOver(findTestObject('Object Repository/Page_Digital Transformation/a_System'))

WebUI.click(findTestObject('Object Repository/Page_Digital Transformation/a_Software Vendors'))

WebUI.takeFullPageScreenshotAsCheckpoint('Image22')

WebUI.closeBrowser()

