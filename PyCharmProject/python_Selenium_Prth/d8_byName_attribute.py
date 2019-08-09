import time

from selenium import webdriver
from selenium.webdriver.common.by import By

browser = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
browser.maximize_window()
browser.get(url="http://www.facebook.com")

email = browser.find_element(By.NAME,"email")
email.send_keys("pratik@gmail.com")

pwd = browser.find_element(By.NAME,"pass")
pwd.send_keys("asdfghjkl")

time.sleep(5)
browser.close()