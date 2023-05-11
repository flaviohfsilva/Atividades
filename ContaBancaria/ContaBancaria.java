package Aldo;

public class ContaBancaria {
	
	//Atributos
	//Lembrete: todos os atributos devem ser privados!!
	//Nesse exerc�cio, a gente tem que entender quais atributos podem ser modificados, ou seja, que podem ter o m�todo Set.
	
	
	private int numero; // O usu�rio n�o deve alterar o n�mero da conta!
	private String tipo; // O usu�rio pode precisar alterar, logo, iremos ter um m�todo set
	private double saldo; // O usu�rio n�o deve alterar o seu saldo!
	private double limite; //O usu�rio pode precisar alterar, logo, iremos ter um m�todo set
	
	
	
	//M�todos Get e Set para fazer o encapsulamento
	//M�todo Get: pegar valor 
	//M�todo Set: adiocionar, setar ou alterar valor.
	// ALT + SHIFT + S e cliclando na opc�ao "Generate getters and setters", o pr�prio eclipse cria os m�todos para voc�!
	// Outra op��o de fazer isso � clicar com o bot�o e achar a op��o "Source" e dentro dela vai estar a opc��o "Generate getters and setters". 
	
	
	
	/*Al�m dos m�todos Get e Set, uma classe pode ter o m�todo construtor.
	M�todo Construtor: Definem como os atributos de um objeto devem ser iniciados e eles n�o tem retorno.
	No caso desse construtor, para se ter uma conta bancaria � necess�rio ter: um n�mero, tipo e limite.
	Dentro do m�todo construtor, devemos falar que o nosso atributo recebe as vari�veis que estam em par�metro.
	Para fazermos isso usamos a sintaxe "this.numero" para que o computador entenda que estamos falando do atributo e n�o da vari�vel.*/
	
	public ContaBancaria(int numero, String tipo, double limite) {
		this.numero = numero;
		this.tipo = tipo;
		this.limite = limite;
	}

	/* M�todo boolean, s� ir� nos dizer se a informa��o deste m�todo � verdadeira ou n�o.
	   No caso deste m�todo, se o valor de saque for maior que o saldo total dispon�vel o usu�rio n�o poder� fazer o seu saque!*/
	public boolean realizarSaque(double valorSaque) {	
		double saldoTotalDisponivel = (saldo + limite);
		boolean atualizou = false;
		
		if (valorSaque < saldoTotalDisponivel) {
			saldo -=valorSaque;
			atualizou = true;
		}
		return atualizou; 
	}
	//M�todo void � um m�todo vazio, ele n�o tem retorno. 
	public void realizarDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	//Todo m�todo double, int e String deve retornar seu valor somente ao que foi usado.
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
