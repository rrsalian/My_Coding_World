import time

from selenium import webdriver

browser = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
browser.maximize_window()

browser.get(url="https://www.gmail.com")
title= browser.title
print("The title of Gmail is: ",title)
time.sleep(5)
browser.close()
