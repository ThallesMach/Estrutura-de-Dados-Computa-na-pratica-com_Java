package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Pessoa 1_");
		fila.adiciona("Pessoa 2_");
		System.out.println(fila);
		
		String x1 = fila.remove();
		System.out.println(x1);
		
//		---- Fila Atual depois de Remove ---------
		System.out.println(fila);
		
		
//		-->>> Queue
//		Da mesma forma que a estrutura de Pilhas tinha o nome de Stack, à estrutura de Filas damos o nome de Queue:
//		adiciona: add
//		remove: poll
		Queue<String> filaDoJava = new LinkedList<String>();
		
		filaDoJava.add("Pessoa 1_");
		String x2 = filaDoJava.poll();
		System.out.println("Pessoa Removida da Fila: "+x2);
		
	}

}
