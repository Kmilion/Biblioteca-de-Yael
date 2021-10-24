package biblioteca;

public class Main {

	public static void main(String[] args) {

		Libro libro1 = new Libro("J. K. Rowling", 1000, "Harry Potter 1", 1998, Genero.NOVELA);
		Libro libro2 = new Libro("Tolkien", 1300, "El Señor de los Anillos 1", 1989, Genero.FANTASIA);
		Libro libro3 = new Libro("C. S. Lewis", 800, "Las Crónicas de Narnia 1", 1995, Genero.FANTASIA);
		Libro libro4 = new Libro("J. K. Rowling", 678, "Harry Potter 2", 1998, Genero.AUTOAYUDA);
		Libro libro5 = new Libro("Tolkien", 975, "El Señor de los Anillos 2", 1989, Genero.NOVELA);
		Libro libro6 = new Libro("C. S. Lewis", 575, "Las Crónicas de Narnia 2", 1995, Genero.FANTASIA);
		Libro libro7 = new Libro("J. K. Rowling", 1000, "Harry Potter 3", 1998, Genero.AUTOAYUDA);
		Libro libro8 = new Libro("Tolkien", 1300, "El Señor de los Anillos 3", 1989, Genero.MODELAJE);
		Libro libro9 = new Libro("C. S. Lewis", 800, "Las Crónicas de Narnia 3", 1995, Genero.AUTOAYUDA);

		Biblioteca nuevaBiblioteca = new Biblioteca();

		nuevaBiblioteca.agregarLibro(libro1);
		nuevaBiblioteca.agregarLibro(libro2);
		nuevaBiblioteca.agregarLibro(libro3);
		nuevaBiblioteca.agregarLibro(libro4);
		nuevaBiblioteca.agregarLibro(libro5);
		nuevaBiblioteca.agregarLibro(libro6);
		nuevaBiblioteca.agregarLibro(libro7);
		nuevaBiblioteca.agregarLibro(libro8);
		nuevaBiblioteca.agregarLibro(libro9);

		System.out.println(nuevaBiblioteca.cantidadLibrosPorGenero());
	}

}
