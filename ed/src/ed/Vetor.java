package ed;

import java.util.Arrays;

public class Vetor {
	
	private Aluno[] alunos = new Aluno[100];
	
	public void adiciona(Aluno aluno) {
		
	}
	
	// Vai devolver a posição que o Aluno da na quela Lista
	public Aluno pega(int posicao) {
		
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	// Esse method vai desconbri se o Aluno ta ou não ta naquela lista.
	public boolean contem(Aluno aluno) {
		return false;
	}
	
	// ira devolver a quantidade de intem está na Lista. Nesse vetor
	public int tamanho() {
		return 0;
	}
	
	// Vai pega todo elemento do Arrays e chama elemento do toString de Todos eles
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}

}
