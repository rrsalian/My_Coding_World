from selenium import webdriver

brower=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
brower.maximize_window()
brower.get(url="https://www.gmail.com")
cur_url=brower.current_url
print("The current url is:",cur_url)
brower.close()