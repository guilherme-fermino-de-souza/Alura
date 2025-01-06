package br.com.alura.screenmatch.modelo;

public class Titulo {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalAvaliacoes; 
	private int duracaoEmMinutos;
	
	public int getTotalDeAvaliacoes() {
		return totalAvaliacoes;
	}
	
	public void setTotalDeAvaliacoes(int totalAvaliacoes) {
		this.totalAvaliacoes = totalAvaliacoes;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	
	public int getAnoDeLancamento() {
		return this.anoDeLancamento;
	}
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento do filme: " + anoDeLancamento);
		System.out.println("Duração do filme: " +duracaoEmMinutos);
		System.out.println("Incluido no plano: " +incluidoNoPlano);
	}
	
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalAvaliacoes++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacoes/totalAvaliacoes;
	}
}
