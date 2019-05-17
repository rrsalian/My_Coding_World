import time

from selenium import webdriver
from selenium.webdriver.support.select import Select

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://account.magento.com/customer/account/create/")

chrome.find_element_by_id("firstname").send_keys("Rakshith")
chrome.find_element_by_id("lastname").send_keys("RSalian")
chrome.find_element_by_id("email_address").send_keys("rrsa@gmail.com")

#Locate the DropDown menu Elements



drop_down=chrome.find_element_by_id(id_="country")
s=Select(webelement=drop_down)
s.select_by_value("IN")
time.sleep(5)

drop_down=chrome.find_element_by_id(id_="customer_company_type")
s=Select(webelement=drop_down)
s.select_by_index(index=5)
time.sleep(5)

drop_down=chrome.find_element_by_id(id_="customer_individual_role")
s=Select(webelement=drop_down)
s.select_by_visible_text("Technical/developer")
time.sleep(5)

chrome.find_element_by_id("password").send_keys("123456")
time.sleep(5)

chrome.find_element_by_id("confirmation").send_keys("23456")




chrome.close()

