from selenium import webdriver
import time
chrome=webdriver.Chrome(executable_path="D:\chromedriver.exe")
chrome.maximize_window()
chrome.implicitly_wait(time_to_wait=20)

l=['ABCAU18AVIJ046','ABCAU18AVIJ154','ABCAU18M2VIJ139','ABCAU18M2VIJ188','ABCAU18M2VIJ206','ABCAU18M2VIJ234',
'ABCAU18M2VIJ235','ABCAU18M2VIJ237','ABCAU18M2VIJ284','ABCAU18MVIJ284','ABCAU18AVIJ010','ABCOCT18MVIJ046']
chrome.get(url="https://tests.abcfortech.com/student/#/login")

for i in l:

    chrome.find_element_by_xpath("//input[@name='email']").send_keys(i+"@abcfortech.com")
    chrome.find_element_by_xpath("//input[@name='password']").send_keys("abcfortech")
    chrome.find_element_by_xpath("//span[text()='Log in']").click()
    name=chrome.find_element_by_xpath("//span[@ng-bind='studentName']")
    print(i,name.text)
    chrome.back()

time.sleep(10)

chrome.close()