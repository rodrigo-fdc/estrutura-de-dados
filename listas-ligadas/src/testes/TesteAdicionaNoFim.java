package testes;

import entities.ListaLigada;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("RAfael");
		lista.adiciona("Paulo");
		
		System.out.println(lista);

	}

}
