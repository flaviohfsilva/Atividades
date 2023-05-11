package Aldo;

import java.util.Scanner;
public class AppElevador {
	

	public static void main(String[] args) {
		
		double pesoPessoa;
		
		Scanner in = new Scanner(System.in);
		Elevador elevador = new Elevador(1803, "Afogados", 10, 750);
		
		
		System.out.print("Dados do Elevador: ");
		System.out.print("\n-----------------------------------------------------------\n");
		System.out.print("Id do elevador: " + elevador.getIdElevador());
		System.out.print("\nLocalidade: " + elevador.getLocalidade());
		System.out.print("\nNúmero máximo de pessoas: " + elevador.getNrMaximoPessoas());
		System.out.printf("\nPeso máximo: %.1f KG" , elevador.getPesoMaximoCarga());
		
		for(int i = 0; i <=elevador.getNrMaximoPessoas(); i++) {
			
			System.out.print("\n-----------------------------------------------------------\n");
			System.out.print("EMBARQUE");
			System.out.print("\n-----------------------------------------------------------");
			System.out.print("\nPeso da Pessoa: ");
			pesoPessoa = in.nextDouble();
			
			elevador.embarque(pesoPessoa);
			System.out.print("N�mero de pessoas embarcadas: " + elevador.getNrAtualPessoas());
			System.out.printf("\nPeso Atual da carga: %.2f KG" , elevador.getPesoAtualCarga());
			

			if(elevador.getNrAtualPessoas() > elevador.getNrMaximoPessoas() || elevador.getPesoAtualCarga() > elevador.getPesoMaximoCarga()) {
				System.out.println("\nCapacidade de pessoas ou de carga esgotada!");
				break;
			}
		}
		
		for(int i = 0; i <=elevador.getNrMaximoPessoas(); i++) {
			
			System.out.print("\n-----------------------------------------------------------\n");
			System.out.print("DESEMBARQUE");
			System.out.print("\n-----------------------------------------------------------");
			System.out.print("\nPeso da Pessoa: ");
			pesoPessoa = in.nextDouble();
			
			elevador.desembarque(pesoPessoa);
			System.out.println("N�mero de pessoas desembarcadas: " + elevador.getNrAtualPessoas());
			System.out.printf("Peso Atual da carga: %.2f KG\n" , elevador.getPesoAtualCarga());
			
			if(elevador.getNrAtualPessoas() <=0) {
				System.out.println("\nN�o tem pessoa para desembarcar");
				break;
			}
			
		}
	}

}
