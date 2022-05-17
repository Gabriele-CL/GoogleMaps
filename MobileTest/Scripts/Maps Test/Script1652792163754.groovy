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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

Mobile.startExistingApplication('com.google.android.apps.maps')
driver = MobileDriverFactory.getDriver()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.TextView - Cerca qui'), 0)

Mobile.setText(findTestObject('Object Repository/Maps Test/android.widget.EditText - Cerca qui'), 'colosseo', 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.LinearLayout'), 0)

def indicazioni = Mobile.getText(findTestObject('Object Repository/Maps Test/android.view.View - Indicazioni'), 0)

KeywordUtil.logInfo(indicazioni)

Mobile.verifyMatch('Indicazioni', indicazioni, false)

def biglietti = Mobile.getText(findTestObject('Object Repository/Maps Test/android.widget.CompoundButton - Biglietti'), 0)

KeywordUtil.logInfo(biglietti)

Mobile.verifyMatch('Biglietti', biglietti, false)

def chiama = Mobile.getText(findTestObject('Object Repository/Maps Test/android.widget.CompoundButton - Chiama'), 0)

KeywordUtil.logInfo(chiama)

Mobile.verifyMatch('Chiama', chiama, false)

//Mobile.scrollToText('Indicazioni')

Mobile.tap(findTestObject('Object Repository/Maps Test/android.view.View - Indicazioni'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.TextView - Scegli la posizione iniziale'), 20)

//Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/Maps Test/android.widget.EditText - Scegli la posizione iniziale'), 'pantheon', 
    0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.LinearLayout (1)'), 0)

def anteprima = Mobile.getText(findTestObject('Object Repository/Maps Test/android.view.View - Anteprima'), 0)

KeywordUtil.logInfo(anteprima)

Mobile.verifyMatch('Anteprima', anteprima, false)

def percorso = Mobile.getText(findTestObject('Object Repository/Maps Test/android.view.View - Percorso'), 0)

KeywordUtil.logInfo(percorso)

Mobile.verifyMatch('Percorso', percorso, false)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.EditText - Cerca lungo il percorso'), 0)

Mobile.setText(findTestObject('Object Repository/Maps Test/android.widget.EditText - Cerca lungo il percorso'), 'Gelateria', 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Maps Test/android.widget.ImageView (2)'), 0)

driver.resetApp()

