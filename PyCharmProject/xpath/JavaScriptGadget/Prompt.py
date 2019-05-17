import time

from selenium import webdriver


chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="http://www.echoecho.com/javascript4.htm")

chrome.find_element_by_xpath("//input[@name='B3']").click()
time.sleep(2)
prmt_box=chrome.switch_to.alert

prmt_box.send_keys("ASDFGHJK")
time.sleep(2)

prmt_box.accept()
time.sleep(2)
chrome.quit()



