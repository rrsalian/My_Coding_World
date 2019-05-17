import time

from selenium import webdriver

b = webdriver.Firefox(executable_path="E:\SeleniumComponents\geckodriver.exe")
b.maximize_window()
b.get(url="https://www.hotstar.com/sports/cricket/vivo-ipl-2019/royal-challengers-bangalore-vs-chennai-super-kings-m190294/live-streaming/1450000064")

for i in range(1000000):
    b.refresh()
    time.sleep(30)



b.close()
