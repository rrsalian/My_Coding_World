from selenium import webdriver
title = input("Enter the input?")
firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get(url="http://www.gmail.com")
c_title = firefox.title
print(c_title)
print(title)
print(c_title.casefold())
print(title.casefold())
if title.casefold()==c_title.casefold():
    print("Pass")
else:
    print("Fail")
firefox.close()