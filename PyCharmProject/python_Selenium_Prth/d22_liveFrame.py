import time

from selenium import webdriver

firefox = webdriver.Firefox(executable_path="D:\python_Selenium\SeleniumComponents\geckodriver.exe")
firefox.maximize_window()
firefox.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html")
time.sleep(3)

firefox.switch_to.frame(firefox.find_element_by_xpath("//frame[@name='packageListFrame']"))
firefox.find_element_by_xpath("//a[text()='com.thoughtworks.selenium']").click()
time.sleep(3)
firefox.switch_to.default_content()

firefox.switch_to.frame(firefox.find_element_by_xpath("//frame[@name='packageFrame']"))
firefox.find_element_by_xpath("//a/span[text()='Selenium']").click()
time.sleep(3)

firefox.switch_to.default_content()

firefox.switch_to.frame(firefox.find_element_by_xpath("//frame[@name='classFrame']"))
firefox.find_element_by_xpath("(//a[text()='Overview'])[1]").click()
time.sleep(3)

firefox.quit()
