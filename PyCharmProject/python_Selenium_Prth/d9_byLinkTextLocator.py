import time

from selenium import webdriver

browser = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
browser.maximize_window()
browser.get(url="http://www.facebook.com")

# forgotten_link = browser.find_element_by_link_text("Forgotten account?")
# forgotten_link.click()
browser.find_element_by_link_text("Forgotten account?").click()

# print(type(forgotten_link))      # type = webElement

time.sleep(5)
browser.close()
