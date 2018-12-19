package ma.ensa.gestion.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Film  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_film;
	private String titre;
	private String description;
	private String genre;
	private String affiche;
	
	@OneToMany(mappedBy="pk.film")
	private Set<Regarder> regards=new HashSet<Regarder>();

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(String titre, String description, String genre, String affiche) {
		super();
		this.titre = titre;
		this.description = description;
		this.genre = genre;
		this.affiche = affiche;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAffiche() {
		return affiche;
	}

	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}

	public Long getId_film() {
		return id_film;
	}

	public Set<Regarder> getRegards() {
		return regards;
	}

	public void setRegards(Set<Regarder> regards) {
		this.regards = regards;
	}

	

}
