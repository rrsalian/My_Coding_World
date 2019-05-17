import time
import unittest

from selenium import webdriver

from PageObjectModelFrameWork.Pages.LogoutPage import LogoutPage
from PageObjectModelFrameWork.Pages.HomePage import HomePage
from PageObjectModelFrameWork.Pages.LoginPage import LoginPage


class MagentoTest(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        cls.chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver.exe")
        cls.chrome.maximize_window()
        cls.chrome.implicitly_wait(time_to_wait=20)
        cls.chrome.get(url="https://www.magento.com")



    @classmethod
    def tearDownClass(cls):
        cls.chrome.quit()
        print("Test completed")

    def test_login_validation(self):


      home_page=  HomePage(self.chrome)
      home_page.click_myacc_link()

      login_page= LoginPage(self.chrome)
      login_page.type_email_text_box("nitinmanjunath1991@gmail.com")
      login_page.type_psw_text_box("Welcome123")
      login_page.click_login_button()

      logout_page= LogoutPage(self.chrome)
      logout_page.click_logout_link()

      time.sleep(2)
