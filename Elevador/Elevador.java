package Aldo;

public class Elevador {

	private int idElevador;
	private String localidade;
	private int nrMaximoPessoas;
	private int nrAtualPessoas;
	private double pesoMaximoCarga;
	private double pesoAtualCarga;
	private double valorSeguroAcumulado;
	
	
	public Elevador(int idElevador, String localidade, int nrMaximoPessoas, double pesoMaximoCarga) {
		this.idElevador = idElevador;
		this.localidade = localidade;
		this.nrMaximoPessoas = nrMaximoPessoas;
		this.pesoMaximoCarga = pesoMaximoCarga;
	}

	
	public boolean embarque(double pesoPessoa) {
			
			if(this.nrAtualPessoas <= this.nrMaximoPessoas) {
				this.nrAtualPessoas += 1;
				this.pesoAtualCarga += pesoPessoa;
				this.valorSeguroAcumulado = registrarSeguro();
				return true;
			}else {
				return false;
			}
	}
	
	
	public boolean desembarque(double pesoPessoa) {
		
		if(this.nrAtualPessoas <= this.nrMaximoPessoas || this.nrAtualPessoas >= this.nrMaximoPessoas) {
			this.nrAtualPessoas -= 1;
			this.pesoAtualCarga -= pesoPessoa;
			}
		
		if(this.pesoAtualCarga < 0) {
				this.pesoAtualCarga = 0;
				return true;
		}
		return false;
	}
	
	
	public double registrarSeguro() {
		if(nrMaximoPessoas <= nrAtualPessoas / 2) {
			return this.valorSeguroAcumulado = this.valorSeguroAcumulado + 1.50;
		}else {
			return this.valorSeguroAcumulado = this.valorSeguroAcumulado + 2.00;
		}
	}
	
	
	public void zerarValorSeguro() {
		this.valorSeguroAcumulado = 0;
	}
	
	
	public int getIdElevador() {
		return idElevador;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}


	public int getNrMaximoPessoas() {
		return nrMaximoPessoas;
	}


	public void setNrMaximoPessoas(int nrMaximoPessoas) {
		this.nrMaximoPessoas = nrMaximoPessoas;
	}


	public int getNrAtualPessoas() {
		return nrAtualPessoas;
	}


	public double getPesoMaximoCarga() {
		return pesoMaximoCarga;
	}


	public void setPesoMaximoCarga(double pesoMaximoCarga) {
		this.pesoMaximoCarga = pesoMaximoCarga;
	}


	public double getPesoAtualCarga() {
		return pesoAtualCarga;
	}

	public double getValorSeguroAcumulado() {
		return valorSeguroAcumulado;
	}

	
	
}
