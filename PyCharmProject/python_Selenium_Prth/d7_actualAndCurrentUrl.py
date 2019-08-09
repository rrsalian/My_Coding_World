from selenium import webdriver
e_currentUrl = "https://www.google.com/intl/en-GB/gmail/about/"
chrome = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
chrome.maximize_window()
chrome.get(url="http://www.gmail.com")
a_currentUrl = chrome.current_url

print("ACU:", a_currentUrl)
print("ECU:", e_currentUrl)
if a_currentUrl == e_currentUrl:
    print("Success")
else:
    print("Failed")
chrome.close()