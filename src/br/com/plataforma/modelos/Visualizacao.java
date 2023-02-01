package br.com.plataforma.modelos;

public class Visualizacao {
	
	private Espectador espectador;
	private Video filme;
	
	public Visualizacao(Pessoa pessoa, Video filme) {
		this.espectador = (Espectador) pessoa;
		this.filme = filme;
		this.espectador.visualiza();
		this.filme.recebeView();
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public Video getFilme() {
		return filme;
	}
	
	
	public void avaliar(int nota) {
		this.filme.recebeAvaliacao(nota);
	}
	
	public void avaliar(float porcentagem) {
		this.filme.recebeAvaliacao(porcentagem / 10);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
