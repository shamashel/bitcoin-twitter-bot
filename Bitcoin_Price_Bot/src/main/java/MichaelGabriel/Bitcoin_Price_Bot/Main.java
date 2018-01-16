package MichaelGabriel.Bitcoin_Price_Bot;

public class Main {

	public static void main(String[] args) {		
		boolean cancel = false;
		while(!cancel) {
			GDAX gdax = new GDAX();
			String post = gdax.getPrice();
			try {
				if(post != null) {
					String message = ("Current Bitcoin Price on GDAX: " + post);
					MyTwitter myTwitter = new MyTwitter();
					myTwitter.login();
					myTwitter.tweet(message);
				}
				Thread.sleep(900000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				cancel = true;
			}
		}
	}

}
