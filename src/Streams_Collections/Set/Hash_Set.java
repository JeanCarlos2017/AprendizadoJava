/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams_Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Jean
 */
public class Hash_Set {
    public static void main(String[] args) {
      Set<String> setList = new HashSet<>();
      
      //adiocionando nomes aleatórios 
      setList.add("Jean");
      setList.add("Lucas");
      setList.add("Matheus");
      setList.add("Marcos");
      setList.add("Joao");
      System.out.println(setList); //não garante a ordem de inserção 
      
      //remove um nome
      setList.remove("Jean");
      System.out.println(setList);
      System.out.println("Removeu Jean");
      
      //usando o iterator 
      Iterator<String> iterator = setList.iterator();
      while(iterator.hasNext()){
            System.out.println(iterator.next());
      }
      
      //tentando adicionar elementos repetidos 
      setList.add("Lucas"); //não lança erro porem nao faz a adição 
      System.out.println(setList);
        
    }
    
}
