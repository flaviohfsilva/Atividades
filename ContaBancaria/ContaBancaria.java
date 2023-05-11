package Aldo;

public class ContaBancaria {
	
	//Atributos
	//Lembrete: todos os atributos devem ser privados!!
	//Nesse exercício, a gente tem que entender quais atributos podem ser modificados, ou seja, que podem ter o método Set.
	
	
	private int numero; // O usuário não deve alterar o número da conta!
	private String tipo; // O usuário pode precisar alterar, logo, iremos ter um método set
	private double saldo; // O usuário não deve alterar o seu saldo!
	private double limite; //O usuário pode precisar alterar, logo, iremos ter um método set
	
	
	
	//Métodos Get e Set para fazer o encapsulamento
	//Método Get: pegar valor 
	//Método Set: adiocionar, setar ou alterar valor.
	// ALT + SHIFT + S e cliclando na opcçao "Generate getters and setters", o próprio eclipse cria os métodos para você!
	// Outra opção de fazer isso é clicar com o botão e achar a opção "Source" e dentro dela vai estar a opcção "Generate getters and setters". 
	
	
	
	/*Além dos métodos Get e Set, uma classe pode ter o método construtor.
	Método Construtor: Definem como os atributos de um objeto devem ser iniciados e eles não tem retorno.
	No caso desse construtor, para se ter uma conta bancaria é necessário ter: um número, tipo e limite.
	Dentro do método construtor, devemos falar que o nosso atributo recebe as variáveis que estam em parâmetro.
	Para fazermos isso usamos a sintaxe "this.numero" para que o computador entenda que estamos falando do atributo e não da variável.*/
	
	public ContaBancaria(int numero, String tipo, double limite) {
		this.numero = numero;
		this.tipo = tipo;
		this.limite = limite;
	}

	/* Método boolean, só irá nos dizer se a informação deste método é verdadeira ou não.
	   No caso deste método, se o valor de saque for maior que o saldo total disponível o usuário não poderá fazer o seu saque!*/
	public boolean realizarSaque(double valorSaque) {	
		double saldoTotalDisponivel = (saldo + limite);
		boolean atualizou = false;
		
		if (valorSaque < saldoTotalDisponivel) {
			saldo -=valorSaque;
			atualizou = true;
		}
		return atualizou; 
	}
	//Método void é um método vazio, ele não tem retorno. 
	public void realizarDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	//Todo método double, int e String deve retornar seu valor somente ao que foi usado.
	//String retorna String, int retorna int e assim vai.
	public double obterSaldoDisponivel() {
		double saldoTotalDisponivel = (saldo + limite);
		
		return saldoTotalDisponivel;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public double saldo() {
		return saldo;
	}
	
	public String getTipo() {
		return tipo;
	}

	
	public double getLimite() {
		return limite;
	}
	

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
