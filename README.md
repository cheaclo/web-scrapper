# Web Scrapping Microservice

Project is microservice, which is part of [Cheaclo](https://github.com/cheaclo/about) project. The application scraps three sites: [CA](https://www.c-and-a.com/eu/en), [HM](https://www2.hm.com/en_gb), [Reserved](https://www.reserved.com/gb/en) and sends information about disocunted products to the database.

## Tech stack

`java 16`

`spring-boot 2.5.2`

`selenium-java 3.141.59`

## Details

### Scrapping

Scrapping of each shop starts on seperate thread to speed up the proccess. [Selenium](https://www.selenium.dev) is used as library, which retrieves discounted products from the web sites. Later products are put into structure of [Product](https://github.com/cheaclo/web-scrapper/blob/main/src/main/java/com/cheacloa/webscrapper/model/Product.java). Until project is developed on local machine, this proccess is started manually by starting the server. Ultimetely, after deployment, scrapping proccess will be automaticaly triggered few times a day.

### Sending products

After successful scrapping products are converted into JSON structures. Converted products are send by post request to [Clothes Database](https://github.com/cheaclo/clothes-database). Web scrapper service receives return message about the success of the shipment from [Clothes Database](https://github.com/cheaclo/clothes-database). Into post request web scrapper service attach also credentials and authentication code, which are used to improvised authentication proccess on the database side.


