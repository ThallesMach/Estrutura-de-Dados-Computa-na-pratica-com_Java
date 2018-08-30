package ed.listas_duplamente_ligadas;

public class ListaLigada {
	
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	// Adiciona ao Proximo da Lista
	public void adicionaNoComeco(Object elemento) {
	    if(this.totalDeElementos == 0) {
	        Celula nova = new Celula(elemento);
	        this.primeira = nova;
	        this.ultima = nova;
	    } else {
//	    	Celula nova = new Celula(this.primeira, elemento);  ---->>Assim funcionou com prof Mauricio, E Não comigo
	        Celula nova = new Celula( elemento, this.primeira );
	        this.primeira.setAnterior(nova);
	        this.primeira = nova;
	    }
	    this.totalDeElementos++;
	}
	
	
	@Override
	public String toString() {
		
		if(this.totalDeElementos == 0) {
		return "[]";
		}
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		
		for(int i = 0; i < totalDeElementos; i++){
			builder.append(atual.getElemento() );
			builder.append(",");
			
			atual = atual.getProximo();
		}
		builder.append("]");
		
		return builder.toString();
	}
	
	//	Adiciona no Final da Lista
	public void adiciona(Object elemento) {
	    if(this.totalDeElementos == 0) {
	        adicionaNoComeco(elemento);
	    } else {
	    	Celula nova = new Celula(elemento);
	    	this.ultima.setProximo(nova);
	    	nova.setAnterior(this.ultima);
	    	this.ultima = nova;
	    	this.totalDeElementos++;
	    }	
	}
	
	
//	--------->>>Adicona no Meio da Lista  <<<--------------------------------
	private boolean posicaoOcupada(int posicao) {
	return posicao >= 0 && posicao < this.totalDeElementos;
	}
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao) ) {
			throw new IllegalArgumentException("Poisição inexistente!");
		}
		
		Celula atual = primeira;
		
		for(int i = 0; i< posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	
//	--->>>> Método adiciona (numa posição qualquer)
	public void adiciona(int posicao, Object elemento) {
		
		if(posicao == 0) {
			adicionaNoComeco(elemento);
		} else if(posicao == this.totalDeElementos) {
			adiciona(elemento);
		} else {
			Celula anterior = pegaCelula(posicao -1);
			Celula proxima = anterior.getProximo();
			
			Celula nova = new Celula(elemento, anterior.getProximo() );
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
	}
	
//	-------------//////////////-----------------------------------------------
	
	public Object pega(int posicao) { 
		return this.pegaCelula(posicao).getElemento();
	}
	
//	---------->>>>Remove <<<<<<<<--------------------
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista Vazia!");
		}
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void remove(int posicao) {
		if(posicao == 0) {
			this.removeDoComeco();
		} else if(posicao == this.totalDeElementos -1){
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.totalDeElementos--;
		}
	}
	
	
//	----->>Método Remove do Fim na Lista. 
	public void removeDoFim() {
		if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}
	
//	---------------remove----------------------------
	
	public int tamanho() { 
		return this.totalDeElementos;
	}
	
	
/*	----->>>>> Método contem
	Este método não chegamos a implementar na aula passada. Ele será parecido com o do Vetor.
	Vamos utilizar o while, que é uma outra abordagem de laço.*/
	public boolean contem(Object elemento) { 
		Celula atual = this.primeira;
		
		while(atual != null) {
			if(atual.getElemento().equals(elemento)  ) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}
	
	
}
