
package Streams_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;




/**
 *
 * @author Jean
 */
public class UsandoQueue {
   
    public static void main(String[] args) {
        // TODO code application logic here
        //usando filas
        String cabecaLista;
        Queue <String> fila = new LinkedList();
        fila.add("Jean");
        fila.add("Carlos");
        fila.add("Paula");
        fila.add("Ruth");
        fila.add("Samuel");
        fila.add("Leandro");
        
        System.out.println(fila);
        //retornando e removendo a cabeça da fila
        cabecaLista = fila.poll();
        System.out.println(cabecaLista);
        System.out.println(fila);
        
        //pegar a cabeça da lista sem fazer a remoção 
        System.out.println("\n\n");
        //fila.clear();
        cabecaLista = fila.peek();
        System.out.println(cabecaLista);
        System.out.println(fila);
        
        //pegar o cabeça da fila e se nao houver lançar um erro 
        //fila.clear();
        System.out.println("\n\n");
        cabecaLista = fila.element();
        System.out.println(cabecaLista);
        System.out.println(fila);
        
        //usando o iterator 
        System.out.println("\n\n");
        Iterator<String> iterator = fila.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}


