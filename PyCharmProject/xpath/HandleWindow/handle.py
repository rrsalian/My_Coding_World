import time

from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")

chrome.maximize_window()
chrome.get(url="C:\\Users\\defaultuser1.RRSALIAN\\PyCharmProject\\xpath\\HandleWindow\\fname.html")
time.sleep(3)
chrome.find_element_by_xpath("//a[text()='Click here']").click()


handles=chrome.window_handles
chrome.switch_to.window(handles[1])


time.sleep(3)
chrome.find_element_by_xpath("//input[1]").send_keys("Ramesh")
chrome.find_element_by_xpath("//a[text()='Click here']").click()


time.sleep(3)


handles=chrome.window_handles
chrome.switch_to.window(handles[2])

chrome.find_element_by_xpath("//input[1]").send_keys("Tendulkar")

time.sleep(3)

chrome.switch_to.window(handles[0])
chrome.find_element_by_xpath("//input[1]").send_keys("sachin")




time.sleep(3)

chrome.quit()