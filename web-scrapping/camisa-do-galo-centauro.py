from selenium import webdriver
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.common.keys import Keys
import time 

options = Options()
options.headless = True
firefox = webdriver.Firefox(options=options)

firefox.get('https://www.centauro.com.br/slogin')

username_field = firefox.find_element_by_id('username')
username_field.send_keys('gustavoo_barros@hotmail.com')

password_field = firefox.find_element_by_id('password')
password_field.send_keys('galodoido105')

enter = firefox.find_element_by_xpath('//*[@id="root"]/div/div[3]/section[1]/div/section[2]/div/form/button[1]')
enter.click()

time.sleep(10)
firefox.get('https://www.centauro.com.br/checkouts/carrinho')
time.sleep(10)
warning = 'esgotar'
check_warning = firefox.find_elements_by_xpath("//*[contains(text(),'" + warning + "')]")

if len(check_warning) > 0:
    print('Esgotado')
else:
    print('Disponível!!!')

firefox.quit()
