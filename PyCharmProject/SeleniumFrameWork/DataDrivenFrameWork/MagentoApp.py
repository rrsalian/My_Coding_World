import time

from jproperties import Properties
from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()
chrome.implicitly_wait(time_to_wait=20)

p=Properties()
f=p.load("magento.properties")

url=f.get('url')
print(url)

email=f.get('email')
print(email)

psw=f.get('psw')
print(psw)

chrome.get(url=url)

chrome.find_element_by_xpath(xpath="//a[text()='My Account']").click()
chrome.find_element_by_xpath(xpath="//input[@id='email']").send_keys(email)

time.sleep(2)
chrome.find_element_by_xpath(xpath="//input[@id='pass']").send_keys(psw)


chrome.find_element_by_xpath(xpath="//button[@id='send2']").click()

time.sleep(1)
chrome.find_element_by_xpath(xpath="//a[text()='Log Out']").click()
time.sleep(1)
chrome.quit()