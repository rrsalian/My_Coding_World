import time

from selenium import webdriver
from selenium.webdriver.common.by import By

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.fb.com")


chrome.find_element_by_partial_link_text("Forgotten").click()


time.sleep(5)
chrome.close()