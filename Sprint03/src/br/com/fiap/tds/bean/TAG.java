package br.com.fiap.tds.bean;

public class TAG extends Ansiedade {

	//Generalised anxiety disorder
	public TAG(String informacoes, String video, String musica) {
		super(informacoes, video, musica);
	}

	public String exibirTAG() {
		return "Informa��es sobre TAG:" + informacoes + "\nV�deo sobre TAG:" + video;
	}


	
}
