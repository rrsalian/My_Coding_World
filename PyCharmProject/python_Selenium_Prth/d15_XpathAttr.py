import time

from selenium import webdriver

chrome = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
chrome.maximize_window()

chrome.get('http://www.facebook.com')
time.sleep(3)

chrome.find_element_by_xpath("//input[@class='inputtext'][@id='email']").send_keys('prtik@gmail.com')
time.sleep(3)

chrome.find_element_by_xpath("//input[@class='inputtext'][@id='pass']").send_keys('asdfghjkl')
time.sleep(3)

chrome.close()
