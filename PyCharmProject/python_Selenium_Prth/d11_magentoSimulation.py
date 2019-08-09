import time

from selenium import webdriver

chrome = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
chrome.maximize_window()

chrome.get(url="https://www.magento.com")

chrome.find_element_by_link_text(link_text="My Account").click()
time.sleep(3)

chrome.find_element_by_id(id_="email").send_keys("nitinmanjunath1991@gmail.com")
chrome.find_element_by_id(id_="pass").send_keys("Welcome123")
chrome.find_element_by_id(id_="send2").click()

time.sleep(3)

chrome.find_element_by_link_text(link_text="Log Out").click()
chrome.close()
