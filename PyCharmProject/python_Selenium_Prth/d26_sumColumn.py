from selenium import webdriver
from selenium.webdriver.common.by import By

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get("https://www.datatables.net/extensions/select/examples/initialisation/checkbox.html")

row_info =  firefox.find_elements_by_xpath("//table[@id='example']/tbody/tr")    #list containg contents of row
row_count = len(row_info)                                                         #length  of the row
total=0
for row in range(1,row_count+1):
    salary_info = firefox.find_element_by_xpath("//table[@id='example']/tbody/tr["+str(row)+"]/td[6]")    #last column i.e. td[6]
    salary_string = salary_info.text
    salary_string = salary_string.replace("$",'').replace(",",'')
    salary_int = int(salary_string)
    total = total + salary_int
print("The total salary is:",total)

firefox.quit()
