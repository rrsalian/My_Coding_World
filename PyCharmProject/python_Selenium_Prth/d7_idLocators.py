import time

from selenium import webdriver
from selenium.webdriver.common.by import By

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get(url="http://www.facebook.com")

# email = firefox.find_element(By.ID, "email")
email = firefox.find_element_by_id("email")
email.send_keys("pratheekseraje@gmail.com")

time.sleep(5)
firefox.close()