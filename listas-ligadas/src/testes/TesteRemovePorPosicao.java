package testes;

import entities.ListaLigada;

public class TesteRemovePorPosicao {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Camilla");
		
		lista.remove(1);
		
		System.out.println(lista);

	}

}
