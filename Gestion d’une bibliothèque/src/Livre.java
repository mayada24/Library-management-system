import java.util.Date;

import javax.xml.soap.Text;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.*;

public class Livre {
	private int id_livre;
	private String titre;
	private int num_isbn;
	private Auteur auteur;
	private Editeur editeur;
	private String annee_edition;
	//private Date annee_edition;
	private String domaine;
	private String MotsCles;
	
	//first constractor
	public Livre(int id_livre, String titre, int num_isbn, String annee_edition, String domaine, String MotsCles) {
		// TODO Auto-generated constructor stub
		
		this.id_livre=id_livre;
		this.titre=titre;
		this.num_isbn=num_isbn;
		this.auteur=null;
		this.editeur=null;
		Date date = null;
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    try {
			date = simpleDateFormat.parse(annee_edition);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.annee_edition=date.toString();
		this.domaine=domaine;
		this.MotsCles=MotsCles;
	}
	
	//second constractor
	public Livre(int id_livre, String titre, int num_isbn, String domaine, String MotsCles) {
		// TODO Auto-generated constructor stub
		
		this.id_livre=id_livre;
		this.titre=titre;
		this.num_isbn=num_isbn;
		this.auteur=null;
		this.editeur=null;
		this.domaine=domaine;
		this.MotsCles=MotsCles;
	}
	
	public int getId_livre() {
		return id_livre;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public int getNum_isbn() {
		return num_isbn;
	}
	
	public Auteur getAuteur() {
		return auteur;
	}
	
	public Editeur getEditeur() {
		return editeur;
	}
	
	public String getAnnee_edition() {
		return annee_edition;
	}
	
	public String getDomaine() {
		return domaine;
	}
	
	public String getMotsCles() {
		return MotsCles;
	}
	
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void setNum_isbn(int num_isbn) {
		this.num_isbn = num_isbn;
	}
	
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	
	public void setAnnee_edition(String annee_edition) {
		this.annee_edition = annee_edition;
	}
	
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	
	public void setMotsCles(String motsCles) {
		MotsCles = motsCles;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id_livre+"/"+titre+"/"+num_isbn+"/"+auteur+"/"+editeur+"/"+annee_edition+"/"+domaine+"/"+MotsCles;
	}
}


