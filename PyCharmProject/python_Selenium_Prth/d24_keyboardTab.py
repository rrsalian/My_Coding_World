import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()

firefox.get("http://www.facebook.com")

firefox.find_element_by_xpath("//input[@id='email']").send_keys("pratik@gmail.com")

key_board = ActionChains(firefox)

key_board.send_keys(Keys.TAB).send_keys("qwertyuiop").perform()

time.sleep(3)
firefox.quit()