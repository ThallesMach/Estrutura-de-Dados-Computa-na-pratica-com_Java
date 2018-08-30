package ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	public void push(String nome) {  // push() ==  public void insere(String nome) {
		nomes.add(nome);
	}
	
	
//	--->>>>Método remove
//	Aqui basta chamar o "remove" do LinkedList passando o elemento na casa nomes.size()-1:
	public String pop(){ //  pop() == 	public String remove(){
		return nomes.remove(nomes.size()-1 );
	}
	
	
//	--->> Método vazia
//	Este método indica se a lista está vazia ou não. Temos duas maneiras de implemetá-lo:
	public boolean vazia() {
		return nomes.isEmpty();
	}

	
	@Override
	public String toString() {
		return nomes.toString();
	}
	
}
