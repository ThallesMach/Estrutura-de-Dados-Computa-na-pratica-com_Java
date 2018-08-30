package ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	
	private List<String> alunos = new LinkedList<String>();
	
	public void adiciona(String aluno) {
		alunos.add(aluno);
	}
	
	
//	-->> Método vazia
//	Nos falta ainda esse método. Implementamos da seguinte forma:
	public boolean vazia() {
		return alunos.isEmpty();
	}
	
	public String remove() {
		return alunos.remove(0);
	}
	
	
	@Override
	public String toString() {
		return alunos.toString();
	}
}
