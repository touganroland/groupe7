package testJsoup;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestConnexionJsoup {
	Document doc = null;
	String url = null;

	@DisplayName("Connexion")
	@Tag("Connexion")
	@Test
	void connexion() {
		System.out.println(">>Connecter vous � http://en.wikipedia.org...");

		try {
	            @SuppressWarnings("unused")
				Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Comparison_of_Canon_EOS_digital_cameras").get();

	        } catch (IOException ex) {
	        	System.out.println("Erreur de connexion, vous vous �tes sans doute tromp� dans la saisie de l'url");
	        	
	        }
	        System.out.println(">> Connexion �tablie, vous avez acc�s au dom ...");
	     
	}

	
	
	@DisplayName("ConnexionBenchTest")
	@Tag("ConnexionBenchTest")
	@Test
	Document connexion(String url) {
		System.out.println(">>Connecter vous � http://en.wikipedia.org...");
	   
	        try {
	            @SuppressWarnings("unused")
				Document doc = Jsoup.connect(url).get();
	        
	        } catch (IOException ex) {
	        	System.out.println("Erreur de connexion, vous vous �tes sans doute tromp� dans la saisie de l'url");
	        	
	        }
	        System.out.println(">> Connexion �tablie, vous avez acc�s au dom ...");
	        return doc;
	}
	
}
