package br.com.fiap.tds.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Administrador;
import br.com.fiap.tds.bean.PaginaPrincipal;
import br.com.fiap.tds.bean.SP;
import br.com.fiap.tds.bean.TAG;
import br.com.fiap.tds.bean.TOC;
import br.com.fiap.tds.bean.Usuario;

public class TesteMind {
	
public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
		
	int opcao; 
	
	do {
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha a op��o para setar:\n"
				+ "1 - Administrador\n"
				+ "2 - Usu�rio\n"
				+ "3 - P�gina Principal \n"
				+ "4 - TOC \n"
				+ "5 - TAG \n"
				+ "6 - SP \n"
				+ "0 - Sair do sistema"));
		
		switch(opcao) {
			case 1 :
				
				System.out.print("Digite o nome do ADM: ");
				String nomeAdm = leitor.next() + leitor.nextLine();
				
				System.out.print("Digite o email do ADM: ");
				String email = leitor.next();
				
				System.out.print("Digite a senha do ADM: ");
				String senhaAdm = leitor.next();
				
				Administrador Ademiro = new Administrador(nomeAdm, email, senhaAdm);
				
				String ChamadaAdm = Ademiro.exibirAdministrador();
				System.out.println(ChamadaAdm);
				break;
			case 2 :
				
				System.out.print("Digite o email usu�rio: ");
				String emailUser = leitor.next();
				
				System.out.print("Digite a senha do usu�rio: ");
				String senha = leitor.next();
				
				Usuario User = new Usuario(emailUser, senha);
				
				String ChamadaUser = User.exibirUsuario();
				System.out.println(ChamadaUser);
				break;
			case 3:
				
				System.out.print("Digite as informa��es da p�gina principal: ");
				String informacoes = leitor.next() + leitor.nextLine();
				
				PaginaPrincipal MainPage = new PaginaPrincipal(informacoes);
				
				String ChamadaMainPage = MainPage.exibirPaginaPrincipal();
				System.out.println(ChamadaMainPage);
				break;
			case 4:
				
				System.out.print("Digite as informa��es do TOC: ");
				String informacoesToc = leitor.next() + leitor.nextLine();
				
				System.out.print("Digite o v�deo sobre TOC: ");
				String videoToc = leitor.next();
				
				TOC TocPage = new TOC(informacoesToc, videoToc, null);
				
				String ChamadaTocPage = TocPage.exibirTOC();
				System.out.println(ChamadaTocPage);
				break;
				
			case 5:
				
				System.out.print("Digite as informa��es do TAG: ");
				String informacoesTag = leitor.next() + leitor.nextLine();
				
				System.out.print("Digite o v�deo sobre TAG: ");
				String videoTag = leitor.next();
				
				TAG TagPage = new TAG(informacoesTag, videoTag, null);
				
				String ChamadaTagPage = TagPage.exibirTAG();
				System.out.println(ChamadaTagPage);
				break;
				
			case 6:
				
				System.out.print("Digite as informa��es do SP: ");
				String informacoesSp = leitor.next() + leitor.nextLine();
				
				System.out.print("Digite o v�deo sobre SP:");
				String videoSp = leitor.next();
				
				SP SpPage = new SP(informacoesSp, videoSp, null);
				
				String ChamadaSpPage = SpPage.exibirSP();
				System.out.println(ChamadaSpPage);
				break;
				
			case 0:
				
				JOptionPane.showMessageDialog(null, "Finalizando... Obrigado por utilizar!");
				break;	
			default:
				
				JOptionPane.showMessageDialog(null, "Op��o inv�lida");
					
			}
		
		} while (opcao != 0);
	
		leitor.close();
		
	}
		
}
