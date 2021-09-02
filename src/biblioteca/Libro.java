package biblioteca;

import java.util.Objects;

public class Libro implements Cloneable, Comparable<Libro> {

	private String autor;
	private String titulo;
	private int cantidadPaginas;
	private int anioPublicacion;
	private Genero genero;

	private static final int LIMITE_TITULO = 200;

	public Libro(String autor, int cantidadPaginas, String titulo, int anioPublicacion, Genero genero) {
		this.autor = autor;
		this.titulo = titulo;
		this.cantidadPaginas = cantidadPaginas;
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
	}

	public String recortarTitulo() {
		if (this.titulo.length() > LIMITE_TITULO) {
			return this.titulo.substring(0, LIMITE_TITULO);
		}
		return this.titulo;
	}

	public String getTituloNormalizado() {
		String[] tituloSeparado = this.titulo.split(" ");
		String articulo = tituloSeparado[0];
		String articuloNormalizado = articulo.toLowerCase();

		if (articuloNormalizado.equals("el") || articuloNormalizado.equals("la") || articuloNormalizado.equals("los")
				|| articuloNormalizado.equals("las")) {
			String tituloSinArticulo = this.titulo.substring(articulo.length());
			String tituloSinArticulosSinEspacioAtrasNiAdelante = tituloSinArticulo.trim();
			return tituloSinArticulosSinEspacioAtrasNiAdelante.concat(", " + articulo);
		}
		return this.titulo;
	}

	public int getPaginas() {
		return this.cantidadPaginas;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getAnioDePublicacion() {
		return this.anioPublicacion;
	}

	public Genero getGenero() {
		return this.genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return this.autor + " (" + this.anioPublicacion + "). " + this.titulo;
	}

	@Override
	public Libro clone() throws CloneNotSupportedException {
		return (Libro) super.clone();
	}

	@Override
	public int compareTo(Libro otroLibro) {
		if (this.titulo.compareTo(otroLibro.titulo) == 0) {
			return this.autor.compareTo(otroLibro.autor);
		}
		return this.titulo.compareTo(otroLibro.titulo);
	}

}
