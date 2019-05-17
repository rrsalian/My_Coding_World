import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="file:///C:/Users/defaultuser1.RRSALIAN/PyCharmProject/xpath/Sample.html")
chrome.find_element_by_xpath("/html/body/input[1]").send_keys("asdf@gmail.com")
chrome.find_element_by_xpath("/html/body/input[2]").send_keys("1234567")

time.sleep(3)
chrome.close()

