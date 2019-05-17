import time

from selenium import webdriver


chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="http://www.echoecho.com/javascript4.htm")

chrome.find_element_by_xpath("//input[@name='B2']").click()
time.sleep(2)
cnfrm_box=chrome.switch_to.alert
time.sleep(2)
print(cnfrm_box.text)

cnfrm_box.dismiss()
time.sleep(3)

chrome.quit()



