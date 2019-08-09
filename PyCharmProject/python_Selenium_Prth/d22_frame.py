import time

from selenium import webdriver

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get("file:///D:/python_Selenium/d22_Frame.html")

firefox.find_element_by_xpath("//input[@id='fname']").send_keys("Ramesh")
time.sleep(3)
firefox.switch_to.frame(0)

firefox.find_element_by_xpath("//input[@id='lname']").send_keys("Tendulkar")
time.sleep(3)

firefox.switch_to.default_content()

firefox.find_element_by_xpath("//input[@id='fname']").clear()
time.sleep(3)

firefox.find_element_by_xpath("//input[@id='fname']").send_keys("Sachin")

time.sleep(3)

firefox.quit()