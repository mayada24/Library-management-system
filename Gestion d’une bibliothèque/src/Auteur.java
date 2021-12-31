import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//import java.util.Date;

public class Auteur {
	private int id_auteur;
	private String nom_auteur;
	private String prenom_auteur;
	private String dateNaissance_auteur;
	private String lieuNaissance_auteur;
	private String adresse_auteur;
	
	//first constractor
	public Auteur(int id_auteur, String nom_auteur, String prenom_auteur, String dateNaissance_auteur, String lieuNaissance_auteur, String adresse_auteur) {
		// TODO Auto-generated constructor stub
		this.id_auteur=id_auteur;
		this.nom_auteur=nom_auteur;
		this.prenom_auteur=prenom_auteur;
		Date date = null;
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    try {
			date = simpleDateFormat.parse(dateNaissance_auteur);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dateNaissance_auteur=date.toString();
		this.lieuNaissance_auteur=lieuNaissance_auteur;
		this.adresse_auteur=adresse_auteur;
	}
	
	//second constractor
		public Auteur(int id_auteur, String nom_auteur, String prenom_auteur, String lieuNaissance_auteur, String adresse_auteur) {
			// TODO Auto-generated constructor stub
			this.id_auteur=id_auteur;
			this.nom_auteur=nom_auteur;
			this.prenom_auteur=prenom_auteur;
			this.lieuNaissance_auteur=lieuNaissance_auteur;
			this.adresse_auteur=adresse_auteur;
		}
	
	public int getId_auteur() {
		return id_auteur;
	}
	
	public String getNom_auteur() {
		return nom_auteur;
	}
	
	public String getPrenom_auteur() {
		return prenom_auteur;
	}
	
	public String getDateNaissance_auteur() {
		return dateNaissance_auteur;
	}
	
	public String getLieuNaissance_auteur() {
		return lieuNaissance_auteur;
	}
	
	public String getAdresse_auteur() {
		return adresse_auteur;
	}
	
	public void setId_auteur(int id_auteur) {
		this.id_auteur = id_auteur;
	}
	
	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}
	
	public void setPrenom_auteur(String prenom_auteur) {
		this.prenom_auteur = prenom_auteur;
	}
	
	public void setDateNaissance_auteur(String dateNaissance_auteur) {
		this.dateNaissance_auteur = dateNaissance_auteur;
	}
	
	public void setLieuNaissance_auteur(String lieuNaissance_auteur) {
		this.lieuNaissance_auteur = lieuNaissance_auteur;
	}
	
	public void setAdresse_auteur(String adresse_auteur) {
		this.adresse_auteur = adresse_auteur;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id_auteur+"/"+nom_auteur+"/"+prenom_auteur+"/"+dateNaissance_auteur+"/"+lieuNaissance_auteur+"/"+adresse_auteur;
	}
}
