package Aldo;

public class Livro {

	private int idLivro;
	private String titulo;
	private String isbn;
	private int numeroPaginas;
	private Editora editora;
	private Genero genero;
	
	
	public Livro(int idLivro, String titulo, String isbn, int numeroPaginas, Editora editora, Genero genero) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		this.genero = genero;
	}


	public int getIdLivro() {
		return idLivro;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	public Editora getEditora() {
		return editora;
	}


	public void setEditora(Editora editora) {
		this.editora = editora;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "\nTítulo do livro: " + this.titulo + 
		"\nGênero: " + this.genero.getNomeGenero() +
		"\nRazão Social: " + this.editora.getRazaoSocial() + 
		"\nUF: " + this.editora.getUf();
	
	}
	
}
