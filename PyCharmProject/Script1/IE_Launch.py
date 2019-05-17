import time

from selenium import webdriver

browser = webdriver.Ie(executable_path="E:\SeleniumComponents\IEDriverServer.exe")
browser.maximize_window()
time.sleep(5)
browser.close()
