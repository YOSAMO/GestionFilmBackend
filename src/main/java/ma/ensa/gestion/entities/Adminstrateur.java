package ma.ensa.gestion.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADM")
public class Adminstrateur extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String photo;

	public Adminstrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adminstrateur(String nom, String prenom, String tel, String mail) {
		super(nom, prenom, tel, mail);
		// TODO Auto-generated constructor stub
	}

	public Adminstrateur(String username, String password, String photo) {
		super();
		this.username = username;
		this.password = password;
		this.photo = photo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
