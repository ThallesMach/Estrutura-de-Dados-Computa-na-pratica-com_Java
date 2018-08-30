package ed.pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.push("Mauricio_");
		System.out.println(pilha);
		
		pilha.push("Guilherme_");
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazia() );
		pilha.push("_Marclo_");
		System.out.println(pilha.vazia() );
		
		System.out.println("-----"+pilha+"-----");

		Stack<String> stack = new Stack<String>();
		stack.push("Mauricio_");
		stack.push("_Marcelo_");
		
		System.out.println(stack);
		
		System.out.println(stack.pop() );
		
//		String nome = stack.peek(); // peek é Parecido com pop Mas não Revome de Verdade
//		System.out.println(nome);
//		
//		System.out.println(stack);
	}

}
