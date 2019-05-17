import time

from selenium import webdriver
browser_name=input("Enter browser name")
def activity(browser):
    browser.maximize_window()
    browser.get(url="https://www.gmail.com")

    print("Title = ",browser.title)
    print("The Current URL :", browser.current_url)
    time.sleep(5)
    browser.close()

if(browser_name.casefold()=="chrome".casefold()):
    chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
    activity(chrome)
elif (browser_name.casefold()=="firefox".casefold()):
    firefox = webdriver.Firefox(executable_path="E:\SeleniumComponents\geckodriver.exe")
    activity(firefox)
else:
    ie = webdriver.Ie(executable_path="E:\SeleniumComponents\IEDriverServer.exe")
    activity(ie)


