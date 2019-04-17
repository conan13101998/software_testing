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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Page Hoc lieu sach mem/Dang nhap'))

WebUI.setText(findTestObject('Page Dang nhap Sach mem/input email_useremail'), 'xuananh.do1998@gmail.com')

WebUI.setEncryptedText(findTestObject('Page Dang nhap Sach mem/input matkhu_userpassword'), 'utLJSzMnl2UDl4mdlA0eKA==')

WebUI.click(findTestObject('Page Dang nhap Sach mem/Button submit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 1'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Bi tp cui tun Ton 1 Tp 2'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Giao bi tp'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

