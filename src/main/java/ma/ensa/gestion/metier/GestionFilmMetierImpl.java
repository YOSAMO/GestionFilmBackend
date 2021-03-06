package ma.ensa.gestion.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import ma.ensa.gestion.dao.GestionFilmDao;
import ma.ensa.gestion.entities.Film;
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class GestionFilmMetierImpl  implements GestionFilmMetier{
	
	private GestionFilmDao dao;
	

	public void setDao(GestionFilmDao dao) {
		this.dao = dao;
	}

	@Override
	public Film addFilm(Film film) {
		 return dao.addFilm(film);
		
	}

	@Override
	public List<Film> getListFilms() {
		return dao.getListFilms();
	}

	@Override
	public Film updateFilm(Film film) {
		// TODO Auto-generated method stub
		return dao.updateFilm(film);
	}

	@Override
	public Long deleteFilm(Long id_film) {
		// TODO Auto-generated method stub
		return dao.deleteFilm(id_film);
	}

}
