from selenium import webdriver
import  time
from selenium.webdriver.common.keys import Keys
driver=webdriver.Chrome()
driver.get("https://www.st.com/content/st_com/en/products/development-tools/software-development-tools/stm32-software-development-tools/stm32-configurators-and-code-generators/stm32cubemx.html")
driver.maximize_window()
driver.find_element_by_class_name("optanon-allow-all accept-cookies-button").click()
time.sleep()
print(driver.title)
driver.find_element_by_class_name("msw-selectversionbutton-content collapseoptions").click()
time.sleep()
driver.find_element_by_class_name("fa fa-download").click()
time.sleep()
driver.find_element_by_class_name("generic-button lightblue right accept-license").click()
time.sleep()
