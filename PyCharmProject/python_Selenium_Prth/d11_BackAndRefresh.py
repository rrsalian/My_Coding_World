import time

from selenium import webdriver

chrome = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
chrome.maximize_window()
chrome.get(url="http://www.magento.com")

chrome.find_element_by_link_text("My Account").click()
time.sleep(3)

chrome.back()
time.sleep(3)

chrome.refresh()
time.sleep(3)

chrome.forward()

chrome.close()