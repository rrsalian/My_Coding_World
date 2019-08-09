from selenium import webdriver


def perform(browser):
    browser.maximize_window()
    browser.get(url="http://gmail.com/")
    print("The title:", browser.title)
    print("The current URL:", browser.current_url)
    browser.close()


browser1 = input("Enter the browser?\t")
if browser1=="firefox":
    firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
    perform(firefox)
elif browser1=="chrome":
    chrome = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
    perform(chrome)
else:
    ie = webdriver.Ie(executable_path="D:\python_Selenium\SeleniumComponents\IEDriverServer.exe")
    perform(ie)
