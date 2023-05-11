package Aldo;

public class ControleRemoto {
	
	private int idControle;
	private String modelo;
	private int temperaturaMinima;
	private int temperaturaMaxima;
	private int temperaturaAtual;
	private int velocidade;
	private boolean ligado;
	
	public ControleRemoto(int idControle, String modelo, int temperaturaMinima, int temperaturaMaxima) {
		this.idControle = idControle;
		this.modelo = modelo;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
		this.temperaturaAtual = 0;
	}
	
	public void ligarDesligar() {
		if(ligado == true) {
			ligado = false;
			temperaturaAtual = 0;
		}else {
			ligado = true;
			temperaturaAtual = (temperaturaMaxima + temperaturaMinima) / 2;
			velocidade = 1;
		}
	}
	
	public boolean diminuirTemperatura() {
		if(temperaturaAtual > temperaturaMinima) {
			this.temperaturaAtual -=1;
			return true;
		}
		return false;
	}
	
	public boolean aumentarTemperatura() {
		if(temperaturaAtual < temperaturaMaxima) {
			this.temperaturaAtual +=1;
			return true;
		}
		return false;
	}
	
	public void ajustarVelocidade() {
		velocidade += 1;
		
		if(velocidade > 3) {
			velocidade = 1;
		}
	}

	
	public int getIdControle() {
		return idControle;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public int getTemperaturaAtual() {
		return temperaturaAtual;
	}


	public int getVelocidade() {
		return velocidade;
	}


	public boolean getLigado() {
		return ligado;
	}

}

	
	
	
