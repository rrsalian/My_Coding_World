import time

from selenium import webdriver

browser = webdriver.Firefox(executable_path='D:\python_Selenium\SeleniumComponents\geckodriver.exe')
browser.maximize_window()
browser.get(url="http://www.gmail.com")
title = browser.title
print('Title:',title)
time.sleep(5)
browser.close()
