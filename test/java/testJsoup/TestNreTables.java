package testJsoup;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class TestNreTables {

	@Test
	void nbreTables() {
		

		String url = "https://en.wikipedia.org/wiki/Comparison_of_Canon_EOS_digital_cameras";
		Document doc = null;

	    Elements tables = null;
		
		

	    try {
			
	           doc = Jsoup.connect(url).get();
	           
	           assertNotNull(url);
	           
	           
	       } catch (IOException e) {
	            
	    	 //  loggerExtraction.error("Erreur de connexion, vous vous �tes sans doute tromp� dans la saisie de l'url");
	           e.printStackTrace();
	       }
		
		tables = doc.select("table"); 
		
		if (tables.size() == 0) {
			System.out.println(" Attention !!! La page � l'�tude n'a pas de tableau ...");
		}
		System.out.println("le nombre de tableau de la page � l'�tude est : "+ (tables.size()-1));
		
		
	}
	
	
	
	
	@Test
	int nbreTables(Document document) {
		

		
		
	    Elements tables = null;
		
		tables = document.select("table"); 
		
		if (tables.size() == 0) {
			System.out.println(" Attention !!! La page � l'�tude n'a pas de tableau ...");
		}
		System.out.println("le nombre de tableau de la page � l'�tude est : "+ tables.size());
		return tables.size();
		
		
	}
	
	
	
	
	
	
	

}
