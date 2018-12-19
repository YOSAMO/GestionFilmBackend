package ma.ensa.gestion.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CLT")
public class Client extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long compte_bancaire;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, String tel, String mail) {
		super(nom, prenom, tel, mail);
		// TODO Auto-generated constructor stub
	}

	public Client(Long compte_bancaire) {
		super();
		this.compte_bancaire = compte_bancaire;
	}

	public Long getCompte_bancaire() {
		return compte_bancaire;
	}

	public void setCompte_bancaire(Long compte_bancaire) {
		this.compte_bancaire = compte_bancaire;
	}
	
	

}
