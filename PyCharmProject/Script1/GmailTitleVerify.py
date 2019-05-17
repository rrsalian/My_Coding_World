from selenium import webdriver

expcted_title=input("Enter the title: ")
browser=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
browser.maximize_window()
browser.get(url="https://www.gmail.com")
actual_title=browser.title
if actual_title.casefold()==expcted_title.casefold():
    print("Pass")
else:
    print("Fail")
browser.close()