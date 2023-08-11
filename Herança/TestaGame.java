package POO;

import lojadegames.Jogo;

public class TestaGame {

	public static void main(String[] args) {
		
		Jogo jogo1 = new Jogo("The Witcher 3:Wild Hunt","PlayStation 4", 65.90 , 10 , "RPG de mundo aberto.","RPG");
		Jogo jogo2= new Jogo("FIFA 22","Xbox Series X",59.99,20,"Jogo de futebol com times  atualizados","Esporte");
		
		System.out.println("Informações do Jogo 1:");
		jogo1.imprimirInfo();
		
		System.out.println("\t");
		System.out.println("Informações do Jogo 2:");
		jogo2.imprimirInfo();
		

	}

}
