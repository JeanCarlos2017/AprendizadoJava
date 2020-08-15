
package Streams_Collections.Set;



import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Jean
 */
public class Linked_Hash_Set {
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> setLinked = new LinkedHashSet<>();
        setLinked.add("Jean");
        setLinked.add("Lucas");
        setLinked.add("Matheus");
        setLinked.add("Marcos");
        setLinked.add("Joao");
        System.out.println(setLinked); //garante a ordem de inserção
        
        //remove um nome
        setLinked.remove("Lucas");
        System.out.println(setLinked);
        System.out.println("Removeu Lucas");
      
        //usando o iterator 
        Iterator<String> iterator = setLinked.iterator();
        while(iterator.hasNext()){
              System.out.println(iterator.next());
        }

        //tentando adicionar elementos repetidos 
        setLinked.add("Joao"); //não lança erro porem nao faz a adição 
        System.out.println(setLinked);
    }
     
}
