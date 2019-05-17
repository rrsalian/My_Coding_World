import time

from selenium import webdriver
from selenium.webdriver.common.by import By

chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://datatables.net/extensions/select/examples/initialisation/checkbox.html")

total=0

row_info=chrome.find_elements(By.XPATH,"//table[@id='example']/tbody/tr")
row_count=len(row_info)

for row in range(1,row_count+1):
    salary_info=chrome.find_element_by_xpath("//table[@id='example']/tbody/tr["+str(row)+"]/td[6]")
    slary_string=salary_info.text
    slary_string=slary_string.replace('$','').replace(',','')
    slary_int =int(slary_string)
    total+=total+slary_int

print(total)