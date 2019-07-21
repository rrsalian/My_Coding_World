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
user_name_elem.send_keys("user_id")
passworword_elem = driver.find_element_by_xpath("//input[@name='password']")
passworword_elem.clear()
passworword_elem.send_keys("password")
passworword_elem.send_keys(Keys.RETURN)

driver.find_element_by_xpath("//button[text()='Not Now']").click()

l=['kourtneykardash', 'rakulpreet', 'akshaykumar', 'arianagrande', 'ddlovato', 'kingjames', 'leomessi', 'fcbarcelona', 'parineetichopra', 'iamcardib',
 'katrinakaif', 'victoriassecret', 'garethbale11virat.kohli', 'taylorswift', 'theellenshow', 'nickiminaj', 'instagram', '9gag', 'hardikpandya93', 
 'narendramodi', 'championsleague', 'jlo', 'kartikaaryan', 'kyliejenner', 'samantharuthprabhuoffl', 'aliaabhatt', 'kajalaggarwalofficial', 'emmawatson', 
 'abdevilliers17', 'sureshraina3', 'shahidkapoor', 'jamesrodriguez10', 'neymarjr', 'yuvisofficial', 'mileycyrus', 'sachintendulkar', 'shawnmendes', 
 'saraalikhan95', 'shraddhakapoor', 'khloekardashian', 'chrisbrownofficial', 'sunnyleone', 'gururandhawa', 'justintimberlake', 'amandacerny', 
 'kevinhart4real', 'kendalljenner', 'nike', 'anushkasharma', 'caradelevingne', 'varundvn', 'selenagomez', 'realmadrid', 'nasa', 'ranveersingh', 'nehakakkar', 
 'rohitsharma45', 'ronaldinho', 'robertdowneyjr', 'kapilsharma', 'jannatzubair29', 'maluma', 'madhuridixitnene', 'badgalriri', 'zendaya', 'kimkardashian',
 'indiancricketteam', 'bhuvan.bam22', 'hrithikroshan', 'cristiano', 'iamsrk', 'beingsalmankhan', 'natgeo', 'dishapatani', 'vindiesel', 'urvashirautela', 
 'mr_faisu_07', 'davidbeckham', 'beyonce', 'therock', 'katyperry', 'justinbieber', 'shakira', 'kiaraaliaadvani', 'amitabhbachchan', 'gigihadid', 
 'deepikapadukone', 'tigerjackieshroff', 'champagnepapi', 'kritisanon', 'priyankachopra']
 
random.shuffle(l)
for i in l:
	try:
		driver.get('https://instagram.com/'+i+'/')

		count=driver.find_element_by_xpath('(//span[@class="g47SY "])[1]').text
		count=count.replace(",","")
		count=int(count)
		print(count)
		
		#time.sleep(3)
		try:
			WebDriverWait(driver,100).until(EC.visibility_of_element_located((By.XPATH,'(//div[@class="_9AhH0"])[1]')))
			driver.find_element_by_xpath('(//div[@class="_9AhH0"])[1]').click()
		except:
			driver.find_element_by_xpath('//a[text()="Next"]').click()
		
		try:
			for i in range(count):
				#time.sleep(3)
				try:
					WebDriverWait(driver,100).until(EC.presence_of_element_located((By.XPATH,'(//span[@class="glyphsSpriteHeart__outline__24__grey_9 u-__7" or @aria-label="Like"])[2]')))
					driver.find_element_by_xpath('(//span[@class="glyphsSpriteHeart__outline__24__grey_9 u-__7" or @aria-label="Like"])[2]').click()
				finally:
					driver.find_element_by_xpath('//a[text()="Next"]').click()
				
		except:
			driver.find_element_by_xpath('//a[text()="Next"]').click()
			time.sleep(1)
	except:
		continue