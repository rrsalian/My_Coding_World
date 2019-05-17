import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.cleartrip.com/")

from_element = chrome.find_element_by_xpath("//input[@id='FromTag']")

key_board = ActionChains(driver=chrome)

key_board.move_to_element(to_element=from_element).click().pause(seconds=2).send_keys("tri").send_keys(
    Keys.ARROW_DOWN).pause(5).send_keys(Keys.ARROW_DOWN).pause(5).send_keys(Keys.ARROW_DOWN).pause(5).send_keys(
    Keys.ARROW_DOWN).pause(5).send_keys(Keys.ARROW_DOWN).perform()

key_board.send_keys(Keys.ENTER).perform()

time.sleep(2)
chrome.quit()
