import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

#Page only load for 30sec
chrome.set_page_load_timeout(25)

chrome.get(url="https://www.magento.com")

#Locate the My Account Link
chrome.find_element_by_link_text("My Account").click()


time.sleep(5)
chrome.close()

