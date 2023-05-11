package Aldo;

import java.util.Scanner;
public class MedicaoQualidadeArApp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		System.out.print("Infome o ID: ");
		int idMedicao = in.nextInt();
		
		System.out.print("Infome o índice:");
		int indice = in.nextInt();
		
		MedicaoQualidadeAr medicao = new MedicaoQualidadeAr(idMedicao, indice);  
		
		
		System.out.print("\nIndice: " + medicao.getIndice());
		System.out.print("\nID: " + medicao.getIdMedicao());
		
		medicao.definirClassificacao(indice);  
		
		System.out.print("\nClassificação da qualidade do ar: " + medicao.getClassificacao()); 
	
		in.close();
	}
	
	
}
