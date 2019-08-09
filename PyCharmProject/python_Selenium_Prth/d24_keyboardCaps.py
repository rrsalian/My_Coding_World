import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()

firefox.get(url="http://www.google.com")

search_box = firefox.find_element_by_xpath(xpath="//input[@name='q']")

action = ActionChains(firefox)

action.move_to_element(to_element=search_box).click().key_down(Keys.SHIFT).send_keys("abcfortechnology").pause(3).send_keys(Keys.ENTER).perform()



time.sleep(3)
firefox.quit()