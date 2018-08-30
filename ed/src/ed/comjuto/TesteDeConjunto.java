package ed.comjuto;

import java.util.HashSet;
import java.util.Set;

public class TesteDeConjunto {

	public static void main(String[] args) {

//		-----Foi feito no começo------------------
//		LinkedList<String> conjunto = new LinkedList<String>();
//		
//		if(!conjunto.contains("Mauricio_") ) {
//			conjunto.add("Mauricio_");
//		}
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Mauricio_");
		System.out.println(conjunto);
		
		conjunto.adiciona("_Pessoa 2_");
		System.out.println(conjunto);
		
		conjunto.adiciona("Guilherme_");
		System.out.println(conjunto);

		
		conjunto.remove("Mauricio_");
		System.out.println("Removendo do Conjunto: "+conjunto);
		
		
//		--->> Set
//		À estrutura de Conjuntos damos o nome de Set e sua implementação é o HashSet:
		Set<String> conjuntoDoJava = new HashSet<String>();
		
		conjuntoDoJava.add("Maurcio Do ConjuntoJava");
		conjuntoDoJava.add("Paulo Do ConjuntoJava");
		
		System.out.println(conjunto);
		
//		Para espalhar os dados, o HashSet se utiliza do método HashCode, o qual a Classe Object do Java possui:
		String x = "_Guilherme";
		x.hashCode();
		
		System.out.println("Guilherme_".hashCode() );
		System.out.println("Guilherme_".hashCode() );
		
	}

}
