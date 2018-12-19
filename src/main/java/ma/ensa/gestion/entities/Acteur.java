package ma.ensa.gestion.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ACT")
public class Acteur  extends Personne{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String photo;

	public Acteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Acteur(String nom, String prenom, String tel, String mail) {
		super(nom, prenom, tel, mail);
		// TODO Auto-generated constructor stub
	}

	public Acteur(String photo) {
		super();
		this.photo = photo;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	

}
