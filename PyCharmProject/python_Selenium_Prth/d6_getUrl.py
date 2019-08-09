from selenium import webdriver

browser = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
browser.maximize_window()
browser.get(url="http://gmail.com/")
url = browser.current_url
print("Current URL:",url)
browser.close()