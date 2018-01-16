# bitcoin-twitter-bot
Pretty simple bot that takes the price of bitcoin and litecoin from GDAX and posts it on twitter.

## API Integration
GDAX API Integration is done via querying the GDAX API and parsing the resulting JSON file.

Twitter API Integration is done via [Twitter4j](https://github.com/yusuke/twitter4j), a pretty cool unofficial Twitter Library that makes working with the overly complex Twitter API ridiculously easy.

## Implementation
In order to implement this bot for yourself, you'll need to create a Twitter Application and generate the needed API keys.

Once you have the API keys, you'll need to create a file called TwitterCredentials.java

Inside, you should create the following variables:
```
public static String ConsumerKey = "YOUR CONSUMER KEY";
public static String ConsumerSecret = "YOUR CONSUMER SECRET";
public static String AccessToken = "YOUR ACCESS TOKEN";
public static String AccessTokenSecret = "YOUR ACCESS TOKEN SECRET";
```