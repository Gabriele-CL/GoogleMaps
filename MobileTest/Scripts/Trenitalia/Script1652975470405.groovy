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

Mobile.startExistingApplication('com.lynxspa.prontotreno')

Mobile.switchToPortrait()

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject(''), 'Roma Termini', 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.TextView - Roma Termini'), 0)

Mobile.setText(findTestObject('Object Repository/Trenitalia/android.widget.EditText - Stazione di arrivo'), 'Roma Tuscolana', 
    0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.TextView - Roma Tuscolana'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/Trenitalia/android.view.View'), 0)

Mobile.getText(findTestObject('Object Repository/Trenitalia/android.view.View (1)'), 0)

Mobile.getText(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.Button - CONFERMA'), 0)

Mobile.startExistingApplication('com.lynxspa.prontotreno')

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.Button - RICERCA'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.Button - FILTRI'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.RadioButton - Durata Viaggio'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.Button - AVANTI'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.TextView - Continua senza login'), 0)

Mobile.setText(findTestObject('Object Repository/Trenitalia/android.widget.EditText - Nome'), 'Gabriele', 0)

Mobile.setText(findTestObject('Object Repository/Trenitalia/android.widget.EditText - Cognome'), 'Campanale', 0)

Mobile.setText(findTestObject('Object Repository/Trenitalia/android.widget.EditText - Email'), 'gabriele.campanale@outlook.it', 
    0)

Mobile.setText(findTestObject('Object Repository/Trenitalia/android.widget.EditText - Conferma Email'), 'gabriele.campanale@outlook.it', 
    0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.EditText - Numero di telefono'), 0)

Mobile.setText(findTestObject('Object Repository/Trenitalia/android.widget.EditText - Numero di telefono (1)'), '3477411286', 
    0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.Button - PROCEDI'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.Button - AVANTI (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.RadioButton'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.Button - HO CAPITO'), 0)

Mobile.tap(findTestObject('Object Repository/Trenitalia/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

