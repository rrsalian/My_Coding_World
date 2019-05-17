import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

#Polling time is set  to 20sex
chrome.implicitly_wait(time_to_wait=40)

chrome.get(url="https://magento.com/solutions")
chrome.find_element_by_xpath("//a[text()='My Account']").click()
chrome.find_element_by_xpath("//input[@id='email']").send_keys("nitinmanjunath1991@gmail.com")
chrome.find_element_by_xpath("//input[@id='pass']").send_keys("Welcome123")
chrome.find_element_by_xpath("//button[@id='send2']").click()

#chrome.find_element_by_xpath("//a[text()='Log Out']").click()

wait = WebDriverWait(chrome,timeout=50)
log_out=wait.until(expected_conditions.visibility_of_element_located((By.LINK_TEXT,"Log Out")))

log_out.click()
time.sleep(3)
chrome.close()

