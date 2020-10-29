from selenium import webdriver
from selenium.webdriver.firefox.options import Options

options = Options()
options.headless = True
firefox = webdriver.Firefox(options=options)

firefox.get('https://lojadogalo.atletico.com.br/produto/camisa-oficial-jogo-i-com-patrocinio-le-coq-cam-2020-21-1828')

product = firefox.find_element_by_id('paginas_nomeproduto').text
price = firefox.find_element_by_id('paginas_precoatual').text
firefox.quit()

print('\033[32m{} R${}'.format(product,price))