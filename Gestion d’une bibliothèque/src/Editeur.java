

public class Editeur {
	private int id_editeur;
	private String maisonEdition;
	private String adresseEdition;
	
	public Editeur(int id_editeur, String maisonEdition, String adresseEdition) {
		// TODO Auto-generated constructor stub
		this.id_editeur=id_editeur;
		this.maisonEdition=maisonEdition;
		this.adresseEdition=adresseEdition;
	}
	
	public int getId_editeur() {
		return id_editeur;
	}
	
	public String getMaisonEdition() {
		return maisonEdition;
	}
	
	public String getAdresseEdition() {
		return adresseEdition;
	}
	
	public void setId_editeur(int id_editeur) {
		this.id_editeur = id_editeur;
	}
	
	public void setMaisonEdition(String maisonEdition) {
		this.maisonEdition = maisonEdition;
	}
	
	public void setAdresseEdition(String adresseEdition) {
		this.adresseEdition = adresseEdition;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id_editeur+"/"+maisonEdition+"/"+adresseEdition;
	}

}
