package br.com.fiap.tds.bean;

public class TOC extends Ansiedade{

	public TOC(String informacoes, String video, String musica) {
		super(informacoes, video, musica);
	}
	
	public String exibirTOC() {
		return "Informa��es sobre TOC:" + informacoes + "\n V�deo sobre TOC:" + video;
	}
	
	

}
