# This is script for like all the images of top clebraties who Instagram id is in list


from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
import random
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By


# Open Instagram in Firefox and wait for the login form to load
driver = webdriver.Chrome(executable_path="D:\chromedriver.exe")
driver.maximize_window()
driver.implicitly_wait(15)
driver.get('https://instagram.com/')
  # seconds

login_button = driver.find_element_by_xpath("//a[@href='/accounts/login/?source=auth_switcher']")
login_button.click()
time.sleep(2)
user_name_elem = driver.find_element_by_xpath("//input[@name='username']")
user_name_elem.clear()
user_name_elem.send_keys("")
passworword_elem = driver.find_element_by_xpath("//input[@name='password']")
passworword_elem.clear()
passworword_elem.send_keys("")
passworword_elem.send_keys(Keys.RETURN)

driver.find_element_by_xpath("//button[text()='Not Now']").click()


driver.find_element_by_xpath('//span[@aria-label="Find People"]').click()


#driver.find_element_by_xpath('(//div[@class="_9AhH0"])[1]').click()
time.sleep(20)
try:
	WebDriverWait(driver,100).until(EC.presence_of_element_located((By.XPATH,'(//div[@class="_9AhH0"])[1]')))
	driver.find_element_by_xpath('(//div[@class="_9AhH0"])[1]').click()
except:
	WebDriverWait(driver,100).until(EC.presence_of_element_located((By.XPATH,'(//div[@class="_9AhH0"])[2]')))
	driver.find_element_by_xpath('(//div[@class="_9AhH0"])[2]').click()

k=0

while k<100:
	#time.sleep(3)
	try:
		WebDriverWait(driver,100).until(EC.presence_of_element_located((By.XPATH,'(//span[@class="glyphsSpriteHeart__outline__24__grey_9 u-__7" or @aria-label="Like"])[2]')))
		driver.find_element_by_xpath('(//span[@class="glyphsSpriteHeart__outline__24__grey_9 u-__7" or @aria-label="Like"])[2]').click()
		#time.sleep(17)
		k=k+1
	finally:
		driver.find_element_by_xpath('//a[text()="Next"]').click()
	


	