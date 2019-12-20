from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
driver = webdriver.Chrome()
driver.get("http://10.3.141.1:1880/ui" )
main_page = driver.current_window_handle
time.sleep(5)

#print(driver.title)
#time.sleep(4)
#driver.find_element_by_id("node-dialog-login-username").send_keys("admin")
#time.sleep(4)
#driver.find_element_by_id("node-dialog-login-password").send_keys("123456")
#time.sleep(4)
#driver.find_element_by_id("node-dialog-login-submit").click()
#driver.quit()