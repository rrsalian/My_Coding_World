import time

from selenium import webdriver

import unittest

class LoginTest(unittest.TestCase):

    @classmethod
    def setUp(cls):
        cls.chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver.exe")
        cls.chrome.maximize_window()
        cls.chrome.implicitly_wait(time_to_wait=20)
        cls.chrome.get(url="https://magento.com/")

    #test should be starword in testcase/Bussiness Logic
    def test_login_Operation(self):
        self.chrome.find_element_by_xpath(xpath="//a[text()='My Account']").click()
        self.chrome.find_element_by_xpath(xpath="//input[@id='email']").send_keys("nitinmanjunath1991@gmail.com")

        time.sleep(2)
        self.chrome.find_element_by_xpath(xpath="//input[@id='pass']").send_keys("Welcome123")

        self.chrome.find_element_by_xpath(xpath="//button[@id='send2']").click()

        time.sleep(1)
        self.chrome.find_element_by_xpath(xpath="//a[text()='Log Out']").click()
        time.sleep(1)

    @classmethod
    def tearDown(cls):
        cls.chrome.quit()
        print("test complited")