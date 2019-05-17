from selenium import webdriver
exp_title=input("Enter the title")
brower=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
brower.maximize_window()
brower.get(url="https://www.Magento.com")
act_title=brower.title

if act_title.casefold()==exp_title.casefold():
    print("Pass")
else:
    print("Fail")
brower.close()
