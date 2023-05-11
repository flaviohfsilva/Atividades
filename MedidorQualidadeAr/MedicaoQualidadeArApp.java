package Aldo;

import java.util.Scanner;
public class MedicaoQualidadeArApp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		System.out.print("Infome o ID: ");
		int idMedicao = in.nextInt();
		
		System.out.print("Infome o �ndice:");
		int indice = in.nextInt();
		
		MedicaoQualidadeAr medicao = new MedicaoQualidadeAr(idMedicao, indice);  
		
		
		System.out.print("\nIndice: " + medicao.getIndice());
		System.out.print("\nID: " + medicao.getIdMedicao());
		
		medicao.definirClassificacao(indice);  
		
		System.out.print("\nClassifica��o da qualidade do ar: " + medicao.getClassificacao()); 
	
		in.close();
	}
	
	
}
