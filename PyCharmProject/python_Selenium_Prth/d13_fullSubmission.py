import time

from selenium import webdriver
from selenium.webdriver.support.select import Select

chrome = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
chrome.maximize_window()
chrome.get(url="https://account.magento.com/customer/account/create/")

chrome.find_element_by_id("firstname").send_keys("pratik")
chrome.find_element_by_name("lastname").send_keys("seraj")
chrome.find_element_by_id("email_address").send_keys("pratik@gmail.com")

drop = chrome.find_element_by_id('country')
a=Select(drop)
a.select_by_visible_text('India')

role=chrome.find_element_by_name('individual_role')
b=Select(role)
b.select_by_value('technical/developer')

drop_down = chrome.find_element_by_id('customer_company_type')
s=Select(webelement=drop_down)
s.select_by_index(index=5)
time.sleep(3)

chrome.find_element_by_id('password').send_keys("asdfghj")
chrome.find_element_by_name('confirmation').send_keys("asdfghj")

chrome.find_element_by_id('agree_terms').click()



