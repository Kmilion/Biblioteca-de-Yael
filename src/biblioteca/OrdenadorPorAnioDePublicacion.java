package biblioteca;

import java.util.Comparator;

public class OrdenadorPorAnioDePublicacion implements Comparator<Libro> {

	@Override
	public int compare(Libro libro, Libro otroLibro) {
		return Integer.compare(libro.getAnioDePublicacion(), otroLibro.getAnioDePublicacion());
	}

}
