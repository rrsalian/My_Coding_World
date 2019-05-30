import requests
from bs4 import BeautifulSoup

class MovieDetails:

    def __init__(self, name, value, imdbRating, url):
        self.name = name
        self.value = value
        self.imdbRating = imdbRating
        self.url = url

baseUrl = 'http://www.imdb.com'

def getRows():
    headers = {
        'Accept-Language': 'en',
        'headers': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36'
    }
    res = requests.get(baseUrl+'/chart/top', headers=headers)
    soup = BeautifulSoup(res.text, 'html.parser')

    table = soup.findAll('table')[0]
    rows = table.find('tbody').findAll('tr')

    return rows

def getList(rows):
    list = []
    for row in rows:
        rating = float(row.find('span', {'name': 'ir'})['data-value'])
        votes = int(row.find('span', {'name': 'nv'})['data-value'])
        value = (rating * votes)

        a = row.find('td', {'class': 'titleColumn'}).find('a')
        name = a.text
        url = baseUrl+a['href']
        list.append(MovieDetails(name, value, rating, url))

    return list

if __name__ == '__main__':
    rows = getRows()
    list = getList(rows)
    list.sort(key=lambda x: x.value, reverse=True)
    for l in list:
        print(l.name+', '+str(round(l.imdbRating, 1))+', '+l.url)