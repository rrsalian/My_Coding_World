import time

from selenium import webdriver
from selenium.webdriver.common.by import By

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get('http://www.google.com')

links = firefox.find_elements(By.TAG_NAME,"a")
print("The links count is:",len(links))


print("The link text name is:")

for ele in links:
    lin_text_name = ele.text
    print(lin_text_name)

time.sleep(3)

firefox.close()