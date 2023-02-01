package br.com.plataforma.modelos;

public class Video implements Acoes {

	private String titulo;
	private float avaliacao;
	private static int totalAvaliado;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
		Video.totalAvaliado = 0;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public float getAvaliacao() {
		return avaliacao;
	}
	
	public void recebeAvaliacao(float avaliacao) {
		Video.totalAvaliado++;
		this.avaliacao = (this.avaliacao + avaliacao) / Video.totalAvaliado;
	}
	
	public int getViews() {
		return views;
	}
	
	public void recebeView() {
		this.views++;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	@Override
	public void play() {
		this.reproduzindo = true;
	}
	
	@Override
	public void pause() {
		this.reproduzindo = false;
	}
	
	@Override
	public void like() {
		this.curtidas++;
	}
	
	@Override
	public String toString() {
		return "Video: " + this.titulo 
				+ ", Avaliação: " + this.avaliacao
				+ ", Views: " + this.views;
	}
	
	public int getTotalAvaliado() {
		return Video.totalAvaliado;
	}

}
