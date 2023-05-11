package Aldo;

public class NavioContainer  extends Navio{

	private int quantidadeGuindaste;
	private int quantidadeCamadas;
	
	
	public NavioContainer(int idNavio, String nome, int quantidadePoroes, double capacidadeCarga, int quantidadeGuindaste, int quantidadeCamadas) {
		super(idNavio, nome, quantidadePoroes, capacidadeCarga);
		this.quantidadeGuindaste = quantidadeGuindaste;
		this.quantidadeCamadas = quantidadeCamadas;
	}
	
	
	
	public int getQuantidadeGuindaste() {
		return quantidadeGuindaste;
	}
	public void setQuantidadeGuindaste(int quantidadeGuindaste) {
		this.quantidadeGuindaste = quantidadeGuindaste;
	}
	public int getQuantidadeCamadas() {
		return quantidadeCamadas;
	}
	public void setQuantidadeCamadas(int quantidadeCamadas) {
		this.quantidadeCamadas = quantidadeCamadas;
	}
	
	
	@Override
	public String toString() {
		return "\nID Navio: " + this.getIdNavio() + 
				"\nNome: " +this.getNome() + 
				"\nQuantidade de Poroes: " + this.getQuantidadePoroes() +
				"\nCapacidade da Carga: " + this.getCapacidadeCarga() + 
				"\nQuantidade de Guindaste: " + this.quantidadeGuindaste +
				"\nQuantidade de Camada: " + this.quantidadeCamadas;
	}
	
	
	
}
