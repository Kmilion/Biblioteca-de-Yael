package biblioteca;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {

	private ArrayList<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
	}

	public ArrayList<Libro> getLibros() {
		return this.libros;
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void ordenarLibrosPorPaginas() {
		Collections.sort(this.libros, new OrdenadorPorPaginas());
	}

	public void ordenarLibrosPorAutor() {
		Collections.sort(this.libros, new OrdenadorPorAutor());
	}

	public void ordenarLibrosPorTitulo() {
		Collections.sort(this.libros, new OrdenadorPorTitulo());
	}

	public void ordenarLibrosPorTituloNormalizado() {
		Collections.sort(this.libros, new OrdenadorPorTituloNormalizado());
	}

	public void ordenarLibrosPorAnioDePublicacion() {
		Collections.sort(this.libros, new OrdenadorPorAnioDePublicacion());
	}

	public String cantidadLibrosPorGenero() {
		String librosPorGenero = "";
		Genero[] generos = Genero.values();
		int[] cantidadLibrosPorGenero = new int[generos.length];
		for (Libro libro : this.libros) {
			cantidadLibrosPorGenero[libro.getGenero().ordinal()] += 1;
		}
		for (Genero genero : generos) {
			librosPorGenero += genero.name() + " " + cantidadLibrosPorGenero[genero.ordinal()] + "/n";
		}
		return librosPorGenero;
	}

	public boolean libroRepetido(Libro libro) {
		return this.libros.contains(libro);
	}

	@Override
	public Biblioteca clone() throws CloneNotSupportedException {
		Biblioteca biblioteca = (Biblioteca) super.clone();
		for (Libro libro : this.libros) {
			biblioteca.agregarLibro(libro.clone());
		}
		return biblioteca;
	}

}
