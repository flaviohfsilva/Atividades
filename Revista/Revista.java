package Aldo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Revista {
	
	private int idRevista;
	private String titulo;
	private int reciclagemProduzida;
	private Edicao edicao;
	private List<Edicao> edicoes;
	
	
	public Revista(int idRevista, String titulo) {
		this.idRevista = idRevista;
		this.titulo = titulo;
		this.reciclagemProduzida = 0;
		this.edicoes = new ArrayList<Edicao>();
	}
	
	public void adicionarEdicao(int numeroEdicao, int tiragem, int qtdeVendida) {
		this.edicoes.add(new Edicao(numeroEdicao, tiragem, qtdeVendida));
	}
	
	public void removerEdicao(Edicao edicao) {
		this.edicoes.remove(edicao);
	}
	
	
	public String reciclarEdicao(int numeroEdicao) {
		
		Edicao edicaoEncontrada = procurarEdicaoPorId (numeroEdicao);
		
		if(edicaoEncontrada == null) {
			return "Edição não encontrada!";
		}
		else if(edicaoEncontrada.obterQtdeReciclagem() == 0) {
			return "Não houve exemplares pra reciclar!";
		}
		else if(edicaoEncontrada.isReciclou()) {
			return "Edição já reciclada!";
		}
		else {
			this.reciclagemProduzida += edicaoEncontrada.obterQtdeReciclagem();
			edicaoEncontrada.reciclarExemplares();
			return "Edição realizada!";
		}
	}
	
	
	


	private Edicao procurarEdicaoPorId(int numeroEdicao) {
		
		for(Edicao edicao : edicoes) {
			if(edicao.getnumeroEdicao() == numeroEdicao) {
				return edicao;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "\nRevista"
				+"\nCódigo: " + this.idRevista + 
				"\nTitulo: " + this.titulo + 
				"\nReciclagem Produzida: "+ this.reciclagemProduzida + 
				"\nLista de Edições: " + this.edicoes;
	}
	
	
	
	
	
	public int getIdRevista() {
		return idRevista;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}
	
	public void setReciclagemProduzida(int reciclagemProduzida) {
		this.reciclagemProduzida = reciclagemProduzida;
	}
	
	public Edicao getEdicao() {
		return edicao;
	}
	
	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}
	
	public List<Edicao> getEdicoes() {
		return edicoes;
	}
	
	public void setEdicoes(List<Edicao> edicoes) {
		this.edicoes = edicoes;
	}


	

	
	
	
	
}
