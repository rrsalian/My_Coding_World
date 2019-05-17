import time

from selenium import webdriver

browser = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
browser.maximize_window()
time.sleep(5)
browser.close()
