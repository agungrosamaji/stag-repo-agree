import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration


'Get full directory\'s path of android application'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.waitForElementPresent(findTestObject('Screen_Onboarding/Image_Agree'), GlobalVariable.G_TimeOutScreen, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Onboarding/Image_Agree'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Onboarding/Image_Onboarding'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Onboarding/Text_Salam'), 'Salam, Agree!', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Onboarding/Text_Beragam'), 'Beragam fitur pertanian dan pencatatan kemitraan dalam satu genggaman.', FailureHandling.STOP_ON_FAILURE)

