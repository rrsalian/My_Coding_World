import time

from selenium import webdriver

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()

firefox.get('file:///D:/python_Selenium/d20_html1.html')

firefox.find_element_by_xpath("//a[text()='click here']").click()
time.sleep(5)
handles = firefox.window_handles
print(handles)
print(len(handles))

firefox.switch_to.window(handles[1])

firefox.find_element_by_xpath("")
firefox.quit()