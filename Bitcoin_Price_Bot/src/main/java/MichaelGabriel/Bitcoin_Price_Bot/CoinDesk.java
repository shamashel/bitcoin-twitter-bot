package MichaelGabriel.Bitcoin_Price_Bot;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

public class CoinDesk {
	public String getPrice(){
		try {
			URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
			URLConnection urlConnection = url.openConnection();
			urlConnection.setRequestProperty("User-Agent",
	                "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
			urlConnection.connect();
			InputStream stream = urlConnection.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			StringBuilder result = new StringBuilder();
			String line;
			while((line = reader.readLine()) != null) {
				result.append(line);
			}
			
			JSONObject jsonObject = new JSONObject(result.toString());
			JSONObject general = jsonObject.getJSONObject("bpi").getJSONObject("USD");
			return "$" + general.getString("rate");
		}
		catch (Exception e) {
			return null;
		}
		
	}
	
	public void writePost() {
		
	}
}
