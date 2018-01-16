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
		.setOAuthConsumerKey("sh0BWBjBbbzdD6gargqzclW10")
		.setOAuthConsumerSecret("AgbIgeYybHTDeVsgKTdbFAaDngGFaaO5APqUzQOZIVPVigbu4S")
		.setOAuthAccessToken("953347630226198528-I3Jey0khu4bal1GCHkaPUtZfcIZ9Tg5")
		.setOAuthAccessTokenSecret("rI0IlJSGg8KtCTu7XiElhFLR5JV2aMr2IXhrZ7lCZ0Noo");
		
		twitter = (new TwitterFactory(conf.build())).getInstance();
	}
	
	public void tweet(String message) throws TwitterException{
		Status status = twitter.updateStatus(message);
		System.out.println("Updated status with message: " + status.getText());
	}
}
