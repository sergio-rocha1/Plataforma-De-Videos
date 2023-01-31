package br.com.plataforma.eventos;

import java.util.ArrayList;
import java.util.List;

import br.com.plataforma.modelos.Espectador;
import br.com.plataforma.modelos.Pessoa;
import br.com.plataforma.modelos.Video;

public class ProjetoYoutube {

	public static void main(String[] args) {
		List<Video> videos = new ArrayList<>();
		
		videos.add(new Video("Iniciando um novo projeto"));
		videos.add(new Video("Trabalhando na classe Video"));
		
		videos.forEach(video -> {
			System.out.println(video);
			});
		
		List<Pessoa> espectadores = new ArrayList<>();
		
		espectadores.add(new Espectador("Jonas", 22, "M", "jonas.silva"));
		espectadores.add(new Espectador("Maria", 20, "F", "maria.eduarda"));
		
		espectadores.forEach(espectador -> {
			System.out.println(espectador);
			});
		
	}
}
