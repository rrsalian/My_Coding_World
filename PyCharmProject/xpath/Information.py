from selenium import webdriver

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://magento.com/solutions")

my_acount=chrome.find_element_by_xpath("//a[text()='My Account']")
attribute_value=my_acount.get_attribute("href")
print("attribute value: ",attribute_value)

text=my_acount.text
print("text: ",text)

tag_name=my_acount.tag_name
print("tag Name: ",tag_name)

chrome.close()