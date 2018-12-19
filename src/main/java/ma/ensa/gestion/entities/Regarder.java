package ma.ensa.gestion.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Regarder implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Regarder_PK pk;
	private Date date_film;
	private Date horaire;
	private int prix;
	public Regarder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Regarder(Film film,Salle salle,Date date_film, Date horaire, int prix) {
		super();
		this.pk=new Regarder_PK(film, salle);
		this.date_film = date_film;
		this.horaire = horaire;
		this.prix = prix;
	}
	public Regarder_PK getPk() {
		return pk;
	}
	public void setPk(Film film,Salle salle) {
		this.pk = new Regarder_PK(film, salle);
	}
	public Date getDate_film() {
		return date_film;
	}
	public void setDate_film(Date date_film) {
		this.date_film = date_film;
	}
	public Date getHoraire() {
		return horaire;
	}
	public void setHoraire(Date horaire) {
		this.horaire = horaire;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	

}
