
package Streams_Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;


public class Tree_Set {
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<String> setTree = new TreeSet<>();
        
        //insere na ordem 
        setTree.add("Jean");
        setTree.add("Lucas");
        setTree.add("Matheus");
        setTree.add("Marcos");
        setTree.add("Joao");
        System.out.println(setTree); 
        
        //remove um nome
        setTree.remove("Lucas");
        System.out.println(setTree);
        System.out.println("Removeu Lucas");
      
        //usando o iterator 
        Iterator<String> iterator = setTree.iterator();
        while(iterator.hasNext()){
              System.out.println(iterator.next());
        }

        //tentando adicionar elementos repetidos 
        setTree.add("Joao"); //não lança erro porem nao faz a adição 
        System.out.println(setTree);
        
        System.out.println("Topo da árvore: "+setTree.first());
        System.out.println("Ultimo elemento da árvore: "+setTree.last());
        System.out.println("Primeiro elemento abaixo de Marcos: "+setTree.lower("Marcos"));
        System.out.println("Primeiro elemento acima de Marcos: "+setTree.higher("Marcos"));
        
        //retorna e removendo
        System.out.println("Retornando e removendo o primeiro elemento: "+setTree.pollFirst());
        System.out.println("Retornando e removendo o último elemento: "+setTree.pollLast());   
        
        System.out.println(setTree);
       }
}
