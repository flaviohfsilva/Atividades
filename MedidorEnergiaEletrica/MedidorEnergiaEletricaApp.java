package Aldo;

import java.util.Scanner;
public class MedidorEnergiaEletricaApp {
	
	
	
	public static void main(String[] args) {
		
		int idMedidor, leituraAtual; 
		String nrSerie;
		char tipoUcInstalado;
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<2; i++) {
		
		System.out.print("Insira o Id Medidor: ");
		idMedidor = in.nextInt();
		
		in.nextLine();
		
		System.out.print("Insira o Número de série: ");
		nrSerie = in.nextLine();
		
		System.out.print("Insira o Tipo da unidade de consumo (C, I ou R): ");
		tipoUcInstalado = in.nextLine().charAt(0);
		tipoUcInstalado = Character.toUpperCase(tipoUcInstalado);
		
		System.out.print("Insira a Leitura Atual: ");
		leituraAtual = in.nextInt();
		
		MedidorEnergiaEletrica medidor = new MedidorEnergiaEletrica(idMedidor, nrSerie, tipoUcInstalado, leituraAtual);
		
		
		System.out.print("\nId Medidor: "+ medidor.getIdMedidor());
		System.out.print("\nNúmero de Série: " + medidor.getNrSerie());
		System.out.print("\nTipo Unidade de Consumo: " + medidor.getTipoUcInstalado());
		System.out.print("\nLeitura Atual: " + medidor.getLeituraAnterior() + "\n");
		System.out.println("--------------------------------------------------------------------------");
		
		medidor.registrarLeitura(leituraAtual);
		System.out.printf("Consumo kWh: %d" , medidor.getConsumo());
		System.out.printf("\nValor da Conta R$: %.2f" , medidor.getValorConta());
		System.out.println("\n--------------------------------------------------------------------------");
		}
			
	}

}
