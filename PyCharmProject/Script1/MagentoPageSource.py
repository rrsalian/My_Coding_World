from selenium import webdriver

browser = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
browser.maximize_window()
browser.get(url="https://www.Magento.com")
source_code=browser.page_source

print(source_code)
browser.close()