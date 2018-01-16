package MichaelGabriel.Bitcoin_Price_Bot;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class MyTwitter {
	Twitter twitter;
	
	public void login() {
		ConfigurationBuilder conf = new ConfigurationBuilder();
		conf.setDebugEnabled(true)
		.setOAuthConsumerKey(TwitterCredentials.ConsumerKey)
		.setOAuthConsumerSecret(TwitterCredentials.ConsumerSecret)
		.setOAuthAccessToken(TwitterCredentials.AccessToken)
		.setOAuthAccessTokenSecret(TwitterCredentials.AccessTokenSecret);
		
		twitter = (new TwitterFactory(conf.build())).getInstance();
	}
	
	public void tweet(String message) throws TwitterException{
		Status status = twitter.updateStatus(message);
		System.out.println("Updated status with message: " + status.getText());
	}
}
