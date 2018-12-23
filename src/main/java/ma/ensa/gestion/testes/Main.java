package ma.ensa.gestion.testes;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.ensa.gestion.entities.Film;
import ma.ensa.gestion.metier.GestionFilmMetier;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"appContext.xml"});
		GestionFilmMetier metier=(GestionFilmMetier)context.getBean("metier");
		List<Film> films=metier.getListFilms();
		for (Film film : films) {
			System.out.println(film.getTitre());
		}
	}
}
