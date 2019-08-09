import time

from selenium import webdriver
from selenium.webdriver import ActionChains

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html")

drag_element = firefox.find_element_by_xpath("//div[@id='box5']")
drop_element = firefox.find_element_by_xpath("//div[@id='box106']")

mouse = ActionChains(firefox)

mouse.drag_and_drop(source=drag_element,target=drop_element).perform()

time.sleep(3)
firefox.quit()