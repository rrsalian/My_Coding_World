from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time
import sys


# def print_same_line(text):
#     sys.stdout.write('\r')
#     sys.stdout.flush()
#     sys.stdout.write(text)
#     sys.stdout.flush()


class InstagramBot:

    def __init__(self, username, password):
        self.username = username
        self.password = password
        print('hi')
        self.driver = webdriver.Chrome(executable_path="D:\chromedriver.exe")
        self.driver.maximize_window()
        print('hello')
        self.driver.implicitly_wait(time_to_wait=20)

    # def closeBrowser(self):
    #     self.driver.close()
    #
    def login(self):
        driver = self.driver
        driver.get("https://www.instagram.com/")
        #time.sleep(2)
        login_button = driver.find_element_by_xpath("//a[@href='/accounts/login/?source=auth_switcher']")
        login_button.click()
        time.sleep(2)
        user_name_elem = driver.find_element_by_xpath("//input[@name='username']")
        user_name_elem.clear()
        user_name_elem.send_keys(self.username)
        passworword_elem = driver.find_element_by_xpath("//input[@name='password']")
        passworword_elem.clear()
        passworword_elem.send_keys(self.password)
        passworword_elem.send_keys(Keys.RETURN)
        #time.sleep(2)


    def like_photo(self):
        driver = self.driver
        driver.find_element_by_xpath("//button[text()='Not Now']").click()


        for i in range(1):
            try:
                #driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")

                l=driver.find_elements_by_xpath('//span[@aria-label="Like"]')
                print(l[1].click())
                print(len(l))


                # like_button = lambda: driver.find_element_by_xpath('//span[@aria-label="Like"]').click()
                # like_button().click()
                # a=driver.find_elements_by_xpath('//span[@aria-label="Like"]')
                #
                # for i in range(1,len(a)) :
                #     b=driver.find_elements_by_xpath(('//span[@aria-label="Like"]')[i])
                #     print(b)
                #     time.sleep(10)
                #     b.click()
                #     time.sleep(5)
                # like_button = lambda: driver.find_element_by_xpath(' ').click()
                # like_button().click()


            except Exception:
                continue

if __name__ == "__main__":

    username = "rr_salian"
    password = "16041996@VCET"

    ig = InstagramBot(username, password)
    ig.login()

    ig.like_photo()
    # while True:
    #     try:
    #         ig.like_photo()
    #     except Exception:
    #         ig.closeBrowser()
    #         time.sleep(60)
    #         ig = InstagramBot(username, password)
    #         ig.login()