package br.com.prova.av1.exercicio3;

public class Mensalidade {
	
	public double valorMenssalidade;
	public int numeroIrmaos;
	public Mensalidade(double valorMenssalidade, int numeroIrmaos) {
		super();
		this.valorMenssalidade = valorMenssalidade;
		this.numeroIrmaos = numeroIrmaos;
	}
	
	public void mensalidade (double valorMensalidade, int numeroIrmaos) {
		
		
	}
	
	public void calculaMensalidade (double calculaMensalidade) {
		
		
		if (numeroIrmaos == 1) {
			
			this.valorMenssalidade = valorMenssalidade/5;
			
		}
		
		else if (numeroIrmaos == 2) {
			
			this.valorMenssalidade = valorMenssalidade/10;
		}
		
		else if (numeroIrmaos < 2) {
			this.valorMenssalidade = valorMenssalidade/15;
		}
		
		else if (numeroIrmaos == 0) {
			System.out.println("O valor do desconto é 0");
		}
	}
	

}
