package br.com.plataforma.modelos;

public class Espectador extends Pessoa {
	
	private String login;
	private int totalAssistido;
	private float experiencia;

	public Espectador(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.experiencia = 0;
		this.login = login;
		this.totalAssistido = 0;
	}

	public void ganharExp() {
		
	}
	
	public float getExperiencia() {
		return this.experiencia;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", \nidade: " + this.idade + ", \nexperiencia: " + this.experiencia;
	}
	
}
