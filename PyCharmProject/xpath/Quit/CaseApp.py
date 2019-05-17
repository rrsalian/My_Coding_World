import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")

chrome.maximize_window()
chrome.get(url="C:\\Users\\defaultuser1.RRSALIAN\\PyCharmProject\\xpath\\Quit\\input1.html")
time.sleep(3)
chrome.find_element_by_xpath("//a[text()='Click here']").click()


handles=chrome.window_handles
print(type(handles))
print(len(handles))

chrome.switch_to.window(handles[1])


time.sleep(3)
chrome.find_element_by_xpath("//input[1]").send_keys("Sachin")

time.sleep(3)
chrome.find_element_by_xpath("//input[2]").send_keys("Tendulkar")
time.sleep(3)

chrome.quit()