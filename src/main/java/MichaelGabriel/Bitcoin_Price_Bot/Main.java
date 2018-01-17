package MichaelGabriel.Bitcoin_Price_Bot;

import java.util.Random;

public class Main {

	public static void main(String[] args) {		
		boolean cancel = false;
		while(!cancel) {
			GDAX gdax = new GDAX();
			Binance binance = new Binance();
			String gbtc = gdax.getBTCPrice();
			String gltc = gdax.getLTCPrice();
			String bbtc = binance.getCoinPrice("BTC");
			String bltc = binance.getCoinPrice("LTC");
			try {
				if(gbtc != null && gltc != null && bbtc != null && bltc != null) {
					String message = ("Current #BTC Price:" + "\nGDAX : " + gbtc + " | Binance : " + bbtc + "\n\nCurrent #LTC Price: " + "\nGDAX : " + gltc+ " | Binance : " + bltc + "\n#Bitcoin #Litecoin");
					MyTwitter myTwitter = new MyTwitter();
					myTwitter.login();
					myTwitter.tweet(message);
				}
				
				Thread.sleep(600000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				cancel = true;
			}
		}
	}

}
