package br.com.fiap.tds.bean;

public class SP extends Ansiedade {
	
	//Sindrome do Panico
	public SP(String informacoes, String video, String musica) {
		super(informacoes, video, musica);
	}

	public String exibirSP() {
		return "Informa��es sobre SP:" + informacoes + "\nV�deo sobre SP:" + video;
	}

}
