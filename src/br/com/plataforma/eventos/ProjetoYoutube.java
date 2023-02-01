package br.com.plataforma.eventos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.plataforma.modelos.Espectador;
import br.com.plataforma.modelos.Pessoa;
import br.com.plataforma.modelos.Video;
import br.com.plataforma.modelos.Visualizacao;

public class ProjetoYoutube {

	public static void main(String[] args) {
		List<Video> videos = new ArrayList<>();
		
		videos.add(new Video("Iniciando um novo projeto"));
		videos.add(new Video("Trabalhando na classe Video"));
		
//		videos.forEach(video -> {
//			System.out.println(video);
//			});
		
		List<Pessoa> espectadores = new ArrayList<>();
		
		espectadores.add(new Espectador("Jonas", 22, "M", "jonas.silva"));
		espectadores.add(new Espectador("Maria", 20, "F", "maria.eduarda"));
		
		List<Visualizacao> visualizacao = new LinkedList<>();
		
		visualizacao.add(new Visualizacao(espectadores.get(0), videos.get(0)));
		visualizacao.add(new Visualizacao(espectadores.get(1), videos.get(0)));
		
		visualizacao.get(0).avaliar(6);
		visualizacao.get(1).avaliar(8);
		
		System.out.println("Total de pessoas que avaliaram o filme " + videos.get(0).getTitulo() + ": " + videos.get(0).getTotalAvaliado());
		System.out.println(videos.get(0).getAvaliacao());
		
//		espectadores.forEach(espectador -> {
//			System.out.println(espectador);
//			});
//		
	}
}
