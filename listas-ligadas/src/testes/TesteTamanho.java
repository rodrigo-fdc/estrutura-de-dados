package testes;

import entities.ListaLigada;

public class TesteTamanho {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista.tamanho());
		
		lista.adiciona("Camilla");
		
		System.out.println(lista.tamanho());

	}

}
