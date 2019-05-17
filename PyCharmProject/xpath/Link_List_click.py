from selenium import webdriver
from selenium.webdriver.common.by import By

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://magento.com")

links=chrome.find_elements(By.TAG_NAME,"a")
print(len(links))
print(links)
for i in links:
    txt=i.text
    print(txt)
    if txt=="My Account":
        i.click()
        break




chrome.close()