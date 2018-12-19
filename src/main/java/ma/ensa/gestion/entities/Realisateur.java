package ma.ensa.gestion.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RLT")
public class Realisateur extends Personne{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String photo;
	public Realisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Realisateur(String nom, String prenom, String tel, String mail) {
		super(nom, prenom, tel, mail);
		// TODO Auto-generated constructor stub
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
}
