package Aldo;

public class Biblioteca {
	
	public static void main(String [] args) {
		
		Editora editora = new Editora(18, "LivrosMais", "6127", "RJ", "RJ");
		Editora editora2 = new Editora(13, "Estante Virtual", "5657", "PE", "PE");
		
		Genero genero = new Genero(20, "Romance");
		Genero genero2 = new Genero(7, "Ficção Científica");
		Genero genero3 = new Genero(1, "Conto de fadas");
		
		Livro filoteia = new Livro(45, "Todas as suas (im)perfeições", "ssso-134", 304, editora, genero);
		
		Livro mundoDeSofia = new Livro(453, "Branca de Neve", "sssf-123", 250, editora2, genero3);
		
		Livro livro3 = new Livro(545, "Duna", "sssa-564", 300, editora2, genero2);
		
		Livro livro4 = new Livro(678, "O Predador", "sssr-654", 450, editora, genero2);
		
		Livro livro5 = new Livro(546, "A Bela e a Fera", "sssg-346", 250, editora, genero3);
		
		
		
		
		
	}

	
}
