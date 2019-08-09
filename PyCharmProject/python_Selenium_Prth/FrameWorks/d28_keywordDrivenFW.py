import time

from jproperties import Properties
from selenium import webdriver

chrome = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
chrome.maximize_window()
chrome.implicitly_wait(time_to_wait=20)

chrome.get("http://www.magento.com")

p = Properties()
f = p.load("d28_magento.properties")

myacc = f.get('myacc')
email = f.get('email')
password = f.get('password')
login = f.get('login')
logout = f.get('logout')

chrome.find_element_by_xpath(xpath=myacc).click()

chrome.find_element_by_xpath(xpath=email).send_keys("nitinmanjunath1991@gmail.com")
chrome.find_element_by_xpath(password).send_keys("Welcome123")
time.sleep(3)
chrome.find_element_by_xpath(login).click()
time.sleep(3)
chrome.find_element_by_xpath(logout).click()

chrome.quit()