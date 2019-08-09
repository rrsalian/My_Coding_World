import time

from selenium import webdriver

browser = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
browser.maximize_window()
browser.get(url="http://www.gmail.com")

# browser.find_element_by_css_selector("input[id^='iden'").send_keys("patik@gmail.com")   # StartsWith
# browser.find_element_by_css_selector("input[id$='Id'").send_keys("patik@gmail.com")   # EndsWith
browser.find_element_by_css_selector("input[id*='den'").send_keys("patik@gmail.com")   # Contains

time.sleep(5)
browser.close()
