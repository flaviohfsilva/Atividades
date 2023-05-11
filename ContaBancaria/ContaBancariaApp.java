package Aldo;

import java.util.Scanner;
public class ContaBancariaApp {

	static ContaBancaria [] conta = new ContaBancaria [3]; // Utilização de um vetor estático, ou seja, podemos utilizar durante a aplicação inteira, em qualquer lugar.
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		double limite, valorSaque, valorDeposito;
		String tipo;
		
		//Criação do For para fazer o cadastro das três contas.
		for(int i = 0; i<conta.length; i++) { // Usamos o ".length" para pegar o valor inteiro do vetor, que no nosso caso, é o três. 
		
		System.out.print("\n--------------------------------------");
		System.out.print("\nNúmero da conta: ");
		numero = in.nextInt();
	
		// Criação de uma crítica para que o usuário não coloque o número da conta menor ou igual a 0.
		//Lembrado que para fazermos críticas, podemos utilizar o while ou o do while.
		if(numero == 0 || numero < 0) { 
			while(numero==0 || numero < 0) {
				System.out.println("Este número de conta não existe! ");
				System.out.print("Insira seu Número da conta: ");
				numero = in.nextInt();
				}
			}
			
		in.nextLine(); // Limpando as informações que ficaram no buffer. 
					  //Buffers: são entidades intermediárias entre duas ou mais entidades que produzem e consomem elementos.
		
		System.out.print("Tipo de conta: ");
		tipo = in.nextLine();
		

		System.out.print("Limite da conta: ");
		limite = in.nextDouble();

		// Criação de uma crítica para que o usuário não coloque o limite da conta menor ou igual a 0.
		//Lembrado que para fazermos críticas, podemos utilizar o while ou o do while.
		if(limite == 0 || limite < 0) {
			while(limite==0 || limite < 0) {
				System.out.println("Limite da conta inexistente! ");
				System.out.println("Insira o Limite da conta: ");
				limite = in.nextDouble();
				}
			}
		
		ContaBancaria cadastroConta = new ContaBancaria(numero, tipo, limite); // Criação do objeto já com os parâmetros definidos pelo método construtor.
		
		conta[i] = new ContaBancaria(numero, tipo, limite); // vetor conta sendo instanciado junto com o objeto. para que possa receber as informções dos parâmetros.
		
		//Utilização do Método Get para mostrar o resultado na tela do usuário. 
		System.out.printf("\nNúmero da conta: %d" , cadastroConta.getNumero());
		System.out.printf("\nTipo de conta: %s" , cadastroConta.getTipo());
		System.out.printf("\nLimite da conta:  %.2f" , cadastroConta.getLimite());
		
		}
	}
}
