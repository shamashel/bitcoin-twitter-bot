package MichaelGabriel.Bitcoin_Price_Bot;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {		
		boolean cancel = false;
		while(!cancel) {
			GDAX gdax = new GDAX();
			String post = gdax.getPrice();
			if(post != null) {
				System.out.println("Current Bitcoin Price: " + post);
			}
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				cancel = true;
			}
		}
	}

}
