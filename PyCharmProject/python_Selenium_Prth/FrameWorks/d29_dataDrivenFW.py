import time

from jproperties import Properties
from selenium import webdriver

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.implicitly_wait(time_to_wait=20)
p=Properties()
f=p.load('d29_magento.properties')

url=f.get('url')
print(url)
username=f.get('un')
print(username)
passwrd=f.get('pwd')
print(passwrd)

firefox.get(url=url)

firefox.find_element_by_xpath(xpath="//a[text()='My Account']").click()
firefox.find_element_by_xpath(xpath="//input[@id='email']").send_keys(username)
firefox.find_element_by_xpath(xpath="//input[@id='pass']").send_keys(passwrd)
time.sleep(3)
firefox.find_element_by_xpath(xpath="//button[@id='send2']").click()
time.sleep(3)
firefox.find_element_by_xpath(xpath="//a[text()='Log Out']").click()

firefox.quit()