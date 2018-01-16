package MichaelGabriel.Bitcoin_Price_Bot;

public class Main {

	public static void main(String[] args) {		
		boolean cancel = false;
		while(!cancel) {
			GDAX gdax = new GDAX();
			String btc = gdax.getBTCPrice();
			String ltc = gdax.getLTCPrice();
			try {
				if(btc != null && ltc != null) {
					String message = ("Current #BTC Price on GDAX: " + btc + "\nCurrent #LTC Price on GDAX: " + ltc + "\n#Crypto #GDAX");
					MyTwitter myTwitter = new MyTwitter();
					myTwitter.login();
					myTwitter.tweet(message);
				}
				Thread.sleep(300000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				cancel = true;
			}
		}
	}

}
