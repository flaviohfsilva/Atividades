package Aldo;

public class ApuracaoNota2Chamada extends ApuracaoNotas{
	
	private double nota;
	
	public ApuracaoNota2Chamada(double nota1, double nota2, double nota) {
		super(nota1, nota2);
		this.nota = nota;
		
		if(nota1 == 0) {
			nota1 = nota;
		}else{
			nota2 = nota;
		}
			
		this.calcularMedia(nota1, nota2);

	}
	
	

	public ApuracaoNota2Chamada(double nota1, double nota2, double nota3, double nota) {
		super(nota1, nota2, nota3);
		this.nota = nota;
		
		
		if(nota1 == 0) {
			nota1 = nota;
		}else if(nota2 == 0) {
			nota2 = nota;
		}else{
			nota3 = nota;
		}
		
		this.calcularMedia(nota1, nota2, nota3);
	}
	
	
	
	@Override
	public double calcularMedia(double nota1, double nota2) {
		return this.media = (nota1 + nota2) / 2;
	}

	@Override
	public double calcularMedia(double nota1, double nota2, double nota3) {
		return this.media = (nota1 + nota2 + nota3) / 3;
	}



	public double getNota() {
		return nota;
	}


	
	
	
}
