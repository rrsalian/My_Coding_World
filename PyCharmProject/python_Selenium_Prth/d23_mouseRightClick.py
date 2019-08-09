import time

from selenium import webdriver
from selenium.webdriver import ActionChains

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get("http://www.demo.guru99.com/test/simple_context_menu.html")

#right_click_ele = firefox.find_element_by_xpath("//span[text()='right click me']")
double_click_ele = firefox.find_element_by_xpath("//button")

mouse = ActionChains(firefox)

#mouse.context_click(right_click_ele).perform()
mouse.double_click(double_click_ele).perform()


time.sleep(3)
firefox.quit()