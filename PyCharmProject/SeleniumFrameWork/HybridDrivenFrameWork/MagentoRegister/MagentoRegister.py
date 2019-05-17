import time

from jproperties import Properties
from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()
chrome.implicitly_wait(time_to_wait=20)



p=Properties()
f=p.load("magento.properties")


xpath_fname=f.get('xpath_fname')
print(xpath_fname)

xpath_lname=f.get('xpath_lname')
print(xpath_lname)

xpath_psw=f.get('password')
print(xpath_psw)

xpath_login=f.get('login')
print(xpath_login)

xpath_logout=f.get('logout')
print(xpath_logout)

url=f.get('url')
print(url)

email=f.get('umail')
print(email)

psw=f.get('psw')
print(psw)

chrome.get(url=url)
chrome.find_element_by_xpath(xpath=xpath_myacc).click()
chrome.find_element_by_xpath(xpath=xpath_email).send_keys(email)
chrome.find_element_by_xpath(xpath=xpath_psw).send_keys(psw)
chrome.find_element_by_xpath(xpath=xpath_login).click()

time.sleep(2)

chrome.find_element_by_xpath(xpath=xpath_logout).click()

time.sleep(2)

chrome.quit()