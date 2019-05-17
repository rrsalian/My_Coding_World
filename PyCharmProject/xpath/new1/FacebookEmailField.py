import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.fb.com")
chrome.find_element_by_xpath("//input[@id='email']").send_keys("asdf@gmail.com")
chrome.find_element_by_xpath("//input[@class='inputtext'][@id='pass']").send_keys("1234567")

time.sleep(3)
chrome.close()

