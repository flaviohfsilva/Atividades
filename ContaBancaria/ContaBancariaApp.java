package Aldo;

import java.util.Scanner;
public class ContaBancariaApp {

	static ContaBancaria [] conta = new ContaBancaria [3]; // Utiliza��o de um vetor est�tico, ou seja, podemos utilizar durante a aplica��o inteira, em qualquer lugar.
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		double limite, valorSaque, valorDeposito;
		String tipo;
		
		//Cria��o do For para fazer o cadastro das tr�s contas.
		for(int i = 0; i<conta.length; i++) { // Usamos o ".length" para pegar o valor inteiro do vetor, que no nosso caso, � o tr�s. 
		
		System.out.print("\n--------------------------------------");
		System.out.print("\nN�mero da conta: ");
		numero = in.nextInt();
	
		// Cria��o de uma cr�tica para que o usu�rio n�o coloque o n�mero da conta menor ou igual a 0.
		//Lembrado que para fazermos cr�ticas, podemos utilizar o while ou o do while.
		if(numero == 0 || numero < 0) { 
			while(numero==0 || numero < 0) {
				System.out.println("Este n�mero de conta n�o existe! ");
				System.out.print("Insira seu N�mero da conta: ");
				numero = in.nextInt();
				}
			}
			
		in.nextLine(); // Limpando as informa��es que ficaram no buffer. 
					  //Buffers: s�o entidades intermedi�rias entre duas ou mais entidades que produzem e consomem elementos.
		
		System.out.print("Tipo de conta: ");
		tipo = in.nextLine();
		

		System.out.print("Limite da conta: ");
		limite = in.nextDouble();

		// Cria��o de uma cr�tica para que o usu�rio n�o coloque o limite da conta menor ou igual a 0.
		//Lembrado que para fazermos cr�ticas, podemos utilizar o while ou o do while.
		if(limite == 0 || limite < 0) {
			while(limite==0 || limite < 0) {
				System.out.println("Limite da conta inexistente! ");
				System.out.println("Insira o Limite da conta: ");
				limite = in.nextDouble();
				}
			}
		
		ContaBancaria cadastroConta = new ContaBancaria(numero, tipo, limite); // Cria��o do objeto j� com os par�metros definidos pelo m�todo construtor.
		
		conta[i] = new ContaBancaria(numero, tipo, limite); // vetor conta sendo instanciado junto com o objeto. para que possa receber as inform��es dos par�metros.
		
		//Utiliza��o do M�todo Get para mostrar o resultado na tela do usu�rio. 
		System.out.printf("\nN�mero da conta: %d" , cadastroConta.getNumero());
		System.out.printf("\nTipo de conta: %s" , cadastroConta.getTipo());
		System.out.printf("\nLimite da conta:  %.2f" , cadastroConta.getLimite());
		
		}
	}
}
