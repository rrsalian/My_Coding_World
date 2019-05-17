import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")

chrome.maximize_window()
chrome.get(url="https://seleniumhq.github.io/selenium/docs/api/java/index.html")

time.sleep(2)

chrome.switch_to.frame(chrome.find_element_by_xpath("//frame[@name='packageListFrame']"))

chrome.find_element_by_xpath("//li//a[text()='com.thoughtworks.selenium']").click()

time.sleep(2)

chrome.switch_to.default_content()

chrome.switch_to.frame(chrome.find_element_by_xpath("//frame[@name='packageFrame']"))
time.sleep(2)

#chrome.find_element_by_xpath("//a[@target='classFrame']").click()
chrome.find_element_by_xpath("//a[@target='classFrame']/span[text()='Selenium']").click()
time.sleep(2)

chrome.switch_to.default_content()

chrome.switch_to.frame(chrome.find_element_by_xpath("//frame[@name='classFrame']"))

chrome.find_element_by_xpath("(//a[text()='Overview'])[1]").click()
time.sleep(2)

chrome.quit()

