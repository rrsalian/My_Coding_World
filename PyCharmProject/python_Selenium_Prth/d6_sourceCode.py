from selenium import webdriver

browser = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
browser.maximize_window()
browser.get(url="http://gmail.com/")
source = browser.page_source
print("SourceCode:", source)
browser.close()