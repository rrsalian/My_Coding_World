import time

from jproperties import Properties
from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()
chrome.implicitly_wait(time_to_wait=20)

chrome.get(url="https://magento.com/")

p=Properties()
f=p.load("magento.properties")

myacc=f.get('myacc')
print(myacc)

email=f.get('email')
print(email)

psw=f.get('password')
print(psw)

login=f.get('login')
print(login)

logout=f.get('logout')
print(logout)

chrome.find_element_by_xpath(xpath=myacc).click()
chrome.find_element_by_xpath(xpath=email).send_keys("nitinmanjunath1991@gmail.com")
chrome.find_element_by_xpath(xpath=psw).send_keys("Welcome123")
chrome.find_element_by_xpath(xpath=login).click()

time.sleep(2)

chrome.find_element_by_xpath(xpath=logout).click()

time.sleep(2)

chrome.quit()