import time

from selenium import webdriver


chrome=webdriver.Chrome(executable_path="")
chrome.maximize_window()

chrome.get(url="http://www.echoecho.com/javascript4.htm")

chrome.find_element_by_xpath("//input[@name='B1']").click()
time.sleep(2)
alert_box=chrome.switch_to.alert
time.sleep(2)
print(alert_box.text)

alert_box.accept()
time.sleep(3)

chrome.quit()



