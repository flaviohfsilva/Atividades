package Aldo;

public class ApuracaoNotas {
	
	private double nota1;
	private double nota2;
	private double nota3;
	protected double media;
	
	
	
	public ApuracaoNotas(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.calcularMedia(nota1, nota2);
	}
	
	
	public ApuracaoNotas(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.calcularMedia(nota1, nota2, nota3);
	}
	
	
	
	public double calcularMedia(double nota1, double nota2) {
		return this.media = (nota1 + nota2) / 2;
	}
	
	public double calcularMedia(double nota1, double nota2, double nota3) {
		
		return this.media = (nota1 + nota2 + nota3) / 3;
	}
	
	

	
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getMedia() {
		return media;
	}


	
}
