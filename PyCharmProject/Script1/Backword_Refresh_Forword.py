import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.magento.com")

#Locate the My Account Link
chrome.find_element_by_link_text("My Account").click()

time.sleep(3)

chrome.back()
time.sleep(3)

chrome.refresh()
time.sleep(3)

chrome.forward()
time.sleep(3)

chrome.close()