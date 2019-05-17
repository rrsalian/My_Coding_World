import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")

chrome.maximize_window()
chrome.get(url="C:\\Users\\defaultuser1.RRSALIAN\\PyCharmProject\\xpath\\Frame\\input1.html")

chrome.find_element_by_xpath("//input[@id='frame']").send_keys("Ramesh")
time.sleep(2)

chrome.switch_to.frame(0)
chrome.find_element_by_xpath("//input[@id='lname']").send_keys("Tendulkar")

time.sleep(2)

chrome.switch_to.default_content()
time.sleep(2)
chrome.find_element_by_xpath("//input[@id='frame']").clear()
time.sleep(2)
chrome.find_element_by_xpath("//input[@id='frame']").send_keys("Sachin")

time.sleep(2)

chrome.quit()