from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys


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
user_name_elem.send_keys("rr_salian")
passworword_elem = driver.find_element_by_xpath("//input[@name='password']")
passworword_elem.clear()
passworword_elem.send_keys("16041996@VCET")
passworword_elem.send_keys(Keys.RETURN)

driver.find_element_by_xpath("//button[text()='Not Now']").click()

# Like all the images that are loaded on login
while True:
	#driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")
	body = driver.find_element_by_css_selector('body')
	body.send_keys(Keys.PAGE_DOWN)
	#time.sleep(3)
	try:
		for like_link in driver.find_elements_by_xpath('//span[@class="glyphsSpriteHeart__outline__24__grey_9 u-__7" and @aria-label="Like"]'):
			#time.sleep(2)
			like_link.click()
			
			#actions = ActionChains(driver)
			#actions.move_to_element(like_link).click().perform()
			
	except:
		body = driver.find_element_by_css_selector('body')
		body.send_keys(Keys.PAGE_DOWN)
		continue
		

# Close the tab/browser when done
driver.close()