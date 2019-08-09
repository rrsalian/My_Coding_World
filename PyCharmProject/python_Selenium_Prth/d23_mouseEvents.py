import time

from selenium import webdriver
from selenium.webdriver import ActionChains

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get("http://www.amazon.in/")

shop_by = firefox.find_element_by_xpath(xpath="//span[text()='Shop by']")
echo_alexa = firefox.find_element_by_xpath(xpath="//span[text()='Echo & Alexa']")
echo_dot = firefox.find_element_by_xpath(xpath="//span[text()='All-new Echo Dot']")

mouse = ActionChains(driver=firefox)
'''
mouse.move_to_element(to_element=shop_by).perform()
time.sleep(3)

mouse.move_to_element(to_element=echo_alexa).perform()
time.sleep(3)

mouse.move_to_element(to_element=echo_dot).click().perform()
time.sleep(3)
'''

mouse.move_to_element(shop_by).pause(3).move_to_element(echo_alexa).pause(3).move_to_element(echo_dot).pause(3).click().perform()
firefox.quit()