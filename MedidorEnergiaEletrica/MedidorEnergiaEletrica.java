package Aldo;

public class MedidorEnergiaEletrica {
	
	private int idMedidor;
	private String nrSerie;
	private char tipoUcInstalado;
	private int leituraAnterior;
	private int leituraAtual;
	private int consumo;
	private double valorConta;
	
	
	public MedidorEnergiaEletrica(int idMedidor, String nrSerie, char tipoUcInstalado, int leituraAtual) {
		this.idMedidor = idMedidor;
		this.nrSerie = nrSerie;
		this.tipoUcInstalado = tipoUcInstalado;
		this.leituraAnterior = leituraAtual;
	}
	


	public void registrarLeitura(int leitura) {
		leituraAnterior = this.leituraAtual;
		this.leituraAtual = leitura;
		
		 this.consumo = this.leituraAtual - leituraAnterior;
		 this.calcularConta();	
	}
	
	
	private void calcularConta() {
		
		if(tipoUcInstalado == 'C' || tipoUcInstalado == 'c') {
			this.valorConta = this.consumo * 0.70;
		}
		else if(tipoUcInstalado == 'I' || tipoUcInstalado == 'i') {
			this.valorConta = this.consumo * 0.50;
		}else {
			this.valorConta = this.consumo * 0.60;
		}
		
	}



	public int getIdMedidor() {
		return idMedidor;
	}
	

	public String getNrSerie() {
		return nrSerie;
	}


	public char getTipoUcInstalado() {
		return tipoUcInstalado;
	}


	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public int getConsumo() {
		return consumo;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}

	public double getValorConta() {
		return valorConta;
	}


	
	

}
