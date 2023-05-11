package Aldo;

public class NavioGraneleiro extends Navio{

	
	private int quantidadeEscotilhas;
	
	
	public NavioGraneleiro(int idNavio, String nome, int quantidadePoroes, double capacidadeCarga, int quantidadeEscotilhas) {
		super(idNavio, nome, quantidadePoroes, capacidadeCarga);
		this.quantidadeEscotilhas = quantidadeEscotilhas; 
	}
	
	

	public int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}


	public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}

	@Override
	public String toString() {
		return "\nID Navio: " + this.getIdNavio() + 
				"\nNome: " +this.getNome() + 
				"\nQuantidade de Poroes: " + this.getQuantidadePoroes() +
				"\nCapacidade da Carga: " + this.getCapacidadeCarga() + 
				"\nQuantidade de Escotilhas: " + this.quantidadeEscotilhas;
	}
	
	
	
}
