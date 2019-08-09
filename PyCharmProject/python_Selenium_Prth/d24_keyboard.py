import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get("http://www.cleartrip.com")

from_element = firefox.find_element_by_xpath(xpath="//input[@id='FromTag']")

keyboard = ActionChains(firefox)

keyboard.move_to_element(to_element=from_element).click().pause(3).send_keys("tri").send_keys(Keys.ARROW_DOWN).send_keys(Keys.ARROW_DOWN).send_keys(Keys.ARROW_DOWN).send_keys(Keys.ARROW_DOWN).send_keys(Keys.ARROW_DOWN).pause(3).perform()

keyboard.send_keys(Keys.ENTER).perform()

time.sleep(3)
firefox.quit()