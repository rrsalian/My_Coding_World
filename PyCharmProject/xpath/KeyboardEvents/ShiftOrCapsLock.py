import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.google.com/")

search_box = chrome.find_element_by_xpath("//input[@name='q']")

key_board = ActionChains(driver=chrome)

key_board.move_to_element(to_element=search_box).click().pause(2).key_down(Keys.SHIFT).send_keys(
    "abcfortechnology").pause(2).send_keys(Keys.ENTER).perform()
#key_board.send_keys(Keys.ENTER).perform()

time.sleep(2)
chrome.quit()
