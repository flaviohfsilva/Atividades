package Aldo;

public class MedicaoQualidadeAr {
	
	private int idMedicao;
	private int indice;
	private String classificacao;
	
	
	
	public MedicaoQualidadeAr(int idMedicao, int indice) {
		this.idMedicao = idMedicao;
		this.indice = indice;
	}

	public String definirClassificacao(int indice) {
		
		this.indice = indice;
		
		
		if(indice <=50) {
			this.classificacao= "Boa";
		}
		else if(indice <= 100) {
			this.classificacao = "Regular";
		}
		else if(indice <= 199) {
			this.classificacao= "Inadequada";
		}
		else if(indice <= 299) {
			this.classificacao= "Má";
		}
		else if(indice <= 399) {
			this.classificacao= "Péssima";
		}
		else {
			this.classificacao= "Crítica";
		}
		return classificacao;
	}
	
	 
	
	public void setIdMedicao(int idMedicao) {
		this.idMedicao = idMedicao;
	}
	
	public int getIdMedicao() {
		return idMedicao;
	}
	
	
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	
	public int getIndice() {
		return indice;
	}
	
	
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public String getClassificacao() {
		return classificacao;
	}
	
}
