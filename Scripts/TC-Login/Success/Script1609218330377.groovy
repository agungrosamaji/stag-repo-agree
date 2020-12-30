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
import com.sun.org.apache.bcel.internal.classfile.LocalVariable

import internal.GlobalVariable as GlobalVariable

Mobile.tap(findTestObject('Screen_Login/Input_Username'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Screen_Login/Input_Username'), username, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Screen_Login/Input_Password'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Screen_Login/Input_Password'), password, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Screen_Login/Button_Masuk'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Screen_Home/Text_Nama_Mitra'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Screen_Home/Text_Nama_Mitra'), nama, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(20)

Mobile.closeApplication()
