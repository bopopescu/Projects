from selenium import webdriver
import  time
from selenium.webdriver.common.keys import Keys
driver=webdriver.Chrome()
driver.get("https://prod-keycloak.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F&response_type=code")
driver.maximize_window()
print(driver.title)
driver.find_element_by_id("username").send_keys("maryem.jaballah@gmail.com")
time.sleep(4)
driver.find_element_by_id("password").send_keys("21826041@Aa")
time.sleep(4)
driver.find_element_by_id("kc-login").click()
#driver.quit()