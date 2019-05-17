import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.fb.com")

chrome.find_element_by_css_selector("input.inputtext[name='email']").send_keys("rrsalian16@gmail.com")
time.sleep(3)

chrome.find_element_by_css_selector("input.inputtext[name='pass']").send_keys("1234")
time.sleep(3)

chrome.close()