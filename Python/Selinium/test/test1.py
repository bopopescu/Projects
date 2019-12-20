from selenium import webdriver
import unittest
from selenium.webdriver.common.keys import Keys
import time
import HtmlTestRunner
class Demp(unittest.TestCase):
    @classmethod
    def setUpClass(cls) -> None:
        cls.driver=webdriver.Chrome()
        cls.driver.get("https://www.google.com")
        cls.driver.maximize_window()
        print(cls.driver.title)
        print(cls.driver.current_url)
#driver.get("https://www.python.org")
    def testdemo(self):
        self.driver.find_element_by_name("q").send_keys("Automation Step by Step")
        self.driver.find_element_by_name("q").send_keys(Keys.ENTER)
        time.sleep(4)
        self.driver.find_element_by_class_name("LC20lb").click()

    @classmethod
    def tearDownClass(cls) -> None:
        print("test completed")


#driver.quit()
if __name__ == '__main__':
    unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(output="C:/Users/DELL/PycharmProjects/selinium/rapport"))

