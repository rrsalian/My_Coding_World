import time

from selenium import webdriver

chrome = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
chrome.maximize_window()

chrome.set_page_load_timeout(time_to_wait=80)

chrome.get(url="http://www.magento.com")

chrome.find_element_by_link_text("My Account").click()

time.sleep(3)
# chrome.close()

