package ma.ensa.gestion.dao;

import java.util.List;

import ma.ensa.gestion.entities.Film;

public interface GestionFilmDao {
	public Film addFilm(Film film);

	public List<Film> getListFilms();

	public Film updateFilm(Film film);

	public Long deleteFilm(Long id_film);
}
