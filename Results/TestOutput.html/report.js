$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FlightPageTest.feature");
formatter.feature({
  "name": "To Test Flight Page functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FlightTests"
    }
  ]
});
formatter.scenario({
  "name": "one way domestic flight details searching",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FlightTests"
    }
  ]
});
formatter.step({
  "name": "flightpage is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightPageStepDefTest.flightpageIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on oneway radio button",
  "keyword": "When "
});
formatter.match({
  "location": "FlightPageStepDefTest.iClickOnOnewayRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I selected fromCity from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "FlightPageStepDefTest.iSelectedFromCityFromDropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I selected Tocity from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "FlightPageStepDefTest.iSelectedTocityFromDropdown()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput id\u003d\"toCity\" type\u003d\"text\" class\u003d\"fsw_inputField font30 lineHeight36 latoBlack\" readonly\u003d\"\" value\u003d\"Bangalore\"\u003e is not clickable at point (554, 254). Other element would receive the click: \u003cinput type\u003d\"text\" autocomplete\u003d\"off\" aria-autocomplete\u003d\"list\" aria-controls\u003d\"react-autowhatever-1\" class\u003d\"react-autosuggest__input react-autosuggest__input--open react-autosuggest__input--focused\" placeholder\u003d\"To\" value\u003d\"\"\u003e\n  (Session info: chrome\u003d77.0.3865.90)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-IUQKNDU\u0027, ip: \u0027192.168.0.26\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\Rajesh\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:59791}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5ac1c575c354ad6bd62fa4d0203cf996\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat com.rajesh.automationframework.stepDefinitions.FlightPageStepDefTest.iSelectedTocityFromDropdown(FlightPageStepDefTest.java:62)\r\n\tat ✽.I selected Tocity from dropdown(file:FlightPageTest.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I selected departure date from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "FlightPageStepDefTest.iSelectedDepartureDateFromDropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I clicked on search button",
  "keyword": "When "
});
formatter.match({
  "location": "FlightPageStepDefTest.iClickedOnSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should be displayed the flight details of selected date",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightPageStepDefTest.iShouldBeDisplayedTheFlightDetailsOfSelectedDate()"
});
formatter.result({
  "status": "skipped"
});
});