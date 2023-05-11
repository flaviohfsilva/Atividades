package Aldo;

import java.util.Date;
public class AppBancaRevistas {
	
	static Revista revista = new Revista(18, "FH18");

	public static void main(String[] args) {
		
		
		
		
		revista.adicionarEdicao(52, 1000, 800);
		revista.adicionarEdicao(53, 900, 900);
		revista.adicionarEdicao(54, 1200, 1000);
		
		mostrarEdicoes();
		
		
		System.out.println(revista.reciclarEdicao(52));
		mostrarEdicao(52);
		
		System.out.println(revista.reciclarEdicao(53));
		mostrarEdicao(53);
		
		System.out.println(revista.reciclarEdicao(54));
		mostrarEdicao(54);
		
		System.out.println(revista.reciclarEdicao(99));
		mostrarEdicao(99);
		
	}
	
	
	
	
	private static void mostrarEdicoes() {
		for (Edicao edicao: revista.getEdicoes()) {
			System.out.println(edicao);
		}
	}

	private static void mostrarEdicao(int id) {
		for (Edicao edicao: revista.getEdicoes()) {
			if (edicao.getnumeroEdicao() == id) {
				System.out.println(edicao);
			}
		}
	}

}
