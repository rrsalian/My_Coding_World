import os
import time

from selenium import webdriver

firefox = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
firefox.maximize_window()
firefox.get("file:///D:/python_Selenium/d27_html.html")

firefox.find_element_by_xpath(xpath="//input[@id='fileInput']").click()

os.system("D:\python_Selenium\SeleniumComponents\d27_autoIT.exe")

firefox.find_element_by_xpath("//input[@id='submit']").click()

time.sleep(5)

firefox.quit()