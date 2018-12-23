package ma.ensa.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.gestion.entities.Film;
import ma.ensa.gestion.metier.GestionFilmMetier;

@RestController
@RequestMapping("/yosamo/")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class FilmController {
	
	@Autowired
	private GestionFilmMetier metier;
	
    @RequestMapping(value="/film",method=RequestMethod.POST)
	public Film addFilm(@RequestBody Film film) {
		return metier.addFilm(film);
	}
    
    @RequestMapping(value="/film",method=RequestMethod.GET)
	public List<Film> getListFilms() {
		return metier.getListFilms();
	}
    @RequestMapping(value="/film",method=RequestMethod.PUT)
	public Film updateFilm(@RequestBody Film film) {
		return metier.updateFilm(film);
	}
    @RequestMapping(value="/film/{id}",method=RequestMethod.DELETE)
	public Long deleteFilm(@PathVariable("id") Long id) {
		return metier.deleteFilm(id);
	}
	
	

}
