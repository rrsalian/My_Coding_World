import time

from selenium import webdriver

browser = webdriver.Chrome(executable_path="D:\python_Selenium\SeleniumComponents\chromedriver.exe")
browser.maximize_window()
browser.get(url="http://www.facebook.com")

#______________ID__________________
# browser.find_element_by_css_selector("input#email").send_keys("dhoni@gmail.com")
# browser.find_element_by_css_selector("input#pass").send_keys("rajuson")

#___________CLASS__________________
# browser.find_element_by_css_selector("input.inputtext").send_keys("dhoni@gmail.com")
# browser.find_element_by_css_selector("input.inputtext").send_keys("rajuson")

#__________ATTRIBUTE_______________
# browser.find_element_by_css_selector("input[name='email']").send_keys("dhoni@gmail.com")
# browser.find_element_by_css_selector("input[name='pass']").send_keys("rajuson")

#_________CLASS_ATTRIBUTE_________
browser.find_element_by_css_selector("input.inputtext[name='email']").send_keys("dhoni@gmail.com")
browser.find_element_by_css_selector("input.inputtext[name='pass']").send_keys("rajuson")


time.sleep(3)
browser.close()
