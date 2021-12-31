import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Test {
	
	public static void main(String[] args) {
		// creation of database
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "C:/Users/PC/eclipse-workspace/Gestion d’une bibliothèque/src/librarydb");
		
		try {
	        //SimpleDateFormat Format= new SimpleDateFormat("MM/DD/YYYY");
			//System.out.println(dateform.format("12/10/1999"));
			
			storeFirstLivre(db);
			retrieveAllLivreQBE(db);
			retrieveLivreByName(db);
			retrieveLivreByDomaine(db);
			
			storeFirstAuteur(db);
			retrieveAllAuteurQBE(db);
			retrieveAuteurByName(db);
			retrieveAuteurByAddresse(db);
			
			storeFirstEditeur(db);
			retrieveAllEditeurQBE(db);
			retrieveEditeurByName(db);
			retrieveEditeurByAddresse(db);
			
			} finally {
				
			db.close();
			
			}
	}
	
	public static void listResult(List<?> result){
		System.out.println(result.size());
		for (Object o : result) {
			System.out.println(o);
		}
	}
	
	
	//Livre
	// storeFirstLivre
	public static void storeFirstLivre(ObjectContainer db) {
		Livre livre1 = new Livre(200, "Web design", 1254, "12/12/1999", "web developement",  "web, design");
		db.store(livre1);
		System.out.println("Stored " + livre1);
	}

	// retrieveAllLivreQBE
	public static void retrieveAllLivreQBE(ObjectContainer db) {
		Livre livre = new Livre(0, null, 0, null, null);
		ObjectSet result = db.queryByExample(livre);
		listResult(result);
	}

	// retrieveLivreByName
	public static void retrieveLivreByName(ObjectContainer db) {
		Livre livre2 = new Livre(0, "Web design", 0, null, null);
		ObjectSet result2 = db.queryByExample(livre2);
		listResult(result2);
	}

	// retrieveAuteurByDomaine
	public static void retrieveLivreByDomaine(ObjectContainer db) {
		Livre livre3 = new Livre(0, null, 0,  "web developement", null);
		ObjectSet result3 = db.queryByExample(livre3);
		listResult(result3);
	}
	
	//Auteur
	// storeFirstAuteur
				public static void storeFirstAuteur(ObjectContainer db) {
					Auteur auteur1 = new Auteur(111, "Mohamed", "salah", "12/12/1985", "Alger", "Blida");
					db.store(auteur1);
					System.out.println("Stored " + auteur1.toString());
				}
	
	// retrieveAllAuteurQBE
	public static void retrieveAllAuteurQBE(ObjectContainer db) {
					Auteur auteur = new Auteur(0, null, null, null, null);
					ObjectSet result = db.queryByExample(auteur);
					listResult(result);
	}
	
	// retrieveAuteurByName
	public static void retrieveAuteurByName(ObjectContainer db) {
					Auteur auteur2 = new Auteur(0, "Mohamed", null, null, null);
					ObjectSet result2 = db.queryByExample(auteur2);
					listResult(result2);
	}
	
	// retrieveAuteurByAddresse
	public static void retrieveAuteurByAddresse(ObjectContainer db) {
					Auteur auteur3 = new Auteur(0, null, null, null, "blida");
					ObjectSet result3 = db.queryByExample(auteur3);
					listResult(result3);
	}

	//Editeur
	// storeFirstEditeur
	public static void storeFirstEditeur(ObjectContainer db) {
		Editeur editeur1 = new Editeur(111, "Al_qalam", "Alger");
		db.store(editeur1);
		System.out.println("Stored " + editeur1);
	}

	// retrieveAllEditeurQBE
	public static void retrieveAllEditeurQBE(ObjectContainer db) {
		Editeur editeur = new Editeur(0, null, null);
		ObjectSet result = db.queryByExample(editeur);
		listResult(result);
	}

	// retrieveEditeurByName
	public static void retrieveEditeurByName(ObjectContainer db) {
		Editeur editeur2 = new Editeur(0, "Al_qalam", null);
		ObjectSet result2 = db.queryByExample(editeur2);
		listResult(result2);
	}

	// retrieveEditeurByAddresse
	public static void retrieveEditeurByAddresse(ObjectContainer db) {
		Editeur editeur3 = new Editeur(0, null, "Alger");
		ObjectSet result3 = db.queryByExample(editeur3);
		listResult(result3);
	}

}
