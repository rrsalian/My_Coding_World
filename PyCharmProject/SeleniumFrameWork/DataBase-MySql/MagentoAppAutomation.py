import time

import mysql.connector
from selenium import webdriver

try:
    print("connection to database")
    connection=mysql.connector.connect(host='localhost',database='magentoapp',user='root',password='root')
    print("Connected to Database")

    cursor=connection.cursor()

    sql_select_query=""" select * from magento_info where user='nitinmanjunath1991@gmail.com' """

    cursor.execute(sql_select_query)

    result_data=cursor.fetchone()
    print(result_data)

    chrome = webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver.exe")
    chrome.maximize_window()
    chrome.implicitly_wait(time_to_wait=20)

    chrome.get(url=result_data[0])

    chrome.find_element_by_xpath(xpath="//a[text()='My Account']").click()
    chrome.find_element_by_xpath(xpath="//input[@id='email']").send_keys(result_data[1])

    time.sleep(2)
    chrome.find_element_by_xpath(xpath="//input[@id='pass']").send_keys(result_data[2])

    chrome.find_element_by_xpath(xpath="//button[@id='send2']").click()

    time.sleep(1)
    chrome.find_element_by_xpath(xpath="//a[text()='Log Out']").click()
    time.sleep(1)
    chrome.quit()



except Exception as e:
    print("Exception occured",e)


finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("connection is closed")
