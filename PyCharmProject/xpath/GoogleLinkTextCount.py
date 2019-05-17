from selenium import webdriver
from selenium.webdriver.common.by import By

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://google.com")

links=chrome.find_elements(By.TAG_NAME,"a")
print(len(links))
for i in links:
    txt=i.text
    print(txt)





chrome.close()