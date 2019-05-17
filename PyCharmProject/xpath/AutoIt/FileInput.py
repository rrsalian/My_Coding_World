import os
import time

from selenium import webdriver

chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="C:\\Users\\defaultuser1.RRSALIAN\\PyCharmProject\\xpath\\AutoIt\\file.html")

chrome.find_element_by_xpath(xpath="//input[@id='input1']").click()

#Autoit file is Execued by Python Interpreter
os.system("E:\\SeleniumComponents\\fileinput.exe")

time.sleep(5)

chrome.find_element_by_xpath("//input[@id='submit']").click()
time.sleep(6)

chrome.quit()
