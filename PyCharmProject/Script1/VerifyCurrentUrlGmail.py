from selenium import webdriver

e_curUrl="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()
chrome.get(url="https://www.gmail.com")
a_curUrl=chrome.current_url
print("The expected URL :",e_curUrl)
print("The Actual URL :",a_curUrl)
if a_curUrl==e_curUrl:
    print("Gmail Application Logged in succefully")
else:
    print("Gmail Application Failed to Login")

chrome.close()


