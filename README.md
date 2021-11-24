# The Cat in the Hat

![can in the hat
](https://s1.piq.land/2016/03/08/j5dS33FDOWBd1Xor61JwCaL7_400x400.png)

> the sun did not shine.  
> it was too wet to play.  
> so we sat in the house.   
> all that cold, cold, wet day.  

[The cat in the hat, Dr. Seuss.](http://paulandlizdavies.com/poems/cat.htm)

### The goal of this project is to build a simple and lightweight weather mobile application that provides the weather for all the capital cities of the world.

To build this app you will have to use [Tomorrow.io](https://tomorrow.io) [Api](https://developer.tomorrow.io/docs)
Explore the api to understand which service suits you best.

Use https://restcountries.com/ to get the needed data about all the capitals.

#### Required solution:
* Create a mobile app that uses [Tomorrow,io Api](https://developer.tomorrow.io/docs) to get the weather data needed for a weather app

#### UI:
* Home Screen - Table with search-bar containing all the capitals. Each cell should contain the following :
  * Name of the city and the country
  * Picture of the flag of the country
* City details screen - Small map showing where this city is & TableView with the weather for the next 5 days. Each cell should contain : 
  * Day
  * Max and Min temperature
  * Precipitation

#### Bonus points:
##### Small bonus
* Caching - cache locally (use db or in memory) the responses from the api and use them when navigating between screens
* Fahrenheit <-> Celsius - Add a button (right nav bar button) to toggle between the different metrics

##### Big bonus
* MapView - In the main screen add a button switch to a map view. show a pin of every capital with the name. enable selection of capital and navigation to details screen. 
* In the city forecast screen : add a scrollable graph displaying minute by minute temperature for the next 6 hours. (Applicable only for cities in the US)


#### Guidelines:
* Pay attention to SW design and clean code (We are believers of the [SOLID](https://en.wikipedia.org/wiki/SOLID) SW design principals).
* You are free to use any tool / library of your desire.
* We encourage using swift or kotlin

#### Before you start:
* Create an `apikey` using [Tomorrow.io](https://app.tomorrow.io/signup?planid=60d46beae90c3b3549a59ff3)


Don't hesitate to contact with any question.
#### Good Luck!!!
