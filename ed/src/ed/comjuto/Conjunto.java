package ed.comjuto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
//	private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public Conjunto() {
		for(int i= 0; i < 26; i++) { // 26 Lista em Letras do Alfabeto.
			tabela.add(new LinkedList<String>() );
		}
	}
	
	
//	--->>> Métodos adiciona e contem
//	O método anterior irá nos ajudar a implementar o "adiciona":
	public void adiciona(String palavra) {
		if(!contem(palavra) ) {
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(indice);
			lista.add(palavra);
		}
	}
	
	
//	--->>> Método remove
//	Esse método precisa ter a condição do elemento estar na lista.
	public void remove(String palavra) {
		if(!contem(palavra) ) {
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(indice);
			lista.remove(palavra);
		}
	}
	
	
	private boolean contem(String palavra) {
		int indice = calculaIndiceDaTabela(palavra);
		return tabela.get(indice).contains(palavra);
	}
	
	
//	--->>> Método calculaIndice...
//	Vamos criar um método que nos auxiliará a calcular o índice da lista maior, que vai de 0 a 25.
	private int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}

}
