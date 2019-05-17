import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.fb.com/")

chrome.find_element_by_xpath("//input[@id='email']").send_keys("Scahin@gmial.com")

key_board = ActionChains(driver=chrome)

time.sleep(1)

key_board.send_keys(Keys.TAB).send_keys("1234567").pause(2).perform()

time.sleep(2)
chrome.quit()
