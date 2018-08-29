package ed.listaligada;

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
		
	}

}
