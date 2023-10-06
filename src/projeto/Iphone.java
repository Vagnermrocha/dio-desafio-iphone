package projeto;

import java.util.Scanner;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	
	public void ligar() {
		System.out.println("Fazendo a ligação");
	}	
	public void receberLigacao() {
		System.out.println("Recebendo a ligação telefonica");
	}
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
	}
	
	public void tocarPrayer() {
		System.out.println("Reproduzindo a musica do player");
	}
	public void pausarPrayer() {
		System.out.println("Pausando a música no player");
	}
	public void SelecionarMusica() {
		System.out.println("Musica selecionada no player");
	}
	
	public void exibirPaginaWeb( ) {
		System.out.println("Exibindo página da web");
	}
	public void AdicionarNovaAbaWeb() {
		System.out.println("Abrindo nova aba do browser");
	}
	public void atualizarPaginaWeb() {
		System.out.println("Atualizando página da web");
	}
	
	public static void main(String[] args) throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		Iphone iphone = new Iphone();
		int opcao;
			do {
				System.out.println("Selecione uma opção no menu: \n + " + "2: Atender a ligaçao \n + " + "3: Iniciar correio de voz \n + " + "4: Selecionar música \n + " + "5: Reproduzir a música \n + " + "6: Pausar a música \n " + "7: Exibir página no navegador \n" + "8: Abrir nova aba no navegador \n" + "9: Atualizar página do navegador \n " +  "0: Desligar");			
				opcao = scanner.nextInt();
				
				switch (opcao) {
				case 1:
					iphone.ligar();
					//Thread.sleep(1000);
					break;
				case 2: 
					iphone.receberLigacao();
				//Thread.sleep(1000);
					break;
				case 3: iphone.iniciarCorreioDeVoz();
				//    Thread.sleep(1000);				    
				    break;
				case 4:
					iphone.SelecionarMusica();
					//Thread.sleep(1000);	
					break;
				case 5:
					iphone.tocarPrayer();
					//Thread.sleep(1000);	
					break;
				case 6:
					iphone.pausarPrayer();
					//Thread.sleep(1000);	
					break;
				case 7:
					iphone.exibirPaginaWeb();
				//	Thread.sleep(1000);	
					break;
				case 8:
					iphone.AdicionarNovaAbaWeb();
				//	Thread.sleep(1000);	
					break;
				case 9:
					iphone.atualizarPaginaWeb();
				//	Thread.sleep(1000);	
					break;
				case 10:
					System.out.println("Desligando oaparelho");
					//Thread.sleep(900);	
					break;
				default: 
					System.out.println("Opção invalida. Insira um número de 0 a 9.");
			//	Thread.sleep(1000);	
				}		
				
				} while (opcao !=0);
				scanner.close();
	}
	
		

}
