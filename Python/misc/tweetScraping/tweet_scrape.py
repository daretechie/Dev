import pandas
import twint

all_cities = ["Lagos", "Oyo", "Osun", "Ondo", "Ekiti", "Ogun"]

def scrape_by_city(keywords, since, outfile, resume):
    unique_cities = set(all_cities)
    cities = sorted(unique_cities)
    for city in cities:
        print(city)
        c = twint.Config()
        c.Search = keywords
        c.Since = since
        c.until = '2020-10-31'
        c.Store_csv = True
        c.Output = "./" + outfile
        c.Near = city
        c.Hide_output = True
        c.Count = True
        c.Stats = True
        c.Resume = 'resume.txt'
        twint.run.Search(c)

scrape_by_city(' ', '2020-10-19 00:00:00', 'nigeria_SWtweet.csv', 'resume.txt')