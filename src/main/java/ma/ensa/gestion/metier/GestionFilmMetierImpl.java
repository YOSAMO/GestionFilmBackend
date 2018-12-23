package ma.ensa.gestion.metier;

import java.util.List;

import ma.ensa.gestion.dao.GestionFilmDao;
import ma.ensa.gestion.entities.Film;

public class GestionFilmMetierImpl  implements GestionFilmMetier{
	
	private GestionFilmDao dao;
	

	public void setDao(GestionFilmDao dao) {
		this.dao = dao;
	}

	@Override
	public Film addFilm(Film film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> getListFilms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film updateFilm(Film film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long deleteFilm(Long id_film) {
		// TODO Auto-generated method stub
		return null;
	}

}
