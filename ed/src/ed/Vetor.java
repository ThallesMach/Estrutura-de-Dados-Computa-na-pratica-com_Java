package ed;

import java.util.Arrays;



public class Vetor {
	
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <= totalDeAlunos;
	}
	
	private void garanteEspaco() {
		if(totalDeAlunos == alunos.length ) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	// Posicioa em qualquer luga da Lista
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		
		if(!posicaoValida(posicao) ) {
			throw new IllegalArgumentException("Posição invalida");
		}
		
		for(int i = totalDeAlunos -1; i >=posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao < totalDeAlunos;
	}
	// Vai devolver a posição que o Aluno da na quela Lista
	public Aluno pega(int posicao) {
		
		if(!posicaoOcupada(posicao) ) {
			throw new IllegalArgumentException("posição invalidar");
		}
		
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		
		for(int i = posicao; i < this.totalDeAlunos -1; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		totalDeAlunos--;
		this.alunos[totalDeAlunos]= null;
	}
	
	// Esse method vai desconbri se o Aluno ta ou não ta naquela lista.
	public boolean contem(Aluno aluno) {
		
		for (int i = 0; i < totalDeAlunos; i++) {
			if(aluno.equals(alunos[i]) ) {
				return true;
			}
		}
		
		return false;
	}
	
	// ira devolver a quantidade de intem está na Lista. Nesse vetor
	public int tamanho() {
		return totalDeAlunos;
	}
	
	// Vai pega todo elemento do Arrays e chama elemento do toString de Todos eles
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}

}
