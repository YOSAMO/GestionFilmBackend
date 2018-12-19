package ma.ensa.gestion.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Regarder_PK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="id_film")
	private Film film;
	@ManyToOne
	@JoinColumn(name="id_salle")
	private Salle salle;
	public Regarder_PK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Regarder_PK(Film film, Salle salle) {
		super();
		this.film = film;
		this.salle = salle;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	
    
	

}
