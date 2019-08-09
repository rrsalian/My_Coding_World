import time

from selenium import webdriver
from selenium.webdriver.support.select import Select

chrome = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
chrome.maximize_window()
chrome.get(url="https://account.magento.com/customer/account/create/")

drop_down = chrome.find_element_by_id('customer_company_type')

s=Select(webelement=drop_down)
s.select_by_index(index=5)
time.sleep(3)

s.select_by_value(value="deployment")
time.sleep(3)

s.select_by_visible_text(text="Is a merchant who sells online")
time.sleep(3)

chrome.close()

