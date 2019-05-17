import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.gmail.com")

chrome.find_element_by_css_selector("input[id^='iden']").send_keys("rrsalian16@gmail.com")
time.sleep(3)


chrome.close()