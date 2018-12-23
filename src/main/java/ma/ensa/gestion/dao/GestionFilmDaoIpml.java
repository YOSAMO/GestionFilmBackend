package ma.ensa.gestion.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.ensa.gestion.entities.Film;

public class GestionFilmDaoIpml implements GestionFilmDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Film addFilm(Film film) {
		em.persist(film);
		return film;
	}

	@Override
	public List<Film> getListFilms() {
		Query query=em.createQuery("SELECT f FROM Film f");
		return query.getResultList();
	}

	@Override
	public Film updateFilm(Film film) {
		
		return em.merge(film);
	}

	@Override
	public Long deleteFilm(Long id_film) {
		Film film=em.find(Film.class, id_film);
		 em.remove(film);
		 return id_film;
	}

}
