import time

from selenium import webdriver

browser = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
browser.maximize_window()
browser.get(url="http://www.gmail.com")

browser.find_element_by_partial_link_text("Inbox").click()



time.sleep(5)
browser.close()
