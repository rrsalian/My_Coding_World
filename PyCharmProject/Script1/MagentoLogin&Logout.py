import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.magento.com")

#Locate the My Account Link
chrome.find_element_by_link_text("My Account").click()

#Halting the program for 3sec
time.sleep(3)

#Locate the email  and send keyes
chrome.find_element_by_id("email").send_keys("nitinmanjunath1991@gmail.com")

#Locate the password and send keys
chrome.find_element_by_id("pass").send_keys("Welcome123")

#Locate the login and click
chrome.find_element_by_id("send2").click()

#Halting the program for 3sec
time.sleep(3)

#Locate the Logout and click
chrome.find_element_by_link_text("Log Out").click()

#Close the chrome
chrome.close()