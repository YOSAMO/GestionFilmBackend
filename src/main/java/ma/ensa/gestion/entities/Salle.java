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
public class Salle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_salle;
	private String numero_salle;
	private int nmb_places;
	
	@OneToMany(mappedBy="pk.salle")
	private Set<Regarder> regards=new HashSet<Regarder>();
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(String numero_salle, int nmb_places) {
		super();
		this.numero_salle = numero_salle;
		this.nmb_places = nmb_places;
	}

	public Long getId_salle() {
		return id_salle;
	}

	public String getNumero_salle() {
		return numero_salle;
	}

	public void setNumero_salle(String numero_salle) {
		this.numero_salle = numero_salle;
	}

	public int getNmb_places() {
		return nmb_places;
	}

	public void setNmb_places(int nmb_places) {
		this.nmb_places = nmb_places;
	}

	public Set<Regarder> getRegards() {
		return regards;
	}

	public void setRegards(Set<Regarder> regards) {
		this.regards = regards;
	}

	

}
