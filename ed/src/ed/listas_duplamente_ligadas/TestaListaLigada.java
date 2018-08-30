package ed.listas_duplamente_ligadas;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Pessoa 1");
		System.out.println(lista);
		lista.adicionaNoComeco("Pessoa 2");
		System.out.println(lista);
		lista.adicionaNoComeco("Pessoa 3");
		System.out.println(lista);
		
		lista.adiciona("Pessoa FinalLista");
		System.out.println(lista);
		
		// Adiciona n Meio da Lista
		lista.adiciona(2, "_Gabriel_");
		System.out.println(lista);
		
		// Pega Elemento da Lista
		Object x = lista.pega(2);
		System.out.println(x);
		System.out.println(lista.tamanho() );
		
		// Remove do Começo
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho() );
		
		lista.removeDoFim();
		System.out.println(lista);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		lista.adiciona("JosE_");
		lista.adiciona("Joao_");
		
		lista.remove(2);
		
		System.out.println(lista);
		
		System.out.println(lista.contem("JosE_") );
		System.out.println(lista.contem("Beto") );
		
	}

}
