import time

from selenium import webdriver

chrome = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
chrome.maximize_window()

chrome.get('file:///D:/python_Selenium/d14_html.html')
time.sleep(3)

chrome.find_element_by_xpath('//div[2]/input[2]').send_keys('prtik@gmail.com')
time.sleep(3)

chrome.find_element_by_xpath('//div[1]/input[1]').send_keys('asdfghjk')
time.sleep(3)

chrome.close()
