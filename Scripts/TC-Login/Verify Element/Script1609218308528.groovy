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

Mobile.tap(findTestObject('Screen_Onboarding/Button_Masuk'), 0)

Mobile.waitForElementPresent(findTestObject('Screen_Login/Text_Title'), GlobalVariable.G_TimeOutScreen, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Login/Button_Back'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Text_Title'), 'Masuk aplikasi Agree', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Text_Username'), 'Username', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Login/Input_Username'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Input_Username'), 'Ketik username', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Text_Password'), 'Password', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Login/Input_Password'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Input_Password'), 'Ketik password', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Login/Icon_Show_Password'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Login/Checkbox_Ingat_Saya'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Text_Ingat_Saya'), 'Ingat Saya', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/TextLink_Lupa_Password'), 'Lupa password?', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Login/Button_Masuk'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Button_Text_Masuk'), 'Masuk', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Text_Belum_Punya_Akun'), 'Belum punya akun?', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Screen_Login/Button_Buat_Akun'), GlobalVariable.G_TimeOutVerify, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Login/Button_Text_Buat_Akun'), 'Buat Akun', FailureHandling.STOP_ON_FAILURE)




