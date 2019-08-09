import time

from selenium import webdriver

browser = webdriver.Ie(executable_path="D:\python_Selenium\SeleniumComponents\IEDriverServer.exe")
browser.maximize_window()
browser.get(url="http://www.gmail.com")
time.sleep(5)
browser.close()
